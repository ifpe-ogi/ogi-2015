import java.util.Scanner;


public class mina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		int[][] mina = new int [N][N];
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				mina[i][j] = sc.nextInt();			
			}
		}	
		int copia [][] =  new int[N][N];
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
					copia[i][j]=mina[i][j];
			}
		}	
		if(N>1){
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					if(i == 0 && j == 0){
						copia[i][j]+= mina[i][j+1]+mina[i+1][j+1]+mina[i+1][j];
					}else if(i == 0 && j>0 && j<N-1){
						copia[i][j]+= mina[i][j-1]+mina[i+1][j-1]+mina[i+1][j]+mina[i+1][j+1]+mina[i][j+1];
					}else if(i==0 && j==N-1){
						copia[i][j]+=mina[i][j-1]+mina[i+1][j-1]+mina[i+1][j];
					}else if(j == 0 && i > 0 && i<N-1){
						copia[i][j]+= mina[i-1][j]+mina[i-1][j+1]+mina[i][j+1]+mina[i+1][j+1]+mina[i+1][j];
					}else if(i>0 && j > 0 && j < N-1 && i < N-1){
						copia[i][j] += mina[i-1][j-1]+mina[i-1][j]+mina[i-1][j+1]+mina[i][j+1]+mina[i+1][j+1]+mina[i+1][j]+mina[i+1][j-1]+mina[i][j-1];
					}else if(j==N-1 && i>0 && i<N-1){
						copia[i][j] += mina[i-1][j]+mina[i-1][j-1]+mina[i][j-1]+mina[i+1][j-1]+mina[i+1][j];
					}else if(i==N-1 && j==0){
						copia[i][j] += mina[i-1][j]+mina[i-1][j+1]+mina[i][j+1];
					}else if(i==N-1 && j>0 && j<N-1){
						copia[i][j] += mina[i][j-1]+mina[i-1][j-1]+mina[i-1][j]+mina[i-1][j+1]+mina[i][j+1];
					}else if(i==N-1 && j==N-1){
						copia[i][j] += mina[i][j-1]+mina[i-1][j-1]+mina[i-1][j];
					}
				}
			}
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					System.out.print(copia[i][j] + " ");
				}
				System.out.println();
			}
		}else if(N==1){
			System.out.println(mina[0][0]);
		}
	}

}
