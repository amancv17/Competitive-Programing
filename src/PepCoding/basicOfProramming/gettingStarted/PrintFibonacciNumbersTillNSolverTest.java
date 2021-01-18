package PepCoding.basicOfProramming.gettingStarted;

import PepCoding.basicOfProramming.gettingStarted.PrintFibonacciNumbersTillNSolver;
import org.junit.jupiter.api.Test;

class PrintFibonacciNumbersTillNSolverTest {

    @Test
    void shouldReturnFabonaciSeries(){

        // given
        int n = 10;

        // when

        new PrintFibonacciNumbersTillNSolver().solve(n);
    }
}