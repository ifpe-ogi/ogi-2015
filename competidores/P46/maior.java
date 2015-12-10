import java.util.Scanner;

public class maior {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		//1
		int valor1 =sc.nextInt();
		String operador1 = sc.next();
		int valor2 =sc.nextInt();
		//2
		int valor3 =sc.nextInt();
		String operador2 = sc.next();
		int valor4 =sc.nextInt();

		int res1=0;
		int res2=0;

		if(operador1.equals("+")){
			res1=valor1+valor2;
		}else if(operador1.equals("x")){
			res1=valor1*valor2;
		}else{
			res1= (int) Math.pow(valor1, valor2);
		}

		if(operador2.equals("+")){
			res2=valor3+valor4;
		}else if(operador2.equals("x")){
			res2=valor3*valor4;
		}else{
			res2= (int) Math.pow(valor3, valor4);
		}

		if(res1>res2){
			System.out.println(">");
		}else if(res1<res2){
			System.out.println("<");
		}else{
			System.out.println("=");
		}

		sc.close();
	}

}
