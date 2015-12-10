import java.util.Scanner;


public class quadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		if(Math.pow(x1-x2, 2)==Math.pow(x3-x4, 2) && Math.pow(y1-y2, 2)==Math.pow(y3-y4, 2)){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
		
	}

}
