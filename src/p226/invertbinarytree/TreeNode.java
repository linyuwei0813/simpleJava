package p226.invertbinarytree;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public void setLet(TreeNode treeNode) {
    this.left = treeNode;
  }

  public void setRight(TreeNode treeNode) {
    this.right = treeNode;
  }

  public static TreeNode createTreeNode(int[] arr) {
    return createTreeNode(0, arr);
  }


  public static TreeNode createTreeNode(int i, int[] arr) {
    while (i < arr.length) {
      TreeNode root = new TreeNode(arr[i]);
      root.setLet(createTreeNode(2 * i + 1, arr));
      root.setRight(createTreeNode(2 * i + 2, arr));
      return root;
    }
    return null;
  }
}

