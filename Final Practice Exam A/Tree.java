class Solution {
  /**
   * Counts the number of nodes in the tree at a certain level.
   *
   * @param tree
   *     The binary tree to count nodes in.
   * @param level
   *     The specified level to count nodes in.
   * @return the number of nodes at that level, or 0 if tree is null.
   */
   public static int countNodesAtLevel(BinaryTree tree, int level) {
     if(tree == null){
       return 0;
     }else if(level == 0){
       return 1;
     }

     return countNodesAtLevel(tree.getLeft(), level -1) + countNodesAtLevel(tree.getRight(), level - 1);
   }
}
//class Solution {
//  /**
//   * Counts the number of nodes in the tree at a certain level.
//   *
//   * @param tree
//   *     The binary tree to count nodes in.
//   * @param level
//   *     The specified level to count nodes in.
//   * @return the number of nodes at that level, or 0 if tree is null.
//   */
//  public static int countNodesAtLevel(BinaryTree tree, int level) {
//    if(tree == null){
//      return 0;
//    }else if(level == 0){
//        return 1;
//    }else{
//      return countNodesAtLevel(tree.getLeft(), level-1) + countNodesAtLevel(tree.getRight(), level-1);
//    }
//  }
//}
