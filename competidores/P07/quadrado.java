/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class quadrado {

   
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
      
         int x1=0,x2=0,x3=0,x4=0,y1=0,y2=0,y3=0,y4=0,resu,quadrado;
         
         x1 = in.nextInt();
          y1 = in.nextInt();
           x2 = in.nextInt();
            y2 = in.nextInt();
             x3 = in.nextInt();
              y3 = in.nextInt();
               x4 = in.nextInt();
                 y4 = in.nextInt();
                 resu = x1+x2+x3+x4+y1+y2+y3+y4;
               quadrado = resu%2;
         if (quadrado == 0){
             System.out.println("S");
         }else{
             System.out.println("N");
         }
          
                 
              
    }
    
}
