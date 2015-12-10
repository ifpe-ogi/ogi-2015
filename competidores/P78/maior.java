import java.util.Scanner;
public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcla= new Scanner ( System.in);
		int A =  tcla.nextInt();
		String B =tcla.next();
		int C=tcla.nextInt() ;
		int D =tcla.nextInt();
		String E =tcla.next();
		int F= tcla.nextInt();
		int G= A * C ;
		int H = D + F;
		int i= A * C;
	  if (B== "x" && E == "+" && G>= H){
		 System.out.println(">");
	  }
	  else if (B== "x" && E == "+" && G<= H){
		  System.out.println("<");
	}
	  else if (B=="^" && E == "x" && i<= G){
		  System.out.println("<");
	  }
	  else if (B=="^" && E == "x" && i>= G){
		  System.out.println(">");
	  }
	  else if (B=="+" && E == "x" || E== "^" && H <= G){
		  System.out.println("<");
	  }
	  else if (B=="+" && E == "x" || E== "^" && H>= G){
		  System.out.println("<");
	  
		
	}

}
}