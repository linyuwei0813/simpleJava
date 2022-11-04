package p409.longestpalindrome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution{

    @Test
    public void test(){
        Assertions.assertEquals(7,longestPalindrome("abccccdd"));
    }

}
