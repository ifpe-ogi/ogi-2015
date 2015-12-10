import java.util.Scanner;



public class moda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String arm = " 0";
		while(teclado.hasNext()){
			int N = teclado.nextInt();
			for(int x = 0; x<N ;x++){
				String y = teclado.next();
				String d = y + arm;
				arm = y;
				System.out.println(d);

			}
		}


	}

}


