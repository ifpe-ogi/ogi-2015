import java.util.Scanner;
public class moda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int [] lista = new int [a];
			int resultado = 0;
			for (int i = 0; i < a; i++) {
				lista[i]=sc.nextInt();
			}
			int [] lista2 = new int [a];
			a=-1;
			int maior=2;
			for (int i = 0; i < lista.length; i++) {
				for (int j = 0; j < lista2.length; j++) {
					if(lista[i]==lista[j]){
						lista2[i]++;
					}
				}
				if(lista2[i]>maior){
					maior=lista[i];
				}
			}
			for (int i = 0; i < lista2.length; i++) {
				if(lista2[i]<maior){
					resultado+=lista[i];
				}
			}
			System.out.println(resultado);			
		}
	}
}