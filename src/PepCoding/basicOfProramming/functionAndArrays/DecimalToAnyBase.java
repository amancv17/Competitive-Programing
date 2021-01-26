package PepCoding.basicOfProramming.functionAndArrays;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int base = scan.nextInt();

       System.out.println(convertIntoReqBase(num,base));
    }

    private static int convertIntoReqBase(int num, int base) {
        int rv = 0;
        int p =1;
        while (num > 0){
            int rem = num % base;
            num /= base;

            rem = rem * p;
            rv+=rem;

            p *= 10;
        }
        return rv;
    }


}
