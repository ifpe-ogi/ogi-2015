import java.util.Scanner;

public class moda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t = new Scanner(System.in);

		while (true) {

			String linha1 = t.nextLine();
			String linha2 = t.nextLine();
			int n = Integer.parseInt(linha1.split(" ")[0]);
			int[] vetor = new int[n];
			int acumula = 0;
			int para = 0;
			int aux = 0;
			int conta = 0, conta2 = 0;
			int aux2 = 0;
			int resultado = 0;

			for (int x = 0; x < n; x++) {
				vetor[x] = Integer.parseInt(linha2.split(" ")[x]);
				acumula += vetor[x];
			}

			while (true) {

				if (para == n) {
					System.out.println(resultado);
					System.out.println(acumula);
					break;
				}
				
				aux =vetor[para];

				for (int x = 0; x < vetor.length; x++) {
					if (aux == vetor[x+1]) {
						conta += 1;
					}


					if (conta > 1) {
						if (conta > conta2) {
							resultado = conta * aux;
							conta2 = conta;
						}
					}
					
					System.out.println(conta2);

					para += 1;
					conta = 0;

				}
			}

		}

	}

}
