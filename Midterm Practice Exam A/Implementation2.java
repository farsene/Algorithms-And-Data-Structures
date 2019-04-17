class Solution {
  /**
   * @param heap
   *     the Heap to check, can be null. If not null, this heap will always contain at least one Node.
   * @return the Node corresponding to the middle element in the last layer of the Heap, or null if the Heap is null.
   * In case the last layer contains an even number of elements, returns the element just left of the middle (see test).
   */
  public static Heap.Node findMiddleInLastLayer(Heap heap) {
    if(heap == null || heap.size() == 0){
      return null;
    }

    Heap.Node result = heap.getRoot();

    int size = heap.size();
    int h = (int)(Math.log(size)/Math.log(2));

    int index = (int) ((size - Math.pow(2, h)) / 2);
    int mask = 1 << (h-1);

    for(int i = 1 ; i <= h ; i++){
      boolean goLeft = (int)(index & mask) == 0;
      if(goLeft){
        result = heap.getLeft(result);
      }else{
        result = heap.getRight(result);
      }
      mask = mask >> 1;
    }

    return result;
  }
}
