class Solution {
  /**
   * @param heap
   *     the Heap to check, can be null. If not null, this heap will always contain at least one Node.
   * @return the Node corresponding to the last position in the Heap, or null if the Heap is null.
   */
  public static Heap.Node findLastPosition(Heap heap) {
    // TODO
  }
}
//
//class Solution {
//  /**
//   * @param heap
//   *     the Heap to check, can be null. If not null, this heap will always contain at least one Node.
//   * @return the Node corresponding to the last position in the Heap, or null if the Heap is null.
//   */
//public static Heap.Node findLastPosition(Heap heap) {
//		  if(heap == null) {
//			  return null;
//		  }
//		  int h = (int) (Math.log(heap.size())/Math.log(2)); // height calculated
//		  int bound = (int) Math.pow(2, h);
//		  int target = heap.size() - bound;
//
//		  Heap.Node result = heap.getRoot();
//		  int mask = 1 << h-1;
//		  for(int i = h ; i > 0 ; i--) {
//			  int goLeft = mask & target;
//			  System.out.println(goLeft);
//			  mask = mask >> 1;
//			  if(goLeft == 0) {
//				  result = heap.getLeft(result);
//			  }else {
//				  result = heap.getRight(result);
//			  }
//		  }
//		  return result;
//	  }
//}
////
