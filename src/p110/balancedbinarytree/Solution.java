package p110.balancedbinarytree;

import model.TreeNode;

class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    return (Math.abs(calculateHight(root.left) - calculateHight(root.right)) <= 1)
        && isBalanced(root.left)
        && isBalanced(root.right);
  }

  int calculateHight(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return Math.max(1 + calculateHight(node.left), 1 + calculateHight(node.right));
  }
}
