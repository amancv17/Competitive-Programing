package CSES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        new RepetitionSolver().solve(str);
    }
}

class RepetitionSolver {
    public void solve(String str) {
        int counter = 0;
        int temp = 1;
        for(int i = 0; i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1))
                temp++;
            else {
               if (temp > counter)
                counter = temp;
                temp = 1;
            }
        }
        System.out.println(counter > temp ? counter : temp);
    }
}