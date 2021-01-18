package PepCoding.basicOfProramming.gettingStarted;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintAllPrimesTillN {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int low  = Integer.parseInt(br.readLine());
        final int high = Integer.parseInt(br.readLine());

        new PrintAllPrimesTillNSolver().solve( low, high);
    }
}

  class PrintAllPrimesTillNSolver{
    public void solve(int low, int high) {
           for(int i = low; i <= high; i++){
               boolean res = checkPrime(i);
               if( res )
                 System.out.println(i);
           }
    }
      private Boolean checkPrime(int i) {
           boolean counter = true;
        for (int div = 2; div * div <= i; div++){
            if(i%div == 0){
                counter = false;
                break;
            }
        }
        return counter;
      }
  }
