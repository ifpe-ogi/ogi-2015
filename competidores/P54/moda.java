import java.util.ArrayList;
import java.util.Scanner;


public class moda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int n = scan.nextInt();
			int [] lista = new int [n];
			int [] repeticoes = new int [2001];
			int qtdmoda = 2;
			int sum = 0;
			ArrayList<Integer> mais_frequente = new ArrayList<>();
			for(int i=0;i<n;i++) {
				int e = scan.nextInt();
				
				lista[i] = e;
				repeticoes[e+1000]++;
				if(repeticoes[e+1000] > qtdmoda) {
					qtdmoda = repeticoes[e+1000];
					mais_frequente.clear();
					mais_frequente.add(e);
				} else if(repeticoes[e+1000] == qtdmoda) {
					mais_frequente.add(e);
				}
				
				sum += e;
				
			}
			
			for(int i=0;i<mais_frequente.size();i++) {
				sum -= mais_frequente.get(i) * qtdmoda;
			}
			System.out.println(sum);

		}
		scan.close();
	}

}
