import java.util.Scanner;


public class bispo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcla= new Scanner ( System.in);
		
		
			int A =  tcla.nextInt();
		
		int B =tcla.nextInt();
		int C=tcla.nextInt() ;
		int D =tcla.nextInt();
        int E= B+C;
		int F = A+D+B+C-E ;
				
		if(A+D == B+C){
		System.out.println("1");
		}
		else if (A+B > C+D){
		System.out.println("-1");	
		}
		else if (A+B < C+D){
			System.out.println("-1");	
			}
		else if ( A+ D > B+C){
			System.out.println(F);
	}
	
	
	
		
}
	
}

	

