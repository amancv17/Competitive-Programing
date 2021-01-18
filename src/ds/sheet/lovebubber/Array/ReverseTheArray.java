package ds.sheet.lovebubber.Array;

/*
         Write a program to reverse an array or string
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args)   {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("please provide the input as 1 : String or 2 : Array ");
            int userop = Integer.parseInt(br.readLine());
            boolean check = userop == 1;
            if (check) {
                String input = br.readLine();
                reverseAString(input);
            } else {
                int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                reverseAArray(input);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    private static void reverseAArray(int[] input) {


        int j = input.length -1;
        for (int i =0;i < j; i++,j--){
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
        Arrays.stream(input).forEach(System.out::println);




    }

    private static void reverseAString(String input) {
        StringBuilder builder = new StringBuilder(input);
        int j= input.length() - 1;
        for (int i = 0; i<= j  ;i++,j--){
            char temp = builder.charAt(i);
            builder.setCharAt(i,builder.charAt(j));
            builder.setCharAt(j,temp);
        }
        System.out.println(builder);
    }
}
