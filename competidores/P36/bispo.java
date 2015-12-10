import java.util.Scanner;
public class bispo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		for (int p = 0; p < 100000000; p++) {
			int [][] tabuleiro= new int[8][8];
			int a =0;
			int z = 0;
			int b =0; 
			int x = 0;
			int y = 0;
			int conta=0;
			while(a <2){
				x= sc.nextInt();
				y = sc.nextInt();
				if(x==0){
					conta++;
				}if(y==0){
					conta++;
				}
				for (int i = 0; i < tabuleiro.length; i++) {
					for (int j = 0; j < tabuleiro.length; j++) {
						if(y-1==i && x-1==j){
							tabuleiro[i][j]=1;
						}
					}
				}
				a+=1;
			}
			if(conta==4){
				break;
			}
			a=-1;
			b=0;
			int contagem =0;
			//For da parte branca
			for (int u = 0; u < tabuleiro.length; u++) {
				a+=1;
				for (int i = b; i < tabuleiro.length; i++) {
					for (int j = a; j < tabuleiro.length; j+=2) {
						if(tabuleiro[i][j]==1){
							contagem++;
						}
					}
					if(a==0){
						a=1;
					}else{
						a=0;
					}
				}
				if(contagem==1){
					System.out.println(-1);
					break;
				}
			}	
			if(contagem!=1){
				contagem=0;
				int j = x-1;
				for (int i = y-2; i >= 0; i--) {

					j +=1;
					if(j!=x-1 && j<8 && i>=0){
						if(tabuleiro[i][j]==1){
							System.out.println(1);
							contagem++;
						}
					}
				}
				if(contagem!=1){
					j = x-1;
					for (int i = y-2; i >=0; i--) {

						j -=1;
						if(j!=x-1 && j>=0 && i >=0){
							if(tabuleiro[i][j]==1){
								System.out.println(1);
								contagem++;

							}
						}
					}
				} 
				if(contagem!=1){
					j = x-1;
					for (int i = y-2; i < tabuleiro.length; i++) {

						j +=1;
						if(j!=x-1 && j<8 && i>=0){
							if(tabuleiro[i][j]==1){
								System.out.println(1);
								contagem++;
							}
						}	
					}
				}
				if(contagem!=1){
					j = x-1;
					for (int i = y-2; i < tabuleiro.length; i++) {

						j -=1;
						if(j!=x-1 && j>=0 && i>=0){
							if(tabuleiro[i][j]==1){
								System.out.println(1);
								contagem++;
							}
						}
					}
				}
				if(contagem!=1){
					System.out.println(2);
				}
			}
		}
	}
}