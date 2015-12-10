import java.util.Scanner;


public class maior {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//expressão 1
		int N1 = sc.nextInt();
		String OP1 = sc.next();
		int N2 = sc.nextInt();
		double resol1 = 0;
		//expressão 2
		int N3 = sc.nextInt();
		String OP2 = sc.next();
		int N4 = sc.nextInt();
		double resol2 = 0;
		
		if(OP1.equals("+")){
			resol1 = N1+N2;
		}else if(OP1.equals("x")){
			resol1 = N1*N2;
		}else if(OP1.equals("^")){
			resol1 = Math.pow(N1, N2);
		}
		if(OP2.equals("+")){
			resol2 = N3+N4;
		}else if(OP2.equals("x")){
			resol2 = N3*N4;
		}else if(OP2.equals("^")){
			resol2 = Math.pow(N3, N4);
		}
		if(resol1 > resol2){
			System.out.println(">");
		}else if(resol1<resol2){
			System.out.println("<");
		}else if(resol1==resol2){
			System.out.println("=");
		}
	}

}
