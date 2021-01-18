package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            final int n = Integer.parseInt(br.readLine());
            int[] arry = new int[n-1];

            String s = br.readLine();
            String[] str = s.trim().split("\\s");
            for(int i=0; i< str.length; i++)
                arry[i] = Integer.parseInt(str[i]);

        System.out.println(new MissingNumberSolver().solve(arry,n));

    }
}
class MissingNumberSolver {
    public int solve(int[] arry, int n) {

//    Solutoin :1
//        int num = 0;
//        int sumOfAllNumUpTo_N =  (n*(n+1))/2;
//       // System.out.println(sumOfAllNumUpTo_N+"jhk");
////        int sumOfAllNumInArray = 0;
//        for(int i=0;i< arry.length;i++){
//             sumOfAllNumUpTo_N -=  arry[i];
//       //     System.out.println(sumOfAllNumInArray+"are");
//        }
//
//        num = sumOfAllNumUpTo_N ;
//     return num;
//     }

//        Soltion 2 : using XOR

        int x1 = arry[0];  // first elemnt of arry

        for (int i = 1; i < n-1; i++)
            x1 = x1 ^ arry[i];    // XOR of all array elemt

        int x2 = 1;   // starting  no of  n natural number series

        for (int i = 2; i <= n; i++)
            x2 = x2 ^ i;     // XOR of all the natural up to n

        return x1 ^ x2;

    }
}