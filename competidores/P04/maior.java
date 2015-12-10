import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op1 = sc.next();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String op2 = sc.next();
		int d = sc.nextInt();
						
		int num1 = 0;
		int num2 = 0;
		
		if(op1.equals("+")){
			num1 = a+b;
		}else if(op1.equals("x")){
			num1 = a*b;
		}else if(op1.equals("^")){
			num1 = (int)Math.pow(a, b);
		}
				
		if(op2.equals("+")){
			num2 = c+d;
		}else if(op2.equals("x")){
			num2 = c*d;
		}else if(op2.equals("^")){
			num2 = (int)Math.pow(c, d);
		}
		
		if(num1>num2){
			System.out.println(">");
		}else if(num1<num2){
			System.out.println("<");
		}else{
			System.out.println("=");
		}
		
		sc.close();
	}

}
