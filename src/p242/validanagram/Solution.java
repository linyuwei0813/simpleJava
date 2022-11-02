package p242.validanagram;

import java.util.Arrays;

class Solution {
  public boolean isAnagram(String s, String t) {
    int[] alphaArr = new int[26];
    for(char c:s.toCharArray()){
      alphaArr[c-'a']++;
    }
    for(char c: t.toCharArray()){
      alphaArr[c-'a']--;
    }
    return !Arrays.stream(alphaArr).filter(count->count!=0).findAny().isPresent();
  }
}
