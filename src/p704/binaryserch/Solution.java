package p704.binaryserch;

class Solution {
  public int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }

    int head = 0;
    int tail = nums.length - 1;
    int index = (head + tail) / 2;

    while (head <= tail && nums[index] != target) {
      if (nums[index] < target) {
        head = index + 1;
      } else {
        tail = index - 1;
      }
      index = (head + tail) / 2;
    }
    if (nums[index] == target) {
      return index;
    }
    return -1;
  }
}
