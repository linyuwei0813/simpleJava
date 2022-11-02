package model;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  static public TreeNode createBinarySearchTree(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }

    return createNode(arr, 0);
  }

  static private TreeNode createNode(int[] arr, int index) {
    if (index >= arr.length || arr[index] == -1) {
      return null;
    }

    TreeNode root = new TreeNode(arr[index]);
    root.left = createNode(arr, 2 * index + 1);
    root.right = createNode(arr, 2 * index + 2);
    return root;
  }

}
