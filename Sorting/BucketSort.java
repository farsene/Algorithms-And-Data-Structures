import java.util.*;

class Solution {
  @SuppressWarnings("unchecked")
  public static Queue<Integer>[] fillBuckets(int[] array) {
    int vmin = 0;
    int vmax = 0;
    Queue<Integer>[] buckets = new Queue[vmax - vmin + 1];
    // TODO
    return buckets;
  }

  public static int[] readBuckets(Queue<Integer>[] buckets) {
    // TODO
  }
}
//import java.util.*;
//
//class Solution {
//  @SuppressWarnings("unchecked")
//  public static Queue<Integer>[] fillBuckets(int[] array) {
//    int vmin = Integer.MAX_VALUE;
//    int vmax = Integer.MIN_VALUE;
//
//    if(array == null || array.length == 0) {
//    	return new PriorityQueue[0];
//    }
//
//    for(int i = 0 ; i < array.length ; i++){
//      if(array[i] > vmax){
//        vmax = array[i];
//      }
//    }
//
//    vmin = vmax;
//
//    for(int i = 0 ; i < array.length ; i++){
//        if(array[i] < vmin){
//          vmin = array[i];
//        }
//    }
//
//    Queue<Integer>[] buckets = new Queue[vmax - vmin + 1];
//
//    for(int i = 0 ; i < buckets.length ; i++) {
//    	buckets[i] = new PriorityQueue<Integer>(); // or LinkedList
//    }
//    for(int i = 0 ; i < array.length ; i++){
//      buckets[array[i] - vmin].offer(array[i]);
//    }
//    return buckets;
//  }
//
//  public static int[] readBuckets(Queue<Integer>[] buckets) {
//    int vmax = 0;
//
//    if(buckets == null){
//      return null;
//    }
//
//    for(int i = 0 ; i < buckets.length ; i ++){
//      vmax = vmax + buckets[i].size();
//    }
//
//    int[] result = new int[vmax];
//    int k = 0;
//
//    for(int i = 0; i < buckets.length ; i ++){
//      while(buckets[i].isEmpty() == false){
//        int temp = buckets[i].remove();
//        result[k++] = temp;
//      }
//    }
//
//    return result;
//  }
//}
////
