/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class bispo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n ;
        n = in.nextInt();
        int array [][] = new int [n][n];
        for (int i = 0; i < array.length ; i++){
            for (int j = 0; j < array.length ; j++){
                array [i][j] = in.nextInt();
            } 
        }
    }
    
}
