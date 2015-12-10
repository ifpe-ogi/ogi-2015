import java.util.Scanner;
public class moda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] notas = new int[n];

			for(int i = 0;i<notas.length; i++){
				notas [i] = sc.nextInt();
			}

			int[] moda = new int[n];
			for(int i = 0;i<notas.length; i++){
				int rpt = 0;
				for(int j = 0;j<notas.length; j++){
					if(notas[i]==notas[j]){
						rpt++;
					}
				}
				moda[i]=rpt;
			}
			int mais = 0;
			for(int i = 0;i<moda.length; i++){
				if(mais<moda[i]){
					mais=moda[i];
				}
			}
			for(int i = 0;i<moda.length; i++){
				if(mais !=1 && mais==moda[i]){
					notas[i]=0;
				}
			}
			int soma = 0;
			for(int i = 0;i<moda.length; i++){
				soma += notas[i];
			}
			System.out.println(soma);
		}
	}
}