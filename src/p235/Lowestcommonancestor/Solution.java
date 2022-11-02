package p235.Lowestcommonancestor;

import java.util.LinkedList;
import java.util.Queue;
import model.TreeNode;

class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    Queue<TreeNode> path1 = findPath(root, p);
    Queue<TreeNode> path2 = findPath(root, q);

    return findLowestAncessor(path1, path2);
  }

  private TreeNode findLowestAncessor(Queue<TreeNode> path1, Queue<TreeNode> path2) {
    TreeNode ancestor = null;

    while (!path1.isEmpty() && !path2.isEmpty()) {
      if (path1.peek() == path2.peek()) {
        ancestor = path1.poll();
        path2.poll();
      } else {
        return ancestor;
      }
    }
    return ancestor;
  }

  private Queue<TreeNode> findPath(TreeNode root, TreeNode node) {
    Queue<TreeNode> path = new LinkedList<>();
    TreeNode currentNode = root;
    while (currentNode != null && currentNode.val != node.val) {
      path.add(currentNode);
      if (currentNode.val < node.val) {
        currentNode = currentNode.right;
      } else {
        currentNode = currentNode.left;
      }
    }
    if (currentNode != null && currentNode.val == node.val) {
      path.add(currentNode);
    }
    return path;
  }

  private class PathNode {
    TreeNode val;
    PathNode next;

    PathNode(TreeNode node) {
      this.val = val;
      next = null;
    }
  }

}
