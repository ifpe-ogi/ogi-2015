import java.util.*;
public class maior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		String oper1 = sc.next();
		int num2 = sc.nextInt();
		int result1 = 0;

		int num3 = sc.nextInt();
		String oper2 = sc.next();
		int num4 = sc.nextInt();
		int result2 = 0;

		if(oper1.equals("x")){
			result1 = num1*num2;
		}else if(oper1.equals("^")){
			result1 = 1;
			for(int i=0;i<num2;i++){
				result1*=num1;
			}
		}else{
			result1=num1+num2;
		}

		if(oper2.equals("x")){
			result2 = num3*num4;
		}else if(oper2.equals("^")){
			result2=1;
			for(int i=0;i<num4;i++){
				result2*=num3;
			}
		}else{
			result2=num3+num4;
		}

		if(result1>result2){
			System.out.println(">");
		}else if(result1<result2){
			System.out.println("<");
		}else{
			System.out.println("=");
		}


	}
}