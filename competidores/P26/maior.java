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
public class maior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int n1 , n2 , n3 ,n4 , cont1 =0 , cont2 =0;
        char op1 , op2;
        n1 = in.nextInt();
         op1 = in.next().charAt(0);
         n2 = in.nextInt();
          n3 = in.nextInt();
           op2 = in.next().charAt(0);
           n4 = in.nextInt();
          
            
            if(op1 == '+'){
                cont1 = n1 + n2;
            }else if(op1 == 'x'){
                cont1 = n1 *n2;
            }else if(op1 == '^'){
                for(int i = 1 ; i< n2 ;i++){
                    cont1 = n1*n1;
                    System.out.println(cont1);
                }
            } if(op2 == '+'){
                cont2 = n3 + n4;
                System.out.println(cont2);
            }else if(op2 == 'x'){
                cont2 = n3 *n4;
            }else if(op2 == '^'){
                cont2 = n3 *n4;
    }if(cont1 > cont2){
        System.out.println(">");
    }if(cont1 < cont2){
        System.out.println("<");
    }if(cont1 == cont2){
        System.out.println("=");
    }
    
}
}
