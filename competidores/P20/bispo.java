import java.util.*;
public class bispo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){

			int x1=sc.nextInt()-1;
			int y1=sc.nextInt()-1;
			int x2=sc.nextInt()-1;
			int y2=sc.nextInt()-1;

			if(x1!=-1 && y1!=-1 && x2!=-1 && y2!=-1){

				if(x1!=x2 && y1!=y2){
					int[][]tab = new int[8][8];

					for(int i=0;i<tab.length;i++){
						for(int x=0;x<tab.length;x++){
							if(x%2==0 && i%2==0){
								tab[i][x]=1;
							}else if(x%2!=0 && i%2!=0){
								tab[i][x]=1;
							}
						}
					}
					int px = x1;
					int py = y1;
					int nx = x1;
					int ny = y1;
					int boll = 0;

					for(int x=0;x<tab.length;x++){
						if(x2+y2==x1+y1){
							System.out.println("1");
							boll = 1;
							break;
						}else if(nx-->=0 && ny-->=0 && nx==x2 && ny==y2){
							System.out.println("1");
							boll = 1;
							break;
						}else if(px++<tab.length && py++<tab.length && px==x2 && py==y2){
							System.out.println("1");
							boll = 1;
							break;
						}
					}

					if(tab[x2][y2]==tab[x1][y1] && boll!=1){
						System.out.println("2");
					}else if(boll!=1){
						System.out.println("-1");
					}

				}else{
					System.out.println("0");
				}

			}else{
				sc.close();
				break;
			}
		}
	}
}