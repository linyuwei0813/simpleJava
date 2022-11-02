package p125.validpalindrome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution{
  @Test
  public void test1(){
    String s = "A man, a plan, a canal: Panama";
    Assertions.assertEquals(true,isPalindrome(s));
  }

  @Test
  public void test2(){
    String s = "0P";
    Assertions.assertEquals(false,isPalindrome(s));
  }

  @Test
  public void test(){
    for(char c = 0x20; c <=0x7f;c++ ){
      System.out.println(String.valueOf(c)+ "isAlphabetic:" + Character.isAlphabetic(c) + "; isDigit:" + Character.isDigit(c) );
  }
  }

}
