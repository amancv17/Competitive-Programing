package PepCoding.basicOfProramming.patterns;

import java.util.Scanner;

/*

* * * * * * * * *
- * * * * * * * *
- - * * * * * * *
- - - * * * * * *
- - - - * * * * *
- - - - - * * * *
- - - - - - * * *
- - - - - - - * *
- - - - - - - - *
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n){

        /*      my way to solve

        for(int row = 0; row < n; row ++){
            int space_col = 0;

            while (space_col <= row){
                System.out.print("-\t");
                space_col++;
            }

            for (int col = 0; col < n-row; col++){
                System.out.print("*\t");
            }
            System.out.println();
        }

         */

        // pepcoding solution

        int star = n;
        int space = 0;
        for (int row = 0; row < n; row++){

            for(int j = 0; j<= space; j++){
                System.out.print("\t");
            }
            for(int j = 0 ; j<=star; j++){
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
