class Solution {
 /**
 * Counts the number of nodes with an event number of children.
 *
 * @param tree
 *     The tree to count nodes with an even number of children in.
 * @return the number of nodes with an even number of children, or 0 if tree is null.
 */
 public static int countNodesEvenChildren(LibraryTree tree) {
   int num = 0;
   if(tree == null){
     num = 0;
   }else{
     if(tree.getChildren().size() % 2 == 0){
       num++;
     }
     for(LibraryTree t : tree.getChildren()){
       num = num + countNodesEvenChildren(t);
     }
   }
   return num;
 }
}
