import java.util.Scanner;
public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		String b = teclado.next();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		String e = teclado.next();
		int f = teclado.nextInt();

		if(b.equals("^")){
			b.equals(Math.pow(a, c));
		}else if(b.equals("x")){
			b.equals(a*c);
		}else if(b.equals("+")){
			b.equals(a+c);
		}
		
		if(e.equals("^")){
			e.equals(Math.pow(d, f));
		}else if(e.equals("x")){
			e.equals(d*f);
		}else if(e.equals("+")){
			e.equals(d+f);
		}
		
		if((Math.pow(a, c))>(Math.pow(d, f))){
			System.out.println(">");
		}else if((Math.pow(a, c))<(Math.pow(d, f))){
			System.out.println("<");
		}else if((Math.pow(a, c))==(Math.pow(d, f))){
			System.out.println("=");
		
		}else if((Math.pow(a, c))>(d*f)){
			System.out.println(">");
		}else if((Math.pow(a, c))<(d*f)){
			System.out.println("<");
		}else if((Math.pow(a, c))==(d*f)){
			System.out.println("=");
			
		}else if((Math.pow(a, c))>(d+f)){
			System.out.println(">");
		}else if((Math.pow(a, c))<(d+f)){
			System.out.println("<");
		}else if((Math.pow(a, c))==(d+f)){
			System.out.println("=");
			
		}else if((a*c)>(Math.pow(d, f))){
			System.out.println(">");
		}else if((a*c)<(Math.pow(d, f))){
			System.out.println("<");
		}else if((a*c)==(Math.pow(d, f))){
			System.out.println("=");
			
		}else if((a*c)>(d*f)){
			System.out.println(">");
		}else if((a*c)<(d*f)){
			System.out.println("<");
		}else if((a*c)==(d*f)){
			System.out.println("=");
			
		}else if((a*c)>(d+f)){
			System.out.println(">");
		}else if((a*c)<(d+f)){
			System.out.println("<");
		}else if((a*c)==(d+f)){
			System.out.println("=");
			
		}else if((a+c)>(Math.pow(d, f))){
			System.out.println(">");
		}else if((a+c)<(Math.pow(d, f))){
			System.out.println("<");
		}else if((a+c)==(Math.pow(d, f))){
			System.out.println("=");
			
		}else if((a+c)>(d*f)){
			System.out.println(">");
		}else if((a+c)<(d*f)){
			System.out.println("<");
		}else if((a+c)==(d*f)){
			System.out.println("=");
			
		}else if((a+c)>(d+f)){
			System.out.println(">");
		}else if((a+c)<(d+f)){
			System.out.println("<");
		}else if((a+c)==(d+f)){
			System.out.println("=");
		}
		
	}
}