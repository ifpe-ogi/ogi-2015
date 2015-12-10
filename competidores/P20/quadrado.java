import java.util.*;
public class quadrado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		int x5=0;
		int y6=0;
		int x7=0;
		int y8=0;

		x5=x1-x2;
		if(x5<0){
			x5*=-1;
		}
		y6=y1-y2;
		if(y6<0){
			y6*=-1;
		}
		x7=x3-x4;
		if(x7<0){
			x7*=-1;
		}
		y8=y3-y4;
		if(y8<0){
			y8*=-1;
		}
		if(x5==x7 && y6==y8){
			System.out.println("S");
		}else{
			System.out.println("N");
		}

	}
}