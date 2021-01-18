package ds.sheet.lovebubber.Array;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        StringBuilder buider = new StringBuilder();
        int rem = 0;
        int ques = num;

        while(ques >=1){
            rem = ques % 2;
            buider.append(rem);
            ques = ques / 2;
        }

        System.out.println(buider);
    }
}
