import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x1, y1, x2, y2, x3, y3, x4, y4;
        double dist1, dist2, dist3, dist4;
        
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        x3 = in.nextInt();
        y3 = in.nextInt();
        x4 = in.nextInt();
        y4 = in.nextInt();
        
        dist1 = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2 - y1, 2));
        dist2 = Math.sqrt(Math.pow(x3-x1, 2)+ Math.pow(y3 - y1, 2));
        dist3 = Math.sqrt(Math.pow(x4-x3, 2)+ Math.pow(y4 - y3, 2));
        dist4 = Math.sqrt(Math.pow(x4-x2, 2)+ Math.pow(y4 - y2, 2));
        
        if(dist1 == dist2 && dist3 == dist4 || dist1 == dist3 && dist2 == dist4 || dist1 == dist4 && dist2 == dist3){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
        
        
    }
    
}
