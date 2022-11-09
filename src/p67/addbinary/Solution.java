package p67.addbinary;

class Solution {
  public String addBinary(String a, String b) {
    StringBuffer sumBuffer = new StringBuffer("");
    String temp;
    if (a.length() < b.length()) {
      temp = a;
      a = b;
      b = temp;
    }

    int carry = 0;
    for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
      int c;
      if (j >= 0) {
        c = a.charAt(i) - '0' + b.charAt(j) - '0' + carry;
      } else {
        c = a.charAt(i) - '0' + carry;
      }
      sumBuffer.append(c % 2);
      carry = c / 2;
    }
    if (carry == 1) {
      sumBuffer.append("1");
    }

    return sumBuffer.reverse().toString();
  }
}
