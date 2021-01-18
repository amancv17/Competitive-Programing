package PepCoding.basicOfProramming.patterns;
/*

       - - - - -     *
        - - - -    * *
         - - -   * * *
         - -   * * * *                       for(int j = 0 ; j <= i ; j ++)sop *
          -  * * * * *
           * * * * * *



 */

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i = 0 ; i < n; i++){
            for (int j = 0 ; j < n -i; j++){
                System.out.print("-\t");
            }
            for(int j = 0; j <=i; j++ )
                System.out.print("*\t");

            System.out.println();
        }
    }
}
