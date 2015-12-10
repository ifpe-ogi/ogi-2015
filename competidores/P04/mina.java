import java.util.Scanner;

public class mina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] campo = new int[n][n];
		int[][] res = new int[n][n];
		
		for(int i = 0; i< n;i++){
			for(int j = 0; j<n;j++){
				campo[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i< n;i++){
			for(int j = 0; j<n;j++){
				if(i!=0){
					if(campo[i-1][j]==1){
						res[i][j]+=1;
					}
					if(j!=0){
						if(campo[i-1][j-1]==1){
							res[i][j]+=1;
						}
					}
					if(j!=n-1){
						if(campo[i-1][j+1]==1){
							res[i][j]+=1;
						}
					}
				}
				
				if(j!=0){
					if(campo[i][j-1]==1){
						res[i][j]+=1;
					}
					if(i!=n-1){
						if(campo[i+1][j-1]==1){
							res[i][j]+=1;
						}
					}
				}
				
				if(campo[i][j]==1){
					res[i][j]+=1;
				}
				
				if(j!=n-1){
					if(campo[i][j+1]==1){
						res[i][j]+=1;
					}
					if(i!=n-1){
						if(campo[i+1][j+1]==1){
							res[i][j]+=1;
						}
					}
				}
				if(i!=n-1){
					if(campo[i+1][j]==1){
						res[i][j]+=1;
					}
				}
			}
		}
		
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
