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
        for(int i = array.length ; i > 0 ; i++){
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
        
    }
  }
//   In this question, you are expected to implement In-Place Heap Sort. Since the implementation is in-place,
// you are not allowed to define a new data structure for storing the heap. 
//You will only operate on the given input array. A basic description of how In-Place Heap Sort works can be given as:

// Build a max-heap from the input array.
// Swap the first and last elements of the heap.
// Perform bubbling to sift the new first element to the appropriate index in the heap and restore the heap-order.
// Go to step (2) unless the heap contains only one element.
// We provide you with skeleton codes of four methods. The first three are helper functions you can use in your implementation of the in-place heap sort algorithm inPlaceHeapSort. You also have to implement heapify, but methods swap and downheap are already implemented and need not be changed.

// swap(int[] a, int i, int j)
// downheap(int[] heap, int root, int range)
// heapify(int[] array)
// inPlaceHeapSort(int[] array)
// You can check the comments in the source code to see what each function implements.

// A visualisation of how heap sort works is given below.

// IMPORTANT: If your solution is not in-place, your grade for this exercise will be overridden to 1.

// IMPORTANT: Your solution may be manually checked to see if you have actually implemented the exercise and have not cheated the spec test system in any way. Depending on that, points may be deducted.

// IMPORTANT: Make sure your implementation compiles. If it does not compile, you automatically receive a 0.