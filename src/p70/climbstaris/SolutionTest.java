package p70.climbstaris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution {
    @Test
    public void test() {
        Assertions.assertEquals(5, climbStairs(4));
    }

}
