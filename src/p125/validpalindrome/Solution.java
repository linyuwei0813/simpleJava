package p125.validpalindrome;

class Solution {
  public boolean isPalindrome(String s) {
    if (s == null) {
      return false;
    }
    if (s.isEmpty()) {
      return true;
    }

    int headIndex = 0;
    int tailIndex = s.length() - 1;

    while (headIndex <= tailIndex) {
      while (headIndex < s.length() && !isAlphaNumeric(s.charAt(headIndex))) {
        headIndex++;
      }
      while (tailIndex >= 0 && !isAlphaNumeric(s.charAt(tailIndex))) {
        tailIndex--;
      }
      if (headIndex <= s.length() && tailIndex >= 0) {
        if (!equalIgnoreCase(s.charAt(headIndex), s.charAt(tailIndex))) {
          return false;
        }
        headIndex++;
        tailIndex--;
      }
    }
    return true;
  }

  private boolean isAlphaNumeric(char c) {
    return Character.isAlphabetic(c) || Character.isDigit(c);
  }


  private boolean equalIgnoreCase(char c1, char c2) {
    if (Character.isDigit(c1) || Character.isDigit(c2)) {
      return c1 == c2;
    } else {
      return (c1 == c2) || ((c1 - c2) == ('A' - 'a')) || ((c1 - c2) == ('a' - 'A'));
    }
  }
}
