import java.util.Scanner;


public class bispo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		while(teclado.hasNext()){
			int X1 = teclado.nextInt();
			int Y1 = teclado.nextInt();
			int X2 = teclado.nextInt();
			int Y2 = teclado.nextInt();
			if(X1!=0 && X2!=0 && Y2!=0 && Y1 !=0){
				if(X1+Y1<Y2+X2 && 2*(X1+Y1)<X2+Y2  ){
					System.out.println("1");

				}
				if(X1+Y1<Y2+X2 && 2*(X1+Y1)>X2+Y2 ){
					System.out.println("2");

				}
				if((X1+Y1)/2>Y2+X2 ){
					System.out.println("-1");
				}
			}else{
				break;
			}
		}
	}
}


