import java.util.Scanner;


public class maior {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N1 = teclado.nextInt();
		String Op1 = teclado.next();
		int N2= teclado.nextInt();
		int Eq1=0;
		int N3 = teclado.nextInt();
		String Op2 = teclado.next();
		int N4= teclado.nextInt();
		int Eq2=0;
		if(Op1.equals("+")){
			Eq1 = N1 + N2;
		}
		if(Op1.equals("x")){
			Eq1 = N1 * N2;
		}
		if(Op1.equals("^")){
			int x =1;
			int y = N1;
			while(x<N2){
				Eq1 = y*N1;
				x++;
				y = Eq1;
			}
		}
		// System.out.println(Eq1);

		if(Op2.equals("+")){
			Eq2 = N3 + N4;
		}
		
		if(Op2.equals("x")){
			Eq2 = N3 * N4;
		}
		
		
		if(Op2.equals("^")){
			int x =1;
			int z = N3;
			while(x<N4){
				Eq2 = z*N3;
				x++;
				z = Eq2;
			}
		}
		// System.out.println(Eq2);

	
	
	if(Eq1>Eq2){
		System.out.println(">");
		}
	if(Eq1<Eq2){
		System.out.println("<");
		}
	if(Eq1==Eq2){
		System.out.println("=");
		}


	}

}


