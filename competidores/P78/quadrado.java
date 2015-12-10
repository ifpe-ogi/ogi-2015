import java.util.Scanner;
public class quadrado {
	
	public static void main(String[] args) {
		
	Scanner tcla= new Scanner ( System.in);
int A =  tcla.nextInt();
int B =tcla.nextInt();
int C=tcla.nextInt() ;
int D =tcla.nextInt();
int E =tcla.nextInt();
int F= tcla.nextInt();
int G= tcla.nextInt();
int H = tcla.nextInt();
int I= A+B+C+D+E+F+G+H; 
if ( I%4 == 0 ){
	System.out.println( "S");
}
	else {
		System.out.println( "N");
}
	}

}

