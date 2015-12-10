import java.util.Scanner;

public class moda {
    
     public static void main(String[] args) {
    
       Scanner in = new Scanner(System.in);
         
        int n=0;
        int notas=0;
        
        n = in.nextInt();
        int r=0;      
        
        for(int i=0; i < n; i++){
          notas = in.nextInt();  
        }
        
         for(int i=0; i < n; i++){
          r = notas;  
         }
        
         
          System.out.println(r);
          
  }
}
