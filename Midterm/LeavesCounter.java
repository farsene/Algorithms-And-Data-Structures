class LeavesCounter {
  /**
   * @param tree
   *     The input BinaryTree.
   * @return the amount of leaves of the tree.
   */
  public static int countLeaves(BinaryTree tree) {
    // TODO
  }
  class BinaryTree {
  private int key;
  private BinaryTree left, right;

  /**
   * Simple constructor.
   *
   * @param key
   *     to set as key.
   */
  public BinaryTree(int key) {
    this.key = key;
  }

  /**
   * Extended constructor.
   *
   * @param key
   *     to set as key.
   * @param left
   *     to set as left child.
   * @param right
   *     to set as right child.
   */
  public BinaryTree(int key, BinaryTree left, BinaryTree right) {
    this(key);
    setLeft(left);
    setRight(right);
  }

  /**
   * @return The key of this BinaryTree node.
   */
  public int getKey() {
    return key;
  }

  /**
   * @return the left child.
   */
  public BinaryTree getLeft() {
    return left;
  }

  /**
   * @return the right child.
   */
  public BinaryTree getRight() {
    return right;
  }

  /**
   * @return true iff this BinaryTree node has a left child, false otherwise.
   */
  public boolean hasLeft() {
    return left != null;
  }

  /**
   * @return true iff this BinaryTree node has a right child, false otherwise.
   */
  public boolean hasRight() {
    return right != null;
  }

  /**
   * @param left
   *     The BinaryTree node to set as left child.
   */
  public void setLeft(BinaryTree left) {
    this.left = left;
  }

  /**
   * @param right
   *     The BinaryTree node to set as right child.
   */
  public void setRight(BinaryTree right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "BinaryTree{" + key + '}';
  }
}

}