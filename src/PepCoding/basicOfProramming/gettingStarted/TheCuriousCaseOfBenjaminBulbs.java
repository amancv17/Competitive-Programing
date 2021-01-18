package PepCoding.basicOfProramming.gettingStarted;

import java.util.Arrays;
import java.util.Scanner;

public class TheCuriousCaseOfBenjaminBulbs {
    public static void main(String...s){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        solve(n);
    }

    private static void solve(int n ) {
        for(int i=1 ; i * i <=n ; i++){
            System.out.println(i*i);
        }
    }
}


 
/*

              4    n     n n n n n o o 
              3    n o o o n n n o o o
              2    n o n o n o n o n  o  
          n =10  , 1 2 3 4 5 6 7 8 9 10   , intial all is off
          no of time fluctuation occurs = 10
          1st fluctation - all on  
          for fluctaion = 2 to n
             bool bulbstate = on;
             for int i = fluctation to n
                  
          
 */