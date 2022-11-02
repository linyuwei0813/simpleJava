package p121.besttimetosellstock;

class Solution2 {
  //o(n*n) time exceed
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0) {
      return 0;
    }

    int maxProfit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        int currentProfit = prices[j] - prices[i];
        if (currentProfit > maxProfit) {
          maxProfit = currentProfit;
        }
      }
    }
    return maxProfit;
  }
}
