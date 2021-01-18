package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stkz = new StringTokenizer(br.readLine());
        Long n = (long) Integer.parseInt(stkz.nextToken());

         System.out.println(new Solver().solve(n));
    }
}
class Solver{
    public String solve(Long n){
        if(n == 0) return "null";
        if(n == 1) return  "1";
       // StringBuilder builder = new StringBuilder(); prob -> unable to give space between numbers
        StringJoiner joiner  = new StringJoiner(" ");
        while(n != 1) {
            joiner. add(String.valueOf(n));
            if (odd(n)) {
                n = (n * 3) + 1;
            } else {
                n /= 2;
            }
        }

        return joiner.add("1").toString();
    }

    private boolean odd(Long n) {
        return (n%2 != 0);
    }
}