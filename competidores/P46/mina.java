import java.util.Scanner;

public class mina {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();

		int tabuleiro[][]= new int [n][n];

		for (int i = 0; i < tabuleiro.length; i++) 
			for (int j = 0; j < tabuleiro.length; j++) 
				tabuleiro[i][j]= sc.nextInt();



		int tabuleiroMinasVizinhas[][]= new int[n][n];

		for (int i = 0; i < tabuleiroMinasVizinhas.length; i++) {
			for (int j = 0; j < tabuleiroMinasVizinhas.length; j++) {
				if(tabuleiro[i][j]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(j!=0 && tabuleiro[i][j-1]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(j!=n-1 && tabuleiro[i][j+1]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(i!=0 && tabuleiro[i-1][j]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(i!=n-1 && tabuleiro[i+1][j]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(i!=n-1 && j!=n-1 && tabuleiro[i+1][j+1]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(i!=0 && j!=n-1 && tabuleiro[i-1][j+1]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(i!=0 && j!=0 && tabuleiro[i-1][j-1]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}
				if(i!=n-1 && j!=0 && tabuleiro[i+1][j-1]==1){
					tabuleiroMinasVizinhas[i][j]++;
				}	
			}
		}

		for (int i = 0; i < tabuleiroMinasVizinhas.length; i++) {
			for (int j = 0; j < tabuleiroMinasVizinhas.length; j++) {
				System.out.print(tabuleiroMinasVizinhas[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
