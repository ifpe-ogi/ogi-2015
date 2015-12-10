/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ogi
 */
public class moda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        
        while(in.hasNext()){
           
        
        
        
        int n = 0 , resultado  = 0;
          n = in.nextInt();
        int [] nota = new int[n];
   
      
        for(int i = 0 ; i < n ; i++){
            nota[i] = in.nextInt();
        }
          for(int j = 0 ; j < n ; j++){
            for(int l = 1+j ; l < (n-1); l++){
               if(nota[j ] == nota[l ]){
                  nota[j] = 0;
                    System.out.println(resultado);
               }
    }
          }
               for(int m= 0 ; m< n ; m++){
                   if(nota[m] != 0 ){
                       resultado = resultado + nota[m];
                   }
               }
               System.out.println(resultado);
    }
}
          

}
