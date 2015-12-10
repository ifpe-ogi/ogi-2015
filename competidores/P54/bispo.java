import java.util.Scanner;

public class bispo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
		
		int r = -2;
		// se for a última linha
		if(x1 == y1 && y1 == x2 && x2 == y2 && y2 == 0) {
			break;
		} else
		// se estiver na mesma casa
		if(x1==x2 && y1==y2) {
			r = 0;
		} else 
		// se forem de cores opostas
	    if( x1 % 2 == y1 % 2 ^ x2 % 2 == y2 % 2 ) {
	    	r = -1;
	    } else
		// se estiverem na mesma diagonal
	    if (y2 - y1 == x2 - x1 || y1 - y2 == x1 - x2 || y2 - y1 == x1 - x2 || y1 - y2 == x2 - x1) { // tente resumir
	    	r = 1;
	    } else
		// se não.. 2 
		    r = 2;
		System.out.println(r);
		}
		scan.close();
		
	}

}
