import java.util.Arrays;

import java.util.Scanner;

public class moda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] nota = new int[n];
			int[] qtd = new int[n];

			for (int i = 0; i < n; i++) {
				nota[i] = sc.nextInt();
			}

			Arrays.sort(nota);

			int m = 0;

			// Qtas vezes cada um aparece
			for (int i = 0; i < n - 1; i++) {
				if (nota[i] == nota[i + 1]) {
					m++;
					if (i + 1 == n - 1) {
						qtd[i] = m;
						m = 0;
					}
				} else {
					qtd[i - m] = m;
					m = 0;
				}

			}


			int maior = 0;
			int num = 0;

			for (int i = 0; i < n; i++) {
				if (qtd[i] > maior) {
					maior = qtd[i];
					num = nota[i];
				}
			}

			int[] a = new int[n];
			boolean dif = false;

			for (int i = 0; i < n - 1; i++) {
				if (qtd[i] != qtd[i + 1]) {
					dif = true;
				}
			}

			for (int i = 0; i < n; i++) {
				if (qtd[i] == maior) {
					a[i] = nota[i];
				}
			}
		
			boolean aux = false;
			int res = 0;
			for (int i = 0; i < n; i++) {
				if (dif == false) {
					res += nota[i];
				} else {
					for (int j = 0; j < n; j++) {
						if (nota[i] == num || nota[i] == a[j]) {
							aux = true;
						}
					}
					if (aux == false) {
						res += nota[i];
					}
					aux = false;
				}

			}

			System.out.println(res);
			// for(int i = 0; i<n;)

		}
	}

}
