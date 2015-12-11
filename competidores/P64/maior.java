import java.util.Scanner;
public class maior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		String op = sc.next();
		int y = sc.nextInt();
		int x2 = sc.nextInt();
		String op2 = sc.next();
		int y2 = sc.nextInt();
		
		int resultado1 = 0, resultado2 = 0;
		
		if(op.equals("x")){
			resultado1 = x * y;
		}else if(op.equals("^")){
			resultado1 = (int)Math.pow(x, y);
		}else if(op.equals("+")){
			resultado1 = x + y;
		}
		
		if(op2.equals("x")){
			resultado2 = x2 * y2;
		}else if(op2.equals("^")){
			resultado2 = (int)Math.pow(x2, y2);
		}else if(op2.equals("+")){
			resultado2 = x2 + y2;
		}
		
		if(resultado1 == resultado2){
			System.out.println("=");
		}else{
			System.out.println(resultado1 > resultado2 ? ">" : "<");
		}
		
	}

}
