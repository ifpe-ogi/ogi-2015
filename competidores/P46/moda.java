import java.util.ArrayList;
import java.util.Scanner;

public class moda {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		while(sc.hasNext()){
			int n =sc.nextInt();
			int notas[]=new int[n];
			int notasRepetidas[]=new int[n];

			for (int i = 0; i < notas.length; i++) {
				notas[i] =sc.nextInt();
				for (int j = 0; j < i; j++) {
					if(notas[i]==notas[j]){
						notasRepetidas[j]++;
					}
				}
			}

			ArrayList<Integer> indice = new ArrayList<Integer>();

			int maior=0;
			for (int i = 0; i < notasRepetidas.length; i++) {
				if(notasRepetidas[i]>maior){
					maior=notasRepetidas[i];
				}
			}

			for (int i = 0; i < notasRepetidas.length; i++) {
				if(maior== notasRepetidas[i] && !indice.contains(notas[i])){
					indice.add(notas[i]);
				}
			}

			int soma =0;

			for (int i = 0; i < notasRepetidas.length; i++) {
				if(maior==0){
					soma+=notas[i];
				}else if(maior>notasRepetidas[i] && !indice.contains(notas[i])){
					soma+=notas[i];
				}
			}

			System.out.println(soma);
			sc.close();
		}
	}

}
