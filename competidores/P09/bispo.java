import java.util.Scanner;

public class bispo {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int tabuleiro[][]= new int [8][8];
		int valor [] = new int [4];
		int a = 0 ;
		while (tc.hasNext()) {
			for (int i = 0; i < valor.length; i++) {
				valor [i] = tc.nextInt();
			}
			if (valor[0]==0 && valor[1]==0 ) {
				break;
			}
			else if (valor[0]+valor[1]==valor[2]+valor[3]) {
				System.out.println("1");
				a=1;
			}
			else if ((valor[0]+valor[1])%2!=0 && (valor[2]+valor[3])%2!=0 && valor[0]<valor[1] 
					&& valor[2]<valor[3]) {
				System.out.println("1");
				a=1;
			}
			else if ((valor[0]+valor[1])%2!=0 && (valor[2]+valor[3])%2!=0 && valor[0]>valor[1] 
					&& valor[2]>valor[3]) {
				System.out.println("1");
				a=1;
			}
			else if ((valor[0]+valor[1])%2==0 && (valor[2]+valor[3])%2==0 && valor[0]==valor[1] 
					&& valor[2]==valor[3]) {
				System.out.println("1");
				a=1;
			}
			if ((valor[0]+valor[1])%2==0) {
				if ((valor[2]+valor[3])%2!=0 ) {
					System.out.println("-1");
					a=1;
				}
			}
			else if ((valor[0]+valor[1])%2!=0 && (valor[2]+valor[3])%2==0) {
				System.out.println("-1");
				a=1;
			}
			else if ((valor[0]+valor[1])%2==0) {
				if (valor[2]==valor[1]||valor[3]==valor[0]) {
					System.out.println("2");
					a=1;
				}
			}
			if (a==0) {
				System.out.println("2");
			}

		}


	}
}




