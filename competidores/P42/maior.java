import java.util.Scanner;


public class maior {

	public static void main(String[] args) {
		
		Scanner t =new Scanner (System.in);
		
		
		int x1,x2,y1,y2,sx=0,sy=0;
		String OP1;
		String OP2;
		
		
		
		x1=t.nextInt();
		OP1=t.next();
		x2=t.nextInt();
		
		y1=t.nextInt();
		OP2=t.next();
		y2=t.nextInt();
		
		
		if (OP1.equals("+")){
			sx=x1+x2;
		}else if(OP1.equals("x")){
			sx=x1*x2;
		}else if(OP1.equals("^")){
		    sx=(int)Math.pow(x1, x2);
		}
		
		if(OP2.equals("+")){
			sy=y1+y2;
		}else if(OP2.equals("x")){
			sy=y1*y2;
		}else if(OP2.equals("+")){
			sy=(int)Math.pow(x1, x2);
		}
		
		if(sx>sy){
			System.out.println(">");
		}else if(sy>sx){
			System.out.println("<");
		}else{
			System.out.println("=");
		}

	}

}
