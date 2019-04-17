
class Solution {
 /**
  * @param elements
  *     Array of integers to be sorted.
  */
 public static void quickSort(int[] elements) {
   quickSort(elements, 0, elements.length-1);
 }
 
 public static void quickSort(int[] elements, int a, int b){

   if(a >= b){
     return;
   }

   int temp;

   int pivot = elements[b],
     left = a,
     right = b-1;


   while(left <= right){
     while(left <= right && elements[left] <= pivot){
       left++;
     }
     while(left <= right && elements[right] >= pivot){
       right--;
     }
     if(left <= right){
       temp = elements[left];
       elements[left] = elements[right];
       elements[right] = temp;
       left++;
       right--;
     }
   }

   temp = elements[left];
   elements[left] = elements[b];
   elements[b] = temp;

   quickSort(elements, a, left-1);
   quickSort(elements, left+1, b);

 }
}
//
