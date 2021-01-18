package PepCoding.basicOfProramming.gettingStarted;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InverseOfANumber {
    public static void main(String[] args) {
        int  num=0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
             num = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("exception aagya");
        }
        new InverseOfANumberSolver().solve(num);
    }
}

class InverseOfANumberSolver{
    public void solve(int num){
        if(num == 0){
            System.out.println("input is zero");
        }
        else {
            int inverted = 0;
            int op = 1;
            while(num!= 0){
               int od = num % 10;
               int id = op;
               int ip = od;
               inverted = inverted + id * (int)Math.pow(10, ip - 1);
               num/=10;
               op++;
           }
            System.out.println(inverted);
        }
    }


}