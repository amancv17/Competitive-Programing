package PepCoding.basicOfProramming.patterns;

import java.util.Scanner;

/*
                  * * * *    * * * *
                  * * *        * * *
                  * *            * *
                  *                *
                  * *            * *
                  * * *        * * *
                  * * * *    * * * *

 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
      int strs = n/2 +1;
      int spac = 1;

      for(int i = 1; i<=n; i++){
          for (int j = 1; j <= strs; j++){
              System.out.print("*\t");
          }
          for (int j = 1; j <=spac; j++){
              System.out.print("\t");
          }
          for (int j = 1; j <= strs; j++){
              System.out.print("*\t");
          }
          if(i <= n/2){
              strs--;
              spac+=2;
          }
          else {
              strs++;
              spac-=2;
          }
          System.out.println();
      }
    }

}
