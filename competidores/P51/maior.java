import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t = new Scanner(System.in);
		Scanner t2 = new Scanner(System.in);

		String linha = t.nextLine();

		int r1 = 0;
		int r2 = 0;

		int n1 = Integer.parseInt(linha.split(" ")[0]);
		String op1 = String.valueOf(linha.split(" ")[1]);
		int n2 = Integer.parseInt(linha.split(" ")[2]);
		int n3 = Integer.parseInt(linha.split(" ")[3]);
		String op2 = String.valueOf(linha.split(" ")[4]);
		int n4 = Integer.parseInt(linha.split(" ")[5]);
		
		if(op1.equals("+")){
			r1 = n1 + n2;
		}
		if(op1.equals("x")){
			r1 = n1 * n2;
		}
		if(op1.equals("^")){
			r1 = (int)Math.pow(n1, n2);
		}
		
//		2
		
		if(op2.equals("+")){
			r2 = n3 + n4;
		}
		if(op2.equals("x")){
			r2 = n3 * n4;
		}
		if(op2.equals("^")){
			r2 = (int)Math.pow(n3, n4);
		}
		
		if(r1 > r2){
			System.out.println(">");
		}
		if(r1 < r2){
			System.out.println("<");
		}
		if(r1 == r2){
			System.out.println("=");
		}
		
		

		
	}

}
