package PepCoding.basicOfProramming.functionAndArrays;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();                       // 994543234
        int digit = scan.nextInt();                    // 4
        frequency(num,digit);
    }

    private static void frequency(int num, int digit) {
        int temp = num;
        int count = 0;
        while(temp > 0){
            int i = temp % 10;
            if(i == digit){
                count++;
            }
            temp /= 10;
        }
        System.out.println(count);
    }
}
