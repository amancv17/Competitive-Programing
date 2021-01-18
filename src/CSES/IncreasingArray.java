//package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {
    public static void main(String[] args) {
       try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

           int n = Integer.parseInt(br.readLine());

           StringTokenizer st = new StringTokenizer(br.readLine()," ");

           long[] arry = new long[n];

           for(int i = 0; i<n ; i++)
               arry[i] = Long.parseLong(st.nextToken());

           System.out.println(new IncreasingArraySolver().solve(arry));

       } catch (IOException e) {
           System.out.println("input kuch galat aaya");
       }

    }
}

class IncreasingArraySolver{
    public long solve(long[] ar){
        long steps = 0;
        for(int i = 0; i<ar.length-1; i++){

                if (ar[i] > ar[i +1]) {
                       steps = steps+(ar[i] - ar[i+1]);
                               ar[i+1] = ar[i];
                }
        }
        return steps;
    }
}
