import java.util.*;
class Solution {
  /**
   * Computes whether the BinaryTree is complete.
   *
   * @param tree
   *     the BinaryTree to check.
   * @return true iff the BinaryTree is complete, else false.
   */
  public static boolean isTreeComplete(BinaryTree tree) {
    Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
    if(tree == null){
      return true;
    } 
    else{
      queue.add(tree);
      
      while(queue.size()>0) {
       BinaryTree temp = queue.remove();
        
       if(temp == null){
        while(queue.size()!=0){
          BinaryTree t = queue.remove();
          if(t != null){
            return false;
          }
        }
        return true;
       }
       queue.add(temp.getLeft());
       queue.add(temp.getRight());
        
      }
      return true;
    }
  }
}
//
