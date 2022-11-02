package p278.firstbadversion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution{
    @Test
    public void test(){
        Assertions.assertEquals(1702766719,firstBadVersion(2126753390));
    }




}
