package PepCoding.basicOfProramming.gettingStarted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String s;
        try {
             n  =  Integer.parseInt(br.readLine());
      //         s = br.readLine();
            new CountDigitsInANumberSolver().solve(n);

        } catch (IOException e) {
            System.out.println("exception aaya IO me");
        }
    }
}

class CountDigitsInANumberSolver{


   //    This is my first approch

    public void solve(int n) {
        /*  this solution is by normal itteration

       int counter = 0;
       while(n != 0){
           n/=10;
           counter++;
       }
        System.out.println(counter);

        */

        // solution by recursion
        int counter = 0;
        if(n == 0)
            counter = 0;
        else {
            solve(n/10);
            counter+=1;

    }

    }

     /*  this is my 2nd approch

      public void solve(String s){
        char[] ch = s.toCharArray();
        System.out.println(ch.length);

        }
     */


    }
