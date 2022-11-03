package p70.climbstaris;

public class Solution {
    public int climbStairs(int n) {
        int[] stairs = new int[46];
        for (int i = 0; i <= n; i++) {
            climbStairs(i, stairs);
        }
        return stairs[n];
    }

    public int climbStairs(int n, int[] stairs) {
        if (n <= 0) {
            stairs[0] = 0;
            return 0;
        } else if (n == 1) {
            stairs[1] = 1;
            return 1;
        } else if (n == 2) {
            stairs[2] = 2;
            return 2;
        }
        stairs[n] = stairs[n - 1] + stairs[n - 2];
        return stairs[n];

    }
}
