import java.util.Scanner;


public class quadrado {

	public static void main(String[] args) {

		Scanner teclado =  new Scanner (System.in);

		int X1 = teclado.nextInt();
		int Y1 = teclado.nextInt();

		int X2 = teclado.nextInt();
		int Y2 = teclado.nextInt();

		int X3 = teclado.nextInt();
		int Y3 = teclado.nextInt();

		int X4 = teclado.nextInt();
		int Y4 = teclado.nextInt();

		if(Y1+Y2 == Y3 + Y4 && X1 == X2 && X3==X4){
			System.out.println("S");
		}else{
			System.out.println("N");

		}

	}

}
