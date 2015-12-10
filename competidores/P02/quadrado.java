import java.util.Scanner;
public class quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		int e = teclado.nextInt();
		int f = teclado.nextInt();
		int g = teclado.nextInt();
		int h = teclado.nextInt();
		
		if((((e+f)-(a+b)) == ((g+h)-(c+d))) || (((g+h)-(a+b)) == ((e+f)-(c+d))) || 
				(((c+d)-(a+b)) == ((g+h)-(e+f)))){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
			
	}
}