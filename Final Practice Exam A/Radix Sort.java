import java.util.*;

class Solution {
 /**
  * Sorts a list of words using MSD radix sort.
  *
  * @param words
  *     The list of words to sort.
  * @return The sorted list of words.
  * @throws NullPointerException
  *     If `words` equals `null`.
  */
 static List<String> radixSortMSD(List<String> words) {
   if(words == null){
       throw new NullPointerException();
   }
   sort(words, 0, 0, words.size()-1);
   return words;
 }

 static void sort(List<String> words, int index, int start, int end){
   if(start >= end){
       return;
   }

   // array for words that are shorter than the index.
   List<String> empty = new ArrayList<String>();
   // array for keeping up all the words depending on index.
   List<String>[] buckets = new ArrayList[26];

   // initializing the buckets.
   for(int i = 0 ; i < buckets.length ; i ++){
       buckets[i] = new ArrayList<String>();
   }

   //adding everything in the corresponding place. O(n)
   for(int i = start; i <= end ; i++){
       String s = words.get(i);
       if(index < s.length()){
           int k = s.toCharArray()[index] - 'a';
           buckets[k].add(s);
       }else{
           empty.add(s);
       }
   }

   //writing back the empty elements.
   int curIndex = start;
   for(int i = 0 ; i < empty.size() ; i++){
       words.set(curIndex, empty.get(i));
       curIndex++;
   }

   //writing back all the elements and calling the method reccursively for each bucket
   for(int i = 0 ; i < buckets.length ; i++){
       int newStart = curIndex;
       for(String s : buckets[i]){
           words.set(curIndex, s);
           curIndex++;
       }
       int newEnd = curIndex - 1;
       sort(words, index+1, newStart, newEnd);
   }

 }
}

////import java.util.*;
////
////class Solution {
////  /**
////   * Sorts a list of words using MSD radix sort.
////   *
////   * @param words
////   *     The list of words to sort.
////   * @return The sorted list of words.
////   * @throws NullPointerException
////   *     If `words` equals `null`.
////   */
////  static List<String> radixSortMSD(List<String> words) {
////    if(words == null){
////      throw new NullPointerException();
////    }
////    List<String>[] buckets = new ArrayList[26];
////    for(int i = 0 ; i < buckets.length; i++){
////      buckets[i] = new ArrayList<String>();
////    }
////
////    boolean flag = false;
////    int tmp = -1, k = 0;
////
////    while(!flag){
////      flag = true;
////      for(String s : words){
////        int ok = 1;
////        try{
////          char c = s.charAt(k);
////        }catch(IndexOutOfBoundsException e){
////          ok = 0;
////        }
////        if(ok == 1){
////          flag = false;
////          buckets[(int)(s.charAt(k))-97].add(s);
////        }
////      }
////
////      int pos = 0;
////      for(int j = 0 ; j < buckets.length ; j++){
////        for(int x = 0 ; x < buckets[j].size() ; x++){
////          words.set(pos, buckets[j].get(x));
////          pos++;
////        }
////        buckets[j] = new ArrayList<String>();
////      }
////      k++;
////    }
////    return words;
////  }
////}
