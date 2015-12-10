import java.util.Scanner;


public class quadrado {

	static int [][] val;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		val = new int [4][2];
		
		// (x1,y1) = val[0] vai ser o ponto inicial
		
		val[0][0] = scan.nextInt(); 
		val[0][1] = scan.nextInt();
		
		val[1][0] = scan.nextInt();
		val[1][1] = scan.nextInt();
		val[2][0] = scan.nextInt();
		val[2][1] = scan.nextInt();
		val[3][0] = scan.nextInt();
		val[3][1] = scan.nextInt();
		
		double [][] distancias  = new double[4][4];
		double pattern = 0; // deve ter algum padrao e nao pode ser 0
		// faça o calculo do primeiro manualmente
		for(int i=0;i<4;i++) {
			distancias[0][i] = dist(0, i);
		}
		
		if(distancias[0][1] == distancias[0][2] && distancias[0][1] != distancias[0][3]) {
			pattern = distancias[0][1];
		} else if(distancias[0][1] == distancias[0][3] && distancias[0][1] != distancias[0][2]) {
			pattern = distancias[0][1];
		} else if(distancias[0][2] == distancias[0][3] && distancias[0][2] != distancias[0][1]) {
			pattern = distancias[0][2];
		} else {
			System.out.println("N"); // nao forma quadrado!
			System.exit(0);
		}
		for (int i = 1; i < 4; i++) {
			
			boolean para_mim_mesmo = false, para_o_oposto = false;
			
			for (int j = 0; j < 4; j++) {
				distancias[i][j] = dist(i, j);
				
				boolean dist0 = distancias[i][j]==0;
				boolean distD = distancias[i][j]!=pattern;
				
				
				
				// tá, agora veja se está tudo ok!
				if(dist0 && para_mim_mesmo) {
					System.out.println("N"); // nao forma quadrado!
					System.exit(0);
				} else if(distD && para_o_oposto && !dist0) {
					System.out.println("N"); // nao forma quadrado!
					System.exit(0);
				} else if(dist0) {
					para_mim_mesmo = true;
				} else if(distD) {
					para_o_oposto = true;
				}
			}
			
		}
		
		System.out.println("S");
		
	}
	
	static double dist (int a,int b) {
		if(a==b) return 0;
		return Math.sqrt(( (int) Math.pow(val[a][0] - val[b][0] , 2) 
				       + ( (int) Math.pow(val[a][1] - val[b][1], 2))));
	}

}
