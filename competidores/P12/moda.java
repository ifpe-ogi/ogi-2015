/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class moda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int tot, cont1=0, cont2=0, notas[];
        int soma=0, moda1=0, moda2=0, alt1=1001, alt2=-10001;
        
        tot = in.nextInt();
        notas = new int[tot];
        
        for(int i=0; i < tot; i++){
            notas[i] = in.nextInt();
            soma += notas[i];
        }
        for(int i=0; i < tot; i++){
            for(int j=i+1; j < tot; j++){                
                if(notas[i] == notas[j] && notas[j] != alt1){
                    alt2 = notas[i];
                    cont2++;
                    moda2 += notas[j];
                }
                if(notas[i] == notas[j] && notas[i] == alt1){
                    cont1++;
                    moda1 += notas[j];
                }
                if(notas[i] == notas[j] && notas[i] == alt2){
                    moda2 += notas[j];
                    cont2++;                    
                }
                if(notas[i] == notas[j]){
                    alt1 = notas[j];
                    moda1 += notas[i];
                }
            }
        }
        if(cont1 > cont2){
            System.out.println(soma - moda1);
        }
        else if(cont1 < cont2){
            System.out.println(soma - moda2);
        }
        else{
            System.out.println(soma - moda1 - moda2);
        }
    }
    
}
