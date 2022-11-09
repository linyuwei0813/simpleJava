package p67.addbinary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution {
  @Test
  public void test(){
    Assertions.assertEquals("10101", addBinary("1010","1011"));
  }

}
