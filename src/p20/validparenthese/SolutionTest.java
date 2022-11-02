package p20.validparenthese;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        String s1 = "(]";
        Assertions.assertFalse(solution.isValid(s1));

        String s2 = ")(";
        Assertions.assertFalse(solution.isValid(s2));
    }
}
