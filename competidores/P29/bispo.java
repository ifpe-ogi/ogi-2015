import java.util.Scanner;


public class bispo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		while (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0){
			if(x1 == y1 && x2 == y2){
				System.out.println(1);
			}else if(x1 - y1 == 1 && x2-y2==1){
				System.out.println(1);
			}else if(y1 - x1 == 1 && y2 - x2 == 1){
				System.out.println(1);
			}else if(x1+y1==x2+y2){
				System.out.println(1);
			}else if(x1-x2 ==1 && (y1+y2)%2==1){
				System.out.println(2);
			}else if(x2+y2==x1){
				System.out.println(2);
			}else if((x1+x2)%2==0 && (y1+y2)%2==0){
				System.out.println(2);
			}else if((x1+x2)%2==1 && (y1+y2)%2==1){
				System.out.println(2);
			}else{
				System.out.println(-1);
			}
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();	
					
		}
	}

}
