import java.util.Arrays;
import java.util.Scanner;


public class mina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [][] r = new int [n][n];
		for (int i = 0; i < r.length; i++) {
			Arrays.fill(r[i], 0);
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int e = scan.nextInt();
				if(e==1) {
					boolean cima = i-1 >= 0;
					boolean baixo = i+1 < n;
					boolean direita = j+1 < n;
					boolean esquerda = j-1 >= 0; 
					if(cima && esquerda) r[i-1][j-1]++;
					if(cima) r[i-1][j]++;
					if(cima && direita) r[i-1][j+1]++;
					
					if(esquerda) r[i][j-1]++;
					r[i][j]++;
					if(direita) r[i][j+1]++;
					
					if(baixo && esquerda) r[i+1][j-1]++;
					if(baixo) r[i+1][j]++;
					if(baixo && direita)r[i+1][j+1]++;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
