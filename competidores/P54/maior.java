import java.util.Scanner;


public class maior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long v1 = scan.nextLong();
		String op1 = scan.next();
		long v2 = scan.nextLong();
		long v3 = scan.nextLong();
		String op2 = scan.next();
		long v4 = scan.nextLong();
		
		long r1=-1,r2=-1;
		
		if("+".equals(op1)) {
			r1 = v1+v2;
		} else if("x".equals(op1)) {
			r1 = v1*v2;
		}
		
		if("+".equals(op2)) {
			r2 = v3+v4;
		} else if("x".equals(op2)) {
			r2 = v3*v4;
		}
		
		if(r1!=-1 && r2!=-1) {
			if(r1 < r2) {
				System.out.println("<");
			} else if(r1 > r2) {
				System.out.println(">");
			} else {
				System.out.println("=");
			}
		} else {
			// se tiver alguma exponenciacao		
			long base1 = v1;
			long expo1 = v2;
			long base2 = v3;
			long expo2 = v4;
			

			if(r1!=-1) {
				expo1 = 1;
				base1 = r1;
			}
			
			if(r2!=-1) {
				expo2 = 1;
				base2 = r2;
			}
			
			double l1 = expo1 * ( Math.log(base1));
			double l2 = expo2 * ( Math.log(base2)); 
			
			if(l1 < l2) {
				System.out.println("<");
			} else if(l1 > l2) {
				System.out.println(">");
			} else {
				System.out.println("=");
			}
			
		}
		
		
	}

}
