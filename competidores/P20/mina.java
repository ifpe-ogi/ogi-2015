import java.util.*;
public class mina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int [][] bomb = new int [size][size];
		int [][] tab = new int [size][size];

		for(int i=0; i<bomb.length;i++){
			for(int x=0; x<bomb.length;x++){
				bomb[i][x]=sc.nextInt();
			}		
		}

		int quant = 0;

		for(int i=0; i<bomb.length;i++){
			for(int x=0; x<bomb.length;x++){
				if(bomb[i][x]==1){
					quant+=1;
				}
				if(i>0 && x>0 && bomb[i-1][x-1]==1){
					quant+=1;
				}
				if(i>0 && bomb[i-1][x]==1){
					quant+=1;
				}
				if(i>0 && x+1<bomb.length && bomb[i-1][x+1]==1){
					quant+=1;
				}
				if(x>0 && bomb[i][x-1]==1){
					quant+=1;
				}
				if(x+1<bomb.length && bomb[i][x+1]==1){
					quant+=1;
				}
				if(i+1<bomb.length && x>0 && bomb[i+1][x-1]==1){
					quant+=1;
				}
				if(i+1<bomb.length && bomb[i+1][x]==1){
					quant+=1;
				}
				if(i+1<bomb.length && x+1<bomb.length && bomb[i+1][x+1]==1){
					quant+=1;
				}
				tab[i][x]+=quant;
				quant=0;
			}
		}
		for(int i=0; i<bomb.length;i++){
			for(int x=0; x<bomb.length;x++){
				System.out.print(tab[i][x]+" ");
			}
			System.out.println();		
		}

	}
}