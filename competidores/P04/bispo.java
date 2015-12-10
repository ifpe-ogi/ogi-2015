import java.util.Scanner;

public class bispo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1;
		while ((x1 = sc.nextInt()) != 0) {
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int res = -1;

			if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
				res = 1;
			} else if ((Math.abs(x2 - x1) % 2 == 0)
					&& (Math.abs(y2 - y1) % 2 == 0)
					|| (Math.abs(x2 - x1) % 2 != 0)
					&& (Math.abs(y2 - y1) % 2 != 0)) {
				res = 2;
			}

			System.out.println(res);

		}
		sc.close();
	}

}
