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
public class quadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int x1,x2,x3,x4 , y1,y2,y3,y4 , cont1 ,cont2;
        
        x1 = in.nextInt();
         y1 = in.nextInt();
          x2 = in.nextInt();
           y2 = in.nextInt();
            x3 = in.nextInt();
             y3 = in.nextInt();
              x4 = in.nextInt();
               y4 = in.nextInt();
              
               cont1 = x1+ x2 +x3 +x4;
               cont2 = y1+y2+y3+y4;
               
               if(cont1 == cont2 ){
                   System.out.println("S");
               }if(cont1 !=cont2 && cont1 != 0 && cont2 != 0){
                   System.out.println("N");
               }if(cont1 == 0 && cont2 != 0){
                   System.out.println("S");
               }if(cont1 !=0 && cont2 == 0){
                   System.out.println("S");
               }
               
                
    }
    
}
