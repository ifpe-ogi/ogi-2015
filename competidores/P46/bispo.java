import java.util.Scanner;

public class bispo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int xUm = sc.nextInt();
		int yUm = sc.nextInt();
		int xDois = sc.nextInt();
		int yDois = sc.nextInt();

		while(xUm+yDois+xDois+yUm!=0){
			int tabuleiro[][]= new int [9][9];
			tabuleiro[xUm][yUm]=1;
			tabuleiro[xDois][yDois]=2;

			if((xUm+yUm)%2 == 0 && (xDois+yDois)%2 !=0 ||(xUm+yUm)%2 != 0 && (xDois+yDois)%2 ==0 ){
				System.out.println("-1");
			}else{
				if(xUm-yUm == xDois-yDois){
					System.out.println("1");
				}else{
					System.out.println("2");
				}
			}

			xUm = sc.nextInt();
			yUm = sc.nextInt();
			xDois = sc.nextInt();
			yDois = sc.nextInt();
		}
		sc.close();
	}

}
