import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1,n2,n3,n4;
		int valor1, valor2;
		String op1,op2;		
		String entrada;
		boolean erro;
		String[] parte;
		
		do{
			entrada = s.nextLine();
			parte = entrada.split(" ");

			n1 = Integer.parseInt(parte[0]);
			op1 = parte[1];
			n2 = Integer.parseInt(parte[2]);

			n3 = Integer.parseInt(parte[3]);
			op2 = parte[4];
			n4 = Integer.parseInt(parte[5]);
				
			if(n1 < 0 || n1 > 1000000){
				erro = true;
			}
			else if(n2 < 0 || n2 > 1000000){
				erro = true;
			}else if(n3 < 0 || n3 > 1000000){
				erro = true;
			}else if(n4 < 0 || n4 > 1000000){
				erro = true;
			}else if(op1.equals("+") == false && op1.equals("x") == false && op1.equals("^") == false){
				erro = true;
			}else if(op2.equals("+") == false && op2.equals("x") == false && op2.equals("^") == false){
				erro = true;
			}else{
				erro = false;
			}

		}while(erro);
		
		if(op1.equals("+")){
			valor1 = n1+n2;
		}else if(op1.equals("x")){
			valor1 = n1*n2;
		}else{
			valor1 = (int)Math.pow(n1, n2);
		}
		
		if(op2.equals("+")){
			valor2 = n3+n4;
		}else if(op2.equals("x")){
			valor2 = n3*n4;
		}else{
			valor2 = (int)Math.pow(n3, n4);
		}
		
		
		if(valor1 < valor2){
			System.out.println("<");
		}else if(valor1 > valor2){
			System.out.println(">");
		}if(valor1 == valor2){
			System.out.println("=");
		}
		
	}

}
