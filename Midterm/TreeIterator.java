
import java.util.*;

class TreeIterator {
 /**
  * @param tree
  *     The input BinaryTree.
  * @param order
  *     The order in which the binary tree nodes need to be returned: pre-order, in-order, or post-order.
  * @return A list of all nodes of the tree, in the specified order.
  */
 public static List<BinaryTree> getAllNodesDF(BinaryTree tree, Order order) {
   List<BinaryTree> list = new LinkedList<BinaryTree>();

   if(tree == null) {
		  return list;
	  }
	  getAllNodes(tree, order, list);

	  return list;
 }

 public static void getAllNodes(BinaryTree tree, Order order, List<BinaryTree> list) {
   if(order == Order.PRE) {
		list.add(tree);
		if(tree.hasLeft()) {
			getAllNodes(tree.getLeft(), Order.PRE, list);
		}
		if(tree.hasRight()) {
			getAllNodes(tree.getRight(), Order.PRE, list);
		}
	}
	else if(order == Order.IN) {
		if(tree.hasLeft()) {
			getAllNodes(tree.getLeft(), Order.IN, list);
		}
		list.add(tree);
		if(tree.hasRight()) {
			getAllNodes(tree.getRight(), Order.IN, list);
		}
	}
	else if(order == Order.POST) {
		if(tree.hasLeft()) {
			getAllNodes(tree.getLeft(), Order.POST, list);
		}
		if(tree.hasRight()) {
			getAllNodes(tree.getRight(), Order.POST, list);
		}
		list.add(tree);
	}
 }

}
//
