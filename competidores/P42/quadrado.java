import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		
		Scanner t = new Scanner (System.in);
		
		int x1,x2,x3,x4,y1,y2,y3,y4,soma1=0,soma2=0;
		
		
		x1=t.nextInt();
		y1=t.nextInt();
		x2=t.nextInt();
		y2=t.nextInt();
		x3=t.nextInt();		
	    y3=t.nextInt();
	    x4=t.nextInt();
	    y4=t.nextInt();
	    
	    soma1=(x1+y1-x2+y2);
	    soma2=(x3+y3-x4+y4);
	    
	    
	   
	    if(soma1==soma2){
	    	System.out.println("S");
	    }else{
	    	System.out.println("N");
	    }
	    
	}
}
