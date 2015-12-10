import java.util.Scanner;
public class maior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String op1 = sc.next();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		String op2 = sc.next();
		int n4 = sc.nextInt();
		
		int result1 = 0;
		int result2 = 0;
		
		if(op1.equals("x")){
			result1 = n1*n2;
		}else if(op1.equals("^")){
			result1 = (int) Math.pow(n1, n2);
		}else if(op1.equals("+")){
			result1 = n1+n2;
		}
		
		if(op2.equals("x")){
			result2 = n3*n4;
		}else if(op2.equals("^")){
			result2 = (int) Math.pow(n3, n4);
		}else if(op2.equals("+")){
			result2 = n3+n4;
		}
		
		if (result1>result2){
			System.out.println(">");
		}else if (result1<result2){
			System.out.println("<");
		}else if (result1==result2){
			System.out.println("=");
		}
	}
}