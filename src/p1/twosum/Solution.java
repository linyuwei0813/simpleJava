package p1.twosum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arrLength = nums.length;

        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] =j;
                    return result;
                }
            }
        }
        return null;
    }
}
