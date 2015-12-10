import java.util.Scanner;
public class maior {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int maior=0;
		int maior2=0;

		for (int i = 0; i < 2; i++) {
			int a =sc.nextInt();
			String simbolo= sc.next();
			int b=sc.nextInt();
			if(simbolo.equals("x")){
				maior2=a*b;
			}else if(simbolo.equals("+")){
				maior2=a+b;
			}else{
				maior2= (int) Math.pow(a,b);
			}
			if(i==1){
				break;
			}
			maior=maior2;
		}
		if(maior>maior2){
			System.out.println(">");
		}else if(maior<maior2){
			System.out.println("<");
		}else{
			System.out.println("=");
		}	
	}
}