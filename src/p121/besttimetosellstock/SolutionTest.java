package p121.besttimetosellstock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution {
  @Test
  public void test1() {
    int[] price1 = new int[]{2, 4, 1};
    int maxProfit1 = maxProfit(price1);
    Assertions.assertEquals(2, maxProfit1);
  }

  @Test
  public void test2(){
    int[] price1 = new int[]{7,6,4,3,1};
    int maxProfit1 = maxProfit(price1);
    Assertions.assertEquals(0, maxProfit1);

  }

}
