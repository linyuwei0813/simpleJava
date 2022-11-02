package p121.besttimetosellstock;

public class Solution {
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0) {
      return 0;
    }

    int maxProfit = 0;
    int lowestPrice = prices[0];
    for (int i = 1; i < prices.length; i++) {
      int currentProfit = prices[i]-lowestPrice;
      if (prices[i] < lowestPrice) {
        lowestPrice = prices[i];
        currentProfit = 0;
      }
      if(maxProfit<currentProfit){
        maxProfit = currentProfit;
      }
    }
    return maxProfit;
  }
}
