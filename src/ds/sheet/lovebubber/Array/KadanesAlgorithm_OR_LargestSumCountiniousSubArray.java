package ds.sheet.lovebubber.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KadanesAlgorithm_OR_LargestSumCountiniousSubArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] ar = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        largestContinuousSum(ar);
    }

    private static void largestContinuousSum(int[] ar) {
     //     Brute Force Approch
     /*
        int sum = 0; // 9 , 8 ,
        for(int i =0; i< ar.length; i++){
            int temp = 0;
            for (int j = ar.length - 1; j >= i; j--){
                temp += ar[j];
            }
            if(sum < temp){
                sum = temp;
            }
        }
        System.out.println(sum);

      */

      // kadane Algoritham

        int global_max = 0, current_max = 0;
        for(int i = 0; i< ar.length; i++){

            current_max = Math.max(ar[i] , current_max + ar[i]);

           if (current_max > global_max){
               global_max = current_max;
           }
         }
        System.out.println(global_max);


    }
}
