import java.util.Scanner;

public class bispo {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();

		while (x1 != 0 ){
			if((x1 + y1 == x2 + y2) | (x1 - y1 == x2 - y2)){

				System.out.println(1);

			}else if((x1 + y1)%2 != (x2 + y2)%2 ){
				System.out.println(-1);
			}
			else{
				System.out.println(2);
			}
			x1 = sc.nextInt(); y1 = sc.nextInt(); x2 = sc.nextInt(); y2 = sc.nextInt();
		}
	}

}
