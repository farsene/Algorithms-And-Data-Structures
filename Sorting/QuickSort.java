
  class Solution {
 /**
  * Sort elements with the quicksort algorithm.
  * @param elements the elements to be sorted
  */
 public static void quickSort(int[] elements) {
   if(elements.length > 0){
     quickSort(elements, 0, elements.length-1);
   }
 }

 /**
  * The recursive quicksort method.
  * @param elements the elements to be sorted
  * @param low low index boundary
  * @param high high index boundary
  */
 public static void quickSort(int[] elements, int low, int high) {
   if(high > low){
    int indexPivot = partition(elements, low, high);
    quickSort(elements, low, indexPivot - 1);

    quickSort(elements,indexPivot, high);
   }

   }


 /**
  * Pick a pivot, partition the elements according to that, and return
  * the position `p` of the pivot in the partitioned array. All elements
  * before `p` will be smaller than `element[p]` and all elements after
  * position `p` will be larger than `element[p]`.
  * @param elements the array with elements
  * @param low low index boundary
  * @param high high index boundary
  * @return the position of the element that is in its final position.
  */
 public static int partition(int[] elements, int low, int high) {
   int left = low,
   right = high -1;
   int pivot = elements[high];

   while(left <= right){
     while(left <= right && elements[left] <= pivot){
       left++;
     }
     while(left <= right && elements[right] >= pivot){
       right--;
     }
     if(left <= right){
       swap(elements, left, right);
       left++;
       right--;
     }
   }

   swap(elements, left, high);

   return left;
 }

 /**
  * In-place array swap
  * @param elements the array with elements
  * @param a index of first element to swap
  * @param b index of second element to swap
  */
 public static void swap(int[] elements, int a, int b) {
   int temp = elements[a];
   elements[a] = elements[b];
   elements[b] = temp;
 }
}//
