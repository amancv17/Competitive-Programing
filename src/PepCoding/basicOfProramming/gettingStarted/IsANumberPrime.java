package PepCoding.basicOfProramming.gettingStarted;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsANumberPrime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        while(test_case -- > 0){
            int num = Integer.parseInt(br.readLine());
            System.out.println(new IsANumberPrimeSolver().solve(num));
        }
    }
}

class IsANumberPrimeSolver {
    public String solve(int num) {
        boolean res = true;

        if (num > 2 && num % 2 == 0) {
            res = false;

        } else {
            for (int i = 3; i * i < num; i += 2) {
                if (num % i == 0) {
                    res = false;
                    break;
                }
            }
        }

        return (res) ? "prime" : "not prime";
    }

}

