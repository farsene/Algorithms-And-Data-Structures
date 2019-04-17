import java.util.*;

class Solution {
  /**
   * Sorts a list of Dutch mobile phone numbers using LSD radix sort.
   *
   * @param phoneNumbers
   *     The list of phone numbers to sort.
   * @return The sorted list of phone numbers.
   * @throws NullPointerException
   *     If `phoneNumbers` equals `null`.
   */
  static List<String> radixSortLSD(List<String> phoneNumbers) {
    // TODO
  }
}
//import java.util.*;
//
//class Solution {
//  /**
//   * Sorts a list of Dutch mobile phone numbers using LSD radix sort.
//   *
//   * @param phoneNumbers
//   *     The list of phone numbers to sort.
//   * @return The sorted list of phone numbers.
//   * @throws NullPointerException
//   *     If `phoneNumbers` equals `null`.
//   */
//  static List<String> radixSortLSD(List<String> phoneNumbers) {
//    if(phoneNumbers == null){
//      throw new NullPointerException();
//    }
//
//    for(int i = 9 ; i >= 2 ; i--) {
//      sort(phoneNumbers, i);
//    }
//
//    return phoneNumbers;
//  }
//
//  static void sort(List<String> list, int index) {
//    ArrayList<String>[] buckets = new ArrayList[26];
//
//    for(int i = 0 ; i < buckets.length ; i++){
//      buckets[i] = new ArrayList<String>();
//    }
//
//    for(int i = 0 ; i < list.size() ; i++){
//      buckets[list.get(i).toCharArray()[index] - 48].add(list.get(i));
//    }
//
//    int curIndex = 0;
//    for(int i = 0 ;i < buckets.length ; i++){
//      for(String s : buckets[i]){
//        list.set(curIndex, s);
//        curIndex++;
//      }
//    }
//  }
//}
////import java.util.*;
////
////class Solution {
////	/**
////	 * Sorts a list of Dutch mobile phone numbers using LSD radix sort.
////	 *
////	 * @param phoneNumbers The list of phone numbers to sort.
////	 * @return The sorted list of phone numbers.
////	 * @throws NullPointerException If `phoneNumbers` equals `null`.
////	 */
////	static List<String> radixSortLSD(List<String> phoneNumbers) {
////		if (phoneNumbers == null) {
////			throw new NullPointerException();
////		} else if (phoneNumbers.size() == 0 || phoneNumbers.size() == 1) {
////			return phoneNumbers;
////		} else {
////			int l = 10;//phoneNumbers.get(0).length();
////
////			int n = phoneNumbers.size();
////			for (int c = l - 1; c >= 0; c--) {
////				//insertion sort l times
////				for(int i = 1 ; i < n ; i++) {
////					String temp = phoneNumbers.get(i);
////					int j = i;
////					while(j > 0 && phoneNumbers.get(j-1).charAt(c) >= temp.charAt(c)) {
////						phoneNumbers.set(j, phoneNumbers.get(j-1));
////						j--;
////					}
////					phoneNumbers.set(j, temp);
////				}
////			}
////			return phoneNumbers;
////		}
////	}
////}
