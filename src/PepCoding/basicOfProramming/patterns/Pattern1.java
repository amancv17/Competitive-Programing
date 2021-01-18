package PepCoding.basicOfProramming.patterns;

import java.util.Scanner;

/*
     *
     * *
     * * *
     * * * *
     * * * * *
 */

public class Pattern1 {
    public static void main(String...s){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
         for(int row = 0 ; row < n ; row ++){
             for ( int col = 0 ; col <= row ; col++){
                 System.out.print("*    ");
             }
             System.out.println();
         }
    }
}
