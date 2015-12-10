/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class moda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,soma=0,cont=0;; 
        n = in.nextInt();
        int array [] = new int [n];
       
        
        while(in.hasNext()){
        array[cont] = in.nextInt();
        cont++;
       
        }
       for(int i = 0 ; i < (array.length-1); i++){
           if (array[i] == array[i+1]){
               array[i] = 0;
           }
       }
       for(int i = 0 ; i < (array.length-1); i++){
           if (array[i] != 0){
               System.out.println(array[i]);
           }
       }
    
}
}
