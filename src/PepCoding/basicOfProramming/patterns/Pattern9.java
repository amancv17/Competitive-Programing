package PepCoding.basicOfProramming.patterns;

/*

        *                *
          *           *
            *       *
              *   *
                *
              *   *
            *      *
           *        *
          *          *

 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int spc =0;
        int str = 2;
            for(int i= 1; i<= n; i++){
                spc = n-i;
               for (int j = 1; j <= str; j++){
                    while(spc <= 0){
                        System.out.print("\t");
                    }
           }
        }
    }
}
