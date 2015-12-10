import java.util.Scanner;


public class quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Questao completa

		Scanner t = new Scanner (System.in);
			int cont = 0;
			int [] v = new int [8];
			
			for(int py = 0; py < 8; py ++){
				v [py] = t.nextInt();
				if(v[py] == 0)
				cont ++;
			}
				if(cont < 4) System.out.println("S");
				else System.out.println("N");

	}

}
