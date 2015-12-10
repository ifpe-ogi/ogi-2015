import java.util.Scanner;




public class maior {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		/**System.out.println("Teste de entrada");
		String str = ler.nextLine();
		
		System.out.println("Teste de saida "+str+" Tamanho da string " + str.length());
		
		**/
		
		
		char op = 0;
		String str = "1 + 2 3 + 4";
		int a;
		//System.out.println(str.substring(0,1));
		//System.out.println(str.substring(8,9));
		char[] b = str.toCharArray();
		String str2 = b[4];
		
		System.out.println(a);
		/**
		String entrada = ler.nextLine();
		char op = entrada.charAt(2);
		//String op2 = "1 + 2";
		
		//int a = Integer.parseInt(op2);
		//int a = 0, b = 0, c = 0, d =0, e = 0
		int a =0, b =0, c = 0;
		switch(op){
		case '+':
			
			a = Integer.parseInt(entrada.substring(0,1));
			b = Integer.parseInt(entrada.substring(4));
			c =a+b;
			
			break;
		case 'x':
			a = Integer.parseInt(entrada.substring(0,1));
			b = Integer.parseInt(entrada.substring(4));
			c =a*b;
			break;
		case '^':
			a = Integer.parseInt(entrada.substring(0,1));
			b = Integer.parseInt(entrada.substring(4));
			int c1=1;
			for(int i = 0; i<b;i++){
				c1 = c1 * a; 
			}
				c = c1;
			break;
		default:
			break;
		
		
		}
		char op2 = entrada.charAt(8);
		int d = 0;
		switch(op){
		case '+':
			
			a = Integer.parseInt(entrada.substring(0,1));
			b = Integer.parseInt(entrada.substring(4));
			d =a+b;
			
			break;
		case 'x':
			a = Integer.parseInt(entrada.substring(0,1));
			b = Integer.parseInt(entrada.substring(4));
			d =a*b;
			break;
		case '^':
			a = Integer.parseInt(entrada.substring(0,1));
			b = Integer.parseInt(entrada.substring(4));
			int d1=1;
			for(int i = 0; i<b;i++){
				d1 = d1 * a; 
			}
				d = d1;
			break;
		default:
			break;
		
		
		}
		
		**/
	}

}
