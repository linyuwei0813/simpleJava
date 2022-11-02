package p704.binaryserch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution {
  @Test
  public void test() {
    int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
    Assertions.assertEquals(4, search(nums, 9));
  }

  @Test
  public void test1() {
    int[] nums = new int[]{-1,0,3,5,9,12};
    Assertions.assertEquals(-1, search(nums, 2));
  }


}
