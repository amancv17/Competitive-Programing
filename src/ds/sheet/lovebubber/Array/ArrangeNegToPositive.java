package ds.sheet.lovebubber.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrangeNegToPositive {
    public static void main(String[] args) {
         int[] ar = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        printArray(ar);

        System.out.println();

         arrangeNegToPositiveSolver(ar);

         printArray(ar);

    }
    public static void printArray(int[] ar){
        for (int i : ar){
            System.out.print(i+" ");
        }
    }

    public static void arrangeNegToPositiveSolver(int[] ar){

        /*       simple Approch  complaxity = o(n)

        int j = 0;
        for(int i =0; i< ar.length;i++){
            if(ar[i] < 0 && i != j){
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;

                j++;
            }

        }
         */

        // two Pointer Approch  -12, 11, -13, -5, 6, -7, 5, -3, -6

        int left = 0, right = ar.length-1;

        while (left <= right){

            if (ar[left] > 0 && ar[right] > 0){
                int temp = ar[right];
                ar[right] = ar[left];
                ar[left] = temp;

                right -- ;
            }

            else if(ar[left] > 0 && ar[right] < 0){
                int temp = ar[right];
                ar[right] = ar[left];
                ar[left] = temp;

                left++;
                right--;

            }
            else if(ar[left] > 0 && ar[right] >0){

                right--;
            }
            else
                left++;
        }

    }
}
