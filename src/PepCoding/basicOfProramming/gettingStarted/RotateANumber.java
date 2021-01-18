package PepCoding.basicOfProramming.gettingStarted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateANumber {
    public static void main(String[] args) {
        int n=0,k=0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("exception aaya");
        }
        System.out.println(new RotateANumberSolver().solve(n, k));
    }
}

class RotateANumberSolver{
    public static int solve(int n,int k){
        int count = countElemnts(n);
        k %=count;           // if rotation is > count

        int res = (k > 0) ?  leftRotation(n,k,count): leftRotation(n,k+count,count) ;
        return res;
    }

    private static int countElemnts(int n) {
        int count = 0;
        while(n !=0){
            n/=10;
            count++;
        }
        return count;
    }

    private static int leftRotation(int n, int k,int count) {
        int rem = n % (int)Math.pow(10,k);
        rem *= (int)Math.pow(10,count-k);
        n = n / (int)Math.pow(10,k);
        return rem+n;
    }

//    private static int rightRotaion(int n, int k,int count) {
//      int quesnt = n / (int)Math.pow(10,count-k);
//      n %= (int)Math.pow(10,count-k);
//      n *= (int)Math.pow(10,count-k-1);
//        return n+quesnt;
 //    }

}