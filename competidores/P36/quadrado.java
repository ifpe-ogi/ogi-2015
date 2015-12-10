import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int contagem = 0;
		int resultado1=0;
		int resultado2=0;
		int resultado3=0;
		int resultado4=0;
		int lista2[]= new int[4];
		
		
			int x= sc.nextInt();
			int y= sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			resultado1= Math.abs(x-a);
			lista2[0]=resultado1;
			resultado2=Math.abs(y-b);
			lista2[1]=resultado2;
			
			int u= sc.nextInt();
			int i= sc.nextInt();
			int o = sc.nextInt();
			int p = sc.nextInt();
			resultado3=Math.abs(u-o);
			lista2[2]=resultado3;
			resultado4=Math.abs(i-p);
			lista2[3]=resultado4;
			
			int lista[]=new int [2];
			if(resultado1!=resultado2 ){
				lista[0]=resultado1;
				lista[1]=resultado2;
			}else if(resultado1!=resultado3){
				lista[0]=resultado1;
				lista[1]=resultado3;
			}else{
				lista[0]=resultado1;
				lista[1]=resultado4;
			}
			
			
			for (int j = 0; j < lista2.length; j++) {
				if(lista2[j]!=lista[0] && lista2[j]!=lista[1]){
					System.out.println("N");
					contagem++;
					break;
				}
			}
			if(contagem!=1){
				System.out.println("S");
			}
			
		
		
		
		
		
		
	}
}