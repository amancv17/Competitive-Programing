package CSES;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberSolverTest {
    @Test
    void shouldReturnMissingNumber(){
//        given
          int n =2;
          int[] arr = {2};

//          when
          int num = new MissingNumberSolver().solve(arr,n);

//          then
         assertEquals(1,num);
    }
}