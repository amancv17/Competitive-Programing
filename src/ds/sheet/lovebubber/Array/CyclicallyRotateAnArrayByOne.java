package ds.sheet.lovebubber.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CyclicallyRotateAnArrayByOne {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(
                Integer::parseInt).toArray();
        System.out.println("--------------------------------");

        printArry(ar);
        System.out.println("--------------------------------");
        rotateByOne(ar);


    }

    private static void printArry(int[] ar) {
        for(int i : ar){
            System.out.print(i+" " );
        }
    }

    private static void rotateByOne(int[] ar) {
        int i = ar.length -1;
        int j = i-1;
        int temp = ar[i];
        while(i > 0){
            ar[i--] = ar[j--];
        }
        ar[0] = temp;
        printArry(ar);
    }
}
