import java.util.Scanner;


public class mina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		int entrada [][] = new int [x+2][x+2];
		int matriz [][] = new int [x+2][x+2];
		
		
		for (int i = 1; i < entrada.length - 1; i++) {
			for (int j = 1; j < entrada.length - 1; j++) {
				entrada[i][j] = sc.nextInt();
				
				
			}
		}
		for (int i = 1; i < matriz.length -1 ; i++) {
			for (int j = 1; j < matriz.length -1; j++) {
				
				if(entrada[i-1][j-1] == 1){
					matriz[i][j]++;
				}
				
				if(entrada[i][j-1] == 1){
					matriz[i][j]++;
				}
				
				if(entrada[i-1][j] == 1){
					matriz[i][j]++;
				}
				
				if(entrada[i+1][j+1] == 1){
					matriz[i][j]++;
				}
				
				if(entrada[i][j+1] == 1){
					matriz[i][j]++;
				}
				
				if(entrada[i+1][j] == 1){
					matriz[i][j]++;
				}
				
				if(entrada[i+1][j-1] == 1){
					matriz[i][j]++;
				}
				
				if(entrada[i-1][j+1] == 1){
					matriz[i][j]++;
				}
				if(entrada[i][j] == 1){
					matriz[i][j]++;
				}System.out.print(matriz[i][j] + " ");
			}System.out.println();
		}
		
	}

}
