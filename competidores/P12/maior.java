import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1, n2, n3, n4;
        char op1, op2;
        double exp1=0, exp2=0;
        
        n1 = in.nextInt();
        op1 = in.next().charAt(0);
        n2 = in.nextInt();
        n3 = in.nextInt();
        op2 = in.next().charAt(0);
        n4 = in.nextInt();
        
        if(op1 == '+'){
            exp1 = n1 + n2;
        }
        else if(op1 == 'x'){
            exp1 = n1 * n2;
        }
        else if(op1 == '^'){
            exp1 = Math.pow(n1, n2);
        }
        if(op2 == '+'){
            exp2 = n3 + n4;
        }
        else if(op2 == 'x'){
            exp2 = n3 * n4;
        }
        else if(op2 == '^'){
            exp2 = Math.pow(n3, n4);
        }
        if(exp1 > exp2){
            System.out.println(">");
        }
        else if(exp1 < exp2){
            System.out.println("<");
        }
        else{
            System.out.println("=");
        }
    }
    
}
