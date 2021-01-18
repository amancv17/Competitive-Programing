package PepCoding.basicOfProramming.gettingStarted;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitsOfANumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String num = br.readLine();            for approch 1
          int num =Integer.parseInt(br.readLine()) ;
        new DigitsOfANumberSolver().solve(num);
    }
}
class DigitsOfANumberSolver{
    public void solve(int num){

//        Approch no 1

//        int i=0;
//        while( i < num.length()){
//            System.out.println(num.charAt(i));
//            i++;

        // Approch no 2

         int count  = 0;
         int temp = num;
         while(temp != 0){
             temp = temp/10;
             count++;
        }
                                                          //    5668498
         int div = (int)Math.pow(10, count-1);
         while(num != 0){
             int q = num / div;
             System.out.println(q);

             num = num % div;
             div = div/10;
         }
    }
}
