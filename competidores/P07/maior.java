/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.lang.Math;
public class maior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1,n2,n3,n4,resu1=0,resu2=0;
        char op1,op2;
        
        n1 = in.nextDouble();
        op1 = in.next().charAt(0);
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        op2 = in.next().charAt(0);
        n4 = in.nextDouble();
        
        if (op1 == 'x'){
            resu1 = n1*n2;
        }
         if (op1 == '+'){
            resu1 = n1+n2;
        }
          if (op1 == '^'){
            resu1 = Math.pow(n1, n2);
        }
          if (op2 == 'x'){
            resu2 = n3*n4;
        }
         if (op2 == '+'){
            resu2 = n3+n4;
        }
          if (op2 == '^'){
            resu2 = Math.pow(n3, n4);
          
          }
          
          if (resu1 > resu2){
             System.out.println(">"); 
          }
          else if (resu1 < resu2){
              System.out.println("<"); 
          }
          else if (resu1 == resu2){
             System.out.println("="); 
          }
          
        
    }
    
}
