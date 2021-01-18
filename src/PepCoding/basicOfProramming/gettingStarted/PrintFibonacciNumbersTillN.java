package PepCoding.basicOfProramming.gettingStarted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFibonacciNumbersTillN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        new PrintFibonacciNumbersTillNSolver().solve(n);
    }
}

class PrintFibonacciNumbersTillNSolver{
    public void solve(int n){
        int a =0;
        int b =1;
        int sum = 0;
       while(n-2  > 0 ){
           sum =a+b;
           System.out.println(sum);
           a = b;
           b= sum;
           n--;
       }
    }
}
