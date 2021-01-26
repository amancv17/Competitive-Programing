package PepCoding.basicOfProramming.functionAndArrays;

import java.util.Scanner;

public class AnyBaseToDecimal {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num  = scan.nextInt();
    int base = scan.nextInt();

    System.out.println( AnyBaseToDecimalSolver(num,base));
  }

  private static int AnyBaseToDecimalSolver(int num, int base) {

    int p =0; int dv = 0;
    while(num >=1 ){
      int rem = num % 10;
      num /= 10;
      rem = rem * (int)Math.pow(2, p);
      dv += rem;
      p++;
    }
    return dv;
  }
}


