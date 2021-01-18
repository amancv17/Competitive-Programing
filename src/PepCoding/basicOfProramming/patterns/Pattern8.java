package PepCoding.basicOfProramming.patterns;

/*

                         *
                       *
                    *
                 *
              *
           *
        *

 */


import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printPattern(n);
    }
    public static void printPattern(int n){
        int spc = 0;
        int str = 1;

        for (int i = 1; i <= n; i++ ){
            spc = n-i;
            for (int j = 1; j <= spc; j++){
                System.out.print("\t");
            }
            for (int j = 1; j<=str; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
