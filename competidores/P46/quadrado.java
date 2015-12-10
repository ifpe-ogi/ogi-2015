import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		// vértice 1
		int a = sc.nextInt();
		int b = sc.nextInt();

		// vértice 2
		int c = sc.nextInt();
		int d = sc.nextInt();

		// vértice 3
		int e = sc.nextInt();
		int f = sc.nextInt();

		// vértice 4
		int g = sc.nextInt();
		int h = sc.nextInt();

		int A = a+b;
		int B = c+d;
		int C = e+f;
		int D = g+h;

		int AmenosB = Math.abs(A-B);
		int BmenosD = Math.abs(B-D);
		int DmenosC = Math.abs(D-C);
		int CmenosA = Math.abs(C-A);

		if(AmenosB== BmenosD && BmenosD== DmenosC && DmenosC==CmenosA){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
		sc.close();
	}

}
