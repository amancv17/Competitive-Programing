package ds.sheet.lovebubber.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumAndMinElemnts {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("-----------------array -------------");
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();

        findMinAndMax(a);
    }

    private static void findMinAndMax(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length;i++){
            if (a[i] > max){
                max = a[i];
            }
            else if (a[i] < min)
                min = a[i];
        }
        System.out.println(min);
        System.out.println(max);

    }
}
