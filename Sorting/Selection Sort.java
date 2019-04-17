class Solution {
 /**
  * @param elements
  *     Array of integers to be sorted.
  */
 public static void selectionSort(int[] elements) {
   int n = elements.length;
   int min, k;
   for(int i = 0; i < n ; i++){

     min = elements[i];
     k = i;

     for(int j = i ; j < n ; j++){
       if(elements[j] < min){
         min = elements[j];
         k = j;
       }
     }

     int temp = elements[i];
     elements[i] = min;
     elements[k] = temp;
   }
 }
}
//
