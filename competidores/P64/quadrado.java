import java.util.Scanner;


public class quadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	
		int x1 = sc.nextInt(), y1 = sc.nextInt(),x2 = sc.nextInt(), y2 = sc.nextInt(),
			x3 = sc.nextInt(), y3 = sc.nextInt(),x4 = sc.nextInt(), y4 = sc.nextInt();
		
		if((x1== x2 & y1 == y2 & x3 == y4 & x4 == y3) 
			| (x3== x2 & y3 == y2 & x1 == y4 & x4 == y1)|
			(x2 == y2  & x3 == y3 & x4 == y1 & x1 == y4)|
			(x2 == y2  & x3 == y3 & x4 == y2 & x2 == y4)|
			(x1 == y1 & x2 == y2 & x3 == y4 & x4 == y3) |
			(x1 == y1 & x2 == y2 & y3 == x4 + y4)
			){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
	}

}
