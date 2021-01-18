//package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        new PermutationsSolver().solve(num);
    }

}

 class PermutationsSolver{

    StringBuilder builder = new StringBuilder();
     public void solve(int num) {
         if (num == 2){
            builder.append("NO SOLUTION");
         }
         else if(num == 3) {
             builder.append("NO SOLUTION");
         }
         else{
             for (int i = 2; i <= num; i += 2) {
                 builder.append(i + " ");
             }
             for (int j = 1; j <= num; j += 2) {
                 builder.append(j + " ");
             }
         }
         System.out.println(builder);
     }
 }
