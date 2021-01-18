package ds.sheet.lovebubber.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UnionAndIntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,7};
        int[] b = {2, 3, 5, 6};
        int[] res = Union(a,b);
        printArray(res);



    }

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static int[] Union(int[] a, int[] b) {
        int a_len = a.length;
        int b_len = b.length;

//        int res_size = a_len>b_len ? a_len : b_len;
        int[] res = new int[a_len+b_len];

        int i = 0, j = 0, k = 0;

//        int[] a = {7, 1, 5, 2, 3, 6};
//        int[] b = {3, 8, 6, 20, 7};

        while (i < a_len && j < b_len){
            if (a[i] == b[j]){
                res[k++] = a[i++];
                j++;
            }
            else if (a[i] < b[j]){
                    res[k] = a[i];
                    k++;
                    i++;
            }
            else {
                res[k++] = b[j++];
            }
        }
        while ( i < a_len ){
            res[k++] = a[i++];
        }
        while (j < b_len ){
            res[k++] = b[j++];
        }

        return res;
    }
}
