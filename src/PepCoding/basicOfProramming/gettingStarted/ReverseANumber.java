package PepCoding.basicOfProramming.gettingStarted;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseANumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

     //     String number  = br.readLine();
          new ReverseANumberSolver().solve(number);
    }
}

class ReverseANumberSolver{
    public void solve(int number){

      //  APPROCH 1
 /*
        int i = number.length()-1;
        while(i >= 0 ){                     5468
            System.out.println(number.charAt(i));
            i--;
  */

        while(number > 0){
            System.out.println(number%10);
            number /= 10;
        }

    }
}