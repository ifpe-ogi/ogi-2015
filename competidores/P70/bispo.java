import java.util.Scanner;


public class bispo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questao completa
		
		Scanner t = new Scanner (System.in);
		boolean v = true;

		while(v){
		int x1 = t.nextInt();
		int y1 = t.nextInt();
		int x2 = t.nextInt();
		int y2 = t.nextInt();
		
		if(x1 % 2 == 0 && x2 % 2 == 0 && y1 % 2 != 0 && y2 % 2 != 0 ) System.out.println("1");
		
		else if(x1 % 2 != 0 && x2 % 2 != 0 && y1 % 2 == 0 && y2 % 2 == 0 ) System.out.println("1");
		
		else if (x1 % 2 == 0 && x2 % 2 != 0 && y1 % 2 != 0 && y2 % 2 == 0 ) System.out.println("2");
		
		else if (x1 % 2 != 0 && x2 % 2 == 0 && y1 % 2 == 0 && y2 % 2 != 0 ) System.out.println("2");
		
		else if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
			v = false;
		
		else System.out.println("-1");
		
		}
		
	
	}

}
