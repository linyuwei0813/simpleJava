package p409.longestpalindrome;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> appearance = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (appearance.containsKey(c)) {
                appearance.put(c, appearance.get(c) + 1);
            } else {
                appearance.put(c, 1);
            }
        }
        int length = 0;
        boolean single = false;
        for (Character c : appearance.keySet()) {
            length = length + appearance.get(c) / 2 * 2;
            if (!single && appearance.get(c) % 2 != 0) {
                single = true;
            }
        }
        if (single) {
            length = length + 1;
        }
        return length;
    }
}
