
import java.util.Scanner;
import java.util.TreeSet;

public class moda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println();

	
		Scanner t = new Scanner (System.in);
		int n = t.nextInt();
		int [] v = new int [n];
		int [] aux = new int [n];
		int soma = 0;
		
		for(int py = 0; py < v.length; py++)
			v[py] = t.nextInt();
					
		for(int py = 0; py < v.length; py++){
			
			int chave = v[py];
			int x = py;
			
			while(x > 0 && v[x - 1] > chave){
				v[x - 1] = v[x]; 
					x--;
			}
				chave = v[x];
		}
		
		for(int py = 1; py < v.length; py++){
			if(v[py - 1] != v[py]){
				soma = soma + v[py];
			}		
		} 	
			System.out.println(soma + v[0]);
	
	}
}
