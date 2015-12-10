import java.util.Scanner;


public class moda {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		
		int N = t.nextInt();
		int soma = 0;
		int[] moda = new int[N];
		while (t.hasNext());
		for (int i = 1;  i <= N; i++) {
			moda[i] = t.nextInt();
			if (moda[i] != moda[i+1] || moda[i] != moda[N]){
			 soma = soma + moda[i];
			}
		} System.out.println(soma);
		 t.close();
			
				
		
		
	}

}
