import java.util.Scanner;
public class moda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		while(teclado.hasNext()){
		
		int a = teclado.nextInt();
		int [] lista = new int [a];
		int quant = 0;
		int soma = 0;
		
		for(int i = 0;i<lista.length;i++){
			lista[i] = teclado.nextInt();
		}
		for(int i = 0;i<lista.length;i++){
			soma += lista[i];
		}
		for(int i = 0;i<lista.length-1;i++){
			for(int x = i+1;x<lista.length;x++){
				if(lista[i] == lista[x]){
					quant+=lista[i]+lista[x];
				}
			}
		}
		System.out.println(soma-=quant);
		}
	}
}