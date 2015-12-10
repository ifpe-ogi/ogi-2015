import java.text.DecimalFormat;
import java.util.Scanner;


public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questao completa
	System.out.println();	
	
		Scanner t = new Scanner (System.in);
		int n1 = t.nextInt();
		String op1 = t.next();
		int n2 = t.nextInt(); 
		int n3 = t.nextInt();
		String op2 = t.next();
		int n4 = t.nextInt();
		
		if(op1.equalsIgnoreCase("x") && op2.equalsIgnoreCase("+")){
			int x =  n1*n2;
			int y = n3+n4;
			if(x>y) System.out.println(">");
			else if(x<y) System.out.println("<");
			else if(x==y) System.out.println("=");
		}
		if(op1.equalsIgnoreCase("x") && op2.equalsIgnoreCase("^")){
			double x =  n1*n2;
			double y =  Math.pow(n3, n4);
			if(x>y) System.out.println(">");
			else if(x<y) System.out.println("<");
			else if(x==y) System.out.println("=");
	}

		if(op1.equalsIgnoreCase("+") && op2.equalsIgnoreCase("x")){
			int x =  n1+n2;
			int y =  n3*n4;
			if(x>y) System.out.println(">");
			else if(x<y) System.out.println("<");
			else if(x==y) System.out.println("=");
		}
		if(op1.equalsIgnoreCase("+") && op2.equalsIgnoreCase("^")){
			double x =  n1+n2;
			double y = Math.pow(n3, n4); 
			if(x>y) System.out.println(">");
			else if(x<y) System.out.println("<");
			else if(x==y) System.out.println("=");
		}
		if(op1.equalsIgnoreCase("^") && op2.equalsIgnoreCase("x")){
			double x = Math.pow(n1, n2);
			double y =  n3*n4;
			if(x>y)System.out.println(">");
			else if(x<y) System.out.println("<");
			else if(x==y) System.out.println("=");
		}
		if(op1.equalsIgnoreCase("^") && op2.equalsIgnoreCase("+")){
			double x = Math.pow(n1, n2);
			double y =  n3+n4;
			if(x>y)System.out.println(">");
			else if(x<y) System.out.println("<");
			else if(x==y) System.out.println("=");
		}
		}}
