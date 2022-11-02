package p110.balancedbinarytree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import model.TreeNode;

class SolutionTest extends Solution {
  @Test
  public void test(){
    int[] arr = new int[]{1,2,2,3,3,-1,-1,4,4};
    TreeNode tree = TreeNode.createBinarySearchTree(arr);
    Assertions.assertFalse(isBalanced(tree));
  }

  @Test
  public void test1(){
    int[] arr = new int[]{1,2,2,3,-1,-1,3,4,-1,-1,4};
    TreeNode tree = TreeNode.createBinarySearchTree(arr);
    Assertions.assertFalse(isBalanced(tree));
  }


}
