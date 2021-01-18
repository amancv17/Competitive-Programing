package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
           int  x = scan.nextInt();
           int  y = scan.nextInt();
            System.out.println(new NumberSpiralSolver().solve(x,y));
        }
    }
}

class NumberSpiralSolver{
    public int solve(int x,int y){

        if(x>y){
           return fromRowside(x,y);
        }
        else if(x==y) {
            if (x % 2 == 0) {
                return fromRowside(x, y);
            }
                return fromColoumnSide(x, y);
        }

           return fromColoumnSide(x,y);
    }

    public int fromRowside(int x, int y){

        if(x % 2 == 0){
            return (x * x) - (y-1) ;
        }
        else {
            x--;
            return x*x - y;
        }
    }

    public int fromColoumnSide(int x,int y){
        if(y%2 != 0){
            return (int)Math.pow(y,2) - (x-1);
        }
        else {
            y--;
            return (y*y +1) - (x-1);
        }
    }
}
