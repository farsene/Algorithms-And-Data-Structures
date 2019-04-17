import java.util.Arrays;

class Solution {
  /**
   * Takes an array and sorts it in an ascending order.
   * This has to be done by using merge sort.
   *
   * If the array is null, the metod should stop.
   *
   * @param arr
   *     - the array that needs to be sorted.
   */
  public static void mergeSort(int[] arr) {
    if(arr != null && arr.length != 0){

      if(arr.length < 2){
        return;
      }

      int mid = arr.length/2;
      int[] s1 = Arrays.copyOfRange(arr, 0, mid);
      int[] s2 = Arrays.copyOfRange(arr, mid, arr.length);

      mergeSort(s1);
      mergeSort(s2);

      merge(arr, s1, s2);
    }
  }

  public static void merge(int[] arr, int[] s1, int[] s2){
    int i = 0, j = 0, k=0;
    while(i < s1.length && j < s2.length){
      if(s1[i] < s2[j]){
        arr[k++] = s1[i++];
      }
      else{
        arr[k++] = s2[j++];
      }
    }

    while(i < s1.length){
      arr[k++] = s1[i++];
    }

    while(j < s2.length){
      arr[k++] = s2[j++];
    }
  }
}
//import java.util.*;
//class Solution {
//  /**
//   * Takes an array and sorts it in an ascending order.
//   * This has to be done by using merge sort.
//   *
//   * If the array is null, the metod should stop.
//   *
//   * @param arr
//   *     - the array that needs to be sorted.
//   */
//  public static void mergeSort(int[] arr) {
//    if(arr == null){
//
//    }else{
//          int n = arr.length;
//          if(n < 2)
//            return;
//
//          int mid = n/2;
//          int[] s1 = Arrays.copyOfRange(arr, 0, mid);
//          int[] s2 = Arrays.copyOfRange(arr, mid, n);
//
//          mergeSort(s1);
//          mergeSort(s2);
//
//          merge(s1, s2, arr);
//    }
//
//  }
//
//  public static void merge(int[] s1, int[] s2, int[] s){
//    int i = 0, j=0, k=0;
//
//    while(i < s1.length && j < s2.length){
//      if(s1[i] < s2[j]){
//        s[k++] = s1[i++];
//      }else{
//        s[k++] = s2[j++];
//      }
//    }
//
//    while(i < s1.length){
//      s[k++] = s1[i++];
//    }
//
//    while(j < s2.length){
//      s[k++] = s2[j++];
//    }
//  }
//}
////
