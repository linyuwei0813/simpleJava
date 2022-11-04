package p169.majorityelement;


//位运算方法
class Solution1 {
    public int majorityElement(int[] nums) {
        int majority = 0;

        for (int i = 0, mask = 1; i < 32; i++, mask <<= 1) {
            int bit = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & mask) == mask) {
                    bit++;
                }
            }

            if (bit > nums.length / 2) {
                majority |= mask;
            }
        }
        return majority;
    }
}
