import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		
		int x1 = t.nextInt();
		int y1 = t.nextInt();
		int x2 = t.nextInt();
		int y2 = t.nextInt();
		int x3 = t.nextInt();
		int y3 = t.nextInt();
		int x4 = t.nextInt();
		int y4 = t.nextInt();
		
		if(((x1 + y1 >= x2 -y2) && (x1 + y1 >= x3 -y3) && (x1 + y1 >= x4 -y4)) && 
				((x2 + y2 >= x1 -y1) &&  (x2 + y2 >= x3 -y3) &&  (x2 + y2 >= x4 -y4)) && (x3 + y3 >= x4 - y4)){
			System.out.println("S");
		}
		
		else{
			System.out.println("N");
		}

	}

}
