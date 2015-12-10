import java.util.Scanner;

public class maior {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
       int  N1, N2, N3, N4;
       String OP1="", OP2="";
       
       N1 = in.nextInt();
       OP1.charAt(0);  
       N2 = in.nextInt();
       N3 = in.nextInt();
       OP2.charAt(0);
       N4 = in.nextInt();
       int total1=0;
       int total2=0; 
       
       if(OP1 == "+"){
         total1 = N1 + N2;
       }
       if(OP1 == "*"){
          total1 = N1 + N2;
       }
      
       if(OP2 == "+"){
         total2 = N3 + N4;
       }
       if(OP2 == "*"){
         total2 = N3 + N4;
       }
      
         if(total1 > total2){
         System.out.println(">");
         }
         if(total1 < total2){
         System.out.println("<");
         }
         if(total1 == total2){
         System.out.println("=");
         }
         
    }
}
