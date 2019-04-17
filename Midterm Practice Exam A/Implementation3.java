import java.util.*;

class Solution {
  /**
   * Takes a list and returns a new list sorted in descending order.
   * This is done by using the priority queue `queue`.
   *
   * Return null if list is null.
   *
   * @param list
   *     the array that needs to be sorted.
   */
  public static List<Integer> pqSort(List<Integer> list) {
    LibraryPQ queue = new SolutionPQ();
    // TODO

  }
}

class SolutionPQ extends LibraryPQ {
  /**
   * Restores the heap property in a heap represented as an arraylist.
   * The method compares the node to its parent and swaps if necessary.
   *
   * @param i
   *     index of the node
   */
  @Override
  public void upHeap(int i) {
    // TODO
  }
}
//import java.util.*;
//
//class Solution {
//  /**
//   * Takes a list and returns a new list sorted in descending order.
//   * This is done by using the priority queue `queue`.
//   *
//   * Return null if list is null.
//   *
//   * @param list
//   *     the array that needs to be sorted.
//   */
//  public static List<Integer> pqSort(List<Integer> list) {
//    LibraryPQ queue = new SolutionPQ();
//    if(list == null){
//      return null;
//    }else if(list.size() == 0 || list.size() == 1){
//      return list;
//    }else{
//      List<Integer> result = new ArrayList<Integer>();
//      for(int i = 0 ; i < list.size() ; i ++){
//        queue.insert(list.get(i));
//      }
//      for(int i = 0 ; i < list.size() ; i ++){
//        result.add(queue.removeMax());
//      }
//       return result;
//    }
//
//  }
//}
//
//class SolutionPQ extends LibraryPQ {
//  /**
//   * Restores the heap property in a heap represented as an arraylist.
//   * The method compares the node to its parent and swaps if necessary.
//   *
//   * @param i
//   *     index of the node
//   */
//  @Override
//  public void upHeap(int i) {
//      while(this.getInHeap(i) > this.getInHeap((i-1)/2)){
//        this.swap(i,(i-1)/2);
//        i=(i-1)/2;
//      }
//    }
//  }
////
