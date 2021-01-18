package ds.sheet.lovebubber.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String...s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int size = Integer.parseInt(br.readLine());
            int[] Arry = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int kth = Integer.parseInt(br.readLine());

            kthSmallestElemnt(Arry, size, kth);
        }
    }

    public static void kthSmallestElemnt(int[] a, int size, int k){
       // sort the array using inbuild sort
       //  Arrays.sort(a);

        sort(a);

       //  print the k-1 elemnt
        System.out.println(a[k-1]);
    }

    private static void sort(int[] a) {

    }
}
