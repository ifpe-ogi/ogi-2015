import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pos = new int[8];
		boolean res = false;

		for (int i = 0; i < 8; i++) {
			pos[i] = sc.nextInt();
		}

		if (pos[0] == pos[2] && pos[4] == pos[6] && pos[1] == pos[5]
				&& pos[3] == pos[7]) {

			res = true;
		} else {// inclinado
			int d1 = 0;
			int d2 = 0;
			// positivo ou negativo
			if (pos[0] < 0 && pos[4] > 0 || pos[7] < 0 && pos[3] > 0) {

				d1 = pos[0] + pos[4];
				d2 = Math.abs(pos[7]) + pos[3];
			} else {

				d1 = pos[4] - pos[0];
				d2 = pos[3] - pos[7];
			}
			// distâncias iguais
			if (d1 == d2 && pos[1] == pos[5]) {

				res = true;
			}
		}

		if (res == true) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

		sc.close();
	}

}
