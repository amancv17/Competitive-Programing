package PepCoding.basicOfProramming.gettingStarted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactorisationOfANumber {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
             num = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        primeFactorization(num);

    }

    public static void primeFactorization(int num){

        //  itterative approch

        for (int div = 2; div * div <= num ; div++ ){

             while(num % div == 0){
                 num= num/div;
                 System.out.print(div+" ");
             }

        }
        if(num != 1){
            System.out.print(num);
        }



    }


}
