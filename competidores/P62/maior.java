import java.util.Scanner;


public class maior {

	public static void main(String[] args) {

		Scanner t=new Scanner(System.in);
		
		int n1,n2,n3,n4,result1 = 0,result2 = 0;
		String op1=" ",op2=" ";
		
		n1=t.nextInt();
		op1=t.next();
		n2=t.nextInt();
		
		n3=t.nextInt();
		op2=t.next();
		n4=t.nextInt();
		
		if(op1.equalsIgnoreCase("+")){
			result1=n1+n2;
		}if(op1.equalsIgnoreCase("x")){
			result1=n1*n2;
		}if(op1.equalsIgnoreCase("^")){
			result1=(int) Math.pow(n1, n2);
		}if(op2.equalsIgnoreCase("+")){
			result2=n3+n4;
		}if(op2.equalsIgnoreCase("x")){
			result2=n3*n4;
		}if(op2.equalsIgnoreCase("^")){
			result2=(int) Math.pow(n3, n4);
		}
		
		
		if(result1>result2){
			System.out.println(">");
		}else if(result1<result2){
			System.out.println("<");
		}else{
			System.out.println("=");
		}
		
	t.close();
		
	}

}
