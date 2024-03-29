class Solution {
    /**
     * Swaps two elements in an array.
     *
     * @param a
     *     The array to swap elements in.
     * @param i
     *     Position of element to swap in a.
     * @param j
     *     Position of element to swap in a.
     */
    public static void swap(int[] a, int i, int j) {
      int t = a[i];
      a[i] = a[j];
      a[j] = t;
    }
  
    /**
     * Restores the heap property in a heap represented as an array.
     * When the heap property is invalid at root,
     * the method fixes the heap first locally before fixing the affected subtree.
     *
     * @param heap
     *     Array representation of a heap, which might be invalidated.
     * @param root
     *     Index of the root of the heap, which might be a subtree of the overall heap.
     * @param range
     *     Index of the last element in the heap, array elements with an index > range are not part of the heap.
     */
    public static void downHeap(int[] heap, int root, int range) {
      // index of left and right children
      int left = 2 * root + 1;
      int right = 2 * root + 2;
  
      int largest;
  
      if (left <= range && heap[left] > heap[root])
        largest = left;
      else
        largest = root;
  
      if (right <= range && heap[right] > heap[largest])
        largest = right;
  
      // heap property invalid at root
      if (largest != root) {
        swap(heap, root, largest);
        downHeap(heap, largest, range);
      }
    }
  
    /**
     * Turns an array of integers into a heap.
     * This is an in-place algorithm, the heap is built in the array itself.
     *
     * @param array
     *     an array of integer numbers.
     *     On return, this array represents a valid heap.
     */
    public static void heapify(int[] array) {
      if(array != null && array.length > 0)
          for(int i = array.length-1 ; i >= 0 ; i--){
              downHeap(array, i, array.length-1);
          }
      }
    
      /**
       * Sorts an array of integer numbers.
       * This is an in-place algorithm, the elements inside the array are being sorted without creating a copy of the array.
       *
       * @param array
       *     An array of integer numbers.
       *     On return, this array is sorted.
       */
      public static void inPlaceHeapSort(int[] array) {
          if(array != null && array.length > 1){
              heapify(array);
              inPlaceHeapSort(array, array.length-1);
          }
      }
  
      public static void inPlaceHeapSort(int[] array, int until) {
        swap(array, 0, until);
        if(until > 0){
          // for(int i = until - 1 ; i>= 0 ; i--){
          //   downHeap(array, i, until-1);
          // }
          downHeap(array, 0, until-1);
          inPlaceHeapSort(array, until-1);
        }
      }
  }