package p169.majorityelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution {
    @Test
    public void test() {
        Assertions.assertEquals(2, majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
