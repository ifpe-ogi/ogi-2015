import java.util.*;
public class moda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){

			int v = sc.nextInt();
			int [] tab = new int[v];
			for(int i = 0; i<v;i++){
				tab[i]=sc.nextInt();
			}
			for(int i = 0; i<v;i++){
				for(int x = 0; x<v;x++){
					if(tab[i]==tab[x]&& i!=x){
						tab[i]=0;
						tab[x]=0;
					}
				}
			}
			int soma = 0;
			for(int i=0;i<tab.length;i++){
				soma+=tab[i];
			}
			System.out.println(soma);
		}
	}
}