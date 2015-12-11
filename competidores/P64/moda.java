import java.util.Arrays;
import java.util.Scanner;


public class moda {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		while(sc.hasNext()){
			
			int array [] = new int [2001];

			int entrada [] = new int [sc.nextInt()];
			int maior = -1001;
			int pos = 0;
			int soma = 0;

			for (int i = 0; i < entrada.length; i++) {
				entrada[i] = sc.nextInt();
				array[entrada[i] + 1000]++;
			}

			for (int i = 0; i < array.length; i++) {
				if(maior < array[i]){
					maior = array[i]; // qtdd repetição
					pos = i - 1000; // numero que é a moda
				}
			}

			for (int i = 0; i < array.length; i++) {
				if(array[i] != maior && array[i] != 0){
					soma += i - 1000;
				}
			}


			if(soma == 0){
				for (int i = 0; i < entrada.length; i++) {
					soma += entrada[i];
				}
			}


			System.out.println(soma);

		}
	}

}
