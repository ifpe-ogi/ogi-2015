#!/bin/bash

# Programas
JAVAC=$(which javac)
JAVA=$(which java)
CC=$(which gcc)
CPP=$(which g++)
CMP=$(which cmp)
PYTHON=$(which python)
TIMEOUT=$(which timeout)


# Configurações
TEMPO=3s
DIR_TESTES=casos-de-testes
DIR_COMPETIDORES=competidores
SUMARIO=sumario-ogi-2015.log

# Redirecionar a execução para um arquivo de log
#exec > >(tee -i $SUMARIO)

COMPETIDORES=$(find $DIR_COMPETIDORES -maxdepth 1 -mindepth 1 -type d -printf '%f\n' | sort)
QUESTOES=$(find $DIR_TESTES -maxdepth 1 -mindepth 1 -type d -printf '%f\n' | sort)

# Execute um determinado comando em no máximo $TEMPO
execute() {
    $TIMEOUT $TEMPO "$@"
}


avaliacao() {
    for c in $COMPETIDORES; do
        echo "Analisando as respostas do competidor '$c'... "
        dir_competidor=$DIR_COMPETIDORES/$c
        pontuacao_total=0

        for q in $QUESTOES; do
            questao_atual=$dir_competidor/$q
            pontuacao_nivel=0
            pontuacao_nivel_possivel=0

            if [[ ! -f $questao_atual.java && ! -f $questao_atual.c && ! -f $questao_atual.cpp && ! -f $questao_atual.py ]]; then
                echo "Não existe o arquivo $questao_atual"
                continue
            fi

    	    NIVEIS=$(find $DIR_TESTES/$q -maxdepth 1 -mindepth 1 -type d -printf '%f\n' | sort)

            if [ -f $questao_atual.java ]; then
                $JAVAC -encoding ISO-8859-1 $questao_atual.java
            elif [ -f $questao_atual.c ]; then
                $CC $questao_atual.c -o $questao_atual -lm
            elif [ -f $questao_atual.cpp ]; then
                $CPP $questao_atual.cpp -o $questao_atual -lm
            fi

            for n in $NIVEIS; do
    		    ENTRADAS=$(find $DIR_TESTES/$q/$n -name "in*.txt" -type f -printf '%f\n' | sort)
                resultado_final=$dir_competidor/resultado-final-$c.log
                pontuacao_nivel_possivel=$(($pontuacao_nivel_possivel + 25))
                computar_pontuacao=true

                for e in $ENTRADAS; do
                    s=$(echo $e | sed 's/in/out/')
                    i=$(echo $s | cut -d. -f1)
                    teste_atual=$DIR_TESTES/$q/$n/$e
                    saida_atual=$DIR_TESTES/$q/$n/$s
                    result_atual=$dir_competidor/resultado-$c-$q-$n-$i.log

                    if [ -f $questao_atual.java ]; then
                        execute $JAVA -classpath $dir_competidor $q < $teste_atual > $result_atual
                    elif [ -f $questao_atual.c ]; then
                        execute $questao_atual < $teste_atual > $result_atual
                    elif [ -f $questao_atual.cpp ]; then
                        execute $questao_atual < $teste_atual > $result_atual
                    elif [ -f $questao_atual.py ]; then
                        execute $PYTHON $questao_atual.py < $teste_atual > $result_atual
                    fi

                    cat $result_atual | sed '/^$/d' | sed 's/^[ \t]*//' | sed 's/[[:blank:]]*$//' > $result_atual.limpo
                    mv $result_atual.limpo $result_atual
                    $CMP $result_atual $saida_atual >> $dir_competidor/cmp-result 2>&1

                    if [ ! -s $dir_competidor/cmp-result ]; then
                        echo "=> Questão $q, nível $n, entrada $e... [OK]"
    		            echo "=> Questão $q, nível $n, entrada $e... [OK]" >> $resultado_final
                    else
                        computar_pontuacao=false
                        teste=$(cat $teste_atual)
                        esperado=$(cat $saida_atual)
                        atual=$(cat $result_atual)

                        echo "=> Questão $q, nível $n, entrada $e... [FAIL]"

    		            echo "=> Questão $q, nível $n, entrada $e... [FAIL]" >> $resultado_final
                        echo "===> Teste executado:" >> $resultado_final
                        echo "$teste" >> $resultado_final
                        echo "===> Resultado esperado:" >> $resultado_final
                        echo "$esperado" >> $resultado_final
                        echo "===> Resultado atual:" >> $resultado_final
                        echo "$atual" >> $resultado_final
                    fi
    		    done

                #rm -f $dir_competidor/cmp-result $result_atual
                rm -f $dir_competidor/cmp-result

                if [ "$computar_pontuacao" = true ]; then
                    pontuacao_nivel=$(($pontuacao_nivel + 25))
                fi
    	    done

            echo "=> Questão $q, pontuação: $pontuacao_nivel de $pontuacao_nivel_possivel" >> $resultado_final
            pontuacao_total=$(($pontuacao_total + $pontuacao_nivel))
        done

        echo "pronto."
        echo "==> Competidor $c, pontuação total: $pontuacao_total" >> $SUMARIO
    done
}

limpar() {
    find . -type f \( -iname "*.class" -o -iname "*.log" -o -iname "*.o" -o -iname "*.exe" -o -iname "*.limpo" -o -iname "cmp-result" \) -exec rm -f {} \;
    find $DIR_COMPETIDORES -type f -executable -exec rm -f {} \;
}

# Main
case "$1" in
start)
    limpar
    avaliacao
    ;;

clean)
    limpar
    ;;
*)
    echo "Uso: $0 start|clean"
    echo -e "\tstart: iniciar a avaliação dos competidores"
    echo -e "\tclean: limpar os arquivos de compilação ou logs gerados"
    exit 1
    ;;
esac

exit 0
