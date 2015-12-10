import java.util.Scanner;


public class bispo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		
		int x1 = t.nextInt();
		int y1 = t.nextInt();
		int x2 = t.nextInt();
		int y2 = t.nextInt();
		int x = x1-y1;
		int y = x2-y2;
		int cont = 0;
		
		if (x-y == 0 || x-y == +-2) {
			cont = cont+1;
			System.out.println(cont);
	} 	else {
		System.out.println("-1");
	}
		t.close();
	} 
}
