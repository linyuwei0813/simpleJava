package p242.validanagram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution {
  @Test
  public void test() {
    String s = "anagram";
    String t = "nagaram";
    Assertions.assertEquals(true, isAnagram(s, t));
  }

}
