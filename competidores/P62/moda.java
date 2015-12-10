import java.util.Scanner;


public class moda {

	public static void main(String[] args) {

		Scanner t=new Scanner(System.in);
		int result = 0;
		
		
		int n=t.nextInt();
		

		int[]nota=new int[n];
		
		for (int i = 0; i < n; i++) {
			nota[i]=t.nextInt();
		}
		
	
				for (int i = 1; i < nota.length; i++) {
					int chave = nota[i];
					int j=i;
					
					while(j > 0 && nota[j - 1]>chave){
						nota[j]=nota[j-1];
						j--;
					}
					nota[j]=chave;
				}
	
				
			int x=1;	
	for (int i = 0; i < nota.length-1; i++) {
		
		while(x<n){
		if(nota[i]!=nota[x]);
		result+=nota[x];
		break;
		}
		x++;
	}
		
	System.out.println(result);
	}

}
