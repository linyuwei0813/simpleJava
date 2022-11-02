package p235.Lowestcommonancestor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import model.TreeNode;

class SolutionTest extends Solution {
  @Test
  public void test() {
    int[] arr = new int[]{6, 2, 8, 0, 4, 7, 9, -1, -1, 3, 5};
    TreeNode tree = TreeNode.createBinarySearchTree(arr);

    Assertions.assertEquals(2, lowestCommonAncestor(tree, new TreeNode(2), new TreeNode(4)).val);
  }

}
