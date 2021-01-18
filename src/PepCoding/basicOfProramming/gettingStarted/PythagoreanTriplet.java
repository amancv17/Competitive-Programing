package PepCoding.basicOfProramming.gettingStarted;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String...s){
        Scanner scan = new Scanner(System.in);
        int a  = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;

        if(max > b && max > c){
            isPythegorousTriplet(max, b,c);
        }
        else if(b>a && b > c)
            isPythegorousTriplet(b, a,c);
        else
            isPythegorousTriplet(c, b,a);
    }

    public static void isPythegorousTriplet(int max, int b, int c){

        if ((max * max == (b * b) + (c * c))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
