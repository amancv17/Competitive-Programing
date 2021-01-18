package PepCoding.basicOfProramming.gettingStarted;

import java.io.*;

public class GcdAndLcm {

    public static void main(String[] args) {

        int num1 = 0,num2=0;
       try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

           num1  = Integer.parseInt(br.readLine());
           num2 =  Integer.parseInt(br.readLine());

       }catch (Exception e){
           System.out.println("exception aaya");
       }
       new GcdAndLcmSolver().solve(num1,num2);
    }

}

class GcdAndLcmSolver{
    public void solve(int num1, int num2){
        int gcd = (num1>num2) ? gcd(num1,num2) : gcd(num2,num1);
        int lcm = lcm(num1,num2,gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }

    private int lcm(int num1, int num2,int gcd) {
        return (num1/gcd) * num2;
    }

    public int gcd(int a,int b){
        return (b == 0) ? a : gcd(b,a%b);
    }
}