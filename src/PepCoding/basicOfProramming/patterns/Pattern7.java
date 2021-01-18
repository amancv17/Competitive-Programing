package PepCoding.basicOfProramming.patterns;

import java.util.Scanner;

/*
                        *
                        -   *
                        -   -   *
                        -   -   -  *
                        -   -   -  -  *

 */

public class Pattern7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int strs = 1;
        int spc ;

        for (int i =1; i<=n; i++){
            spc = i-1;
            for(int j = 1; j <= spc ; j++){
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
}
