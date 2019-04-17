class Solution {
  /**
   * Checks for a String represented as a SLList whether this String is a palindrome.
   * This is done by using a queue.
   *
   * An empty String or null should return true.
   *
   * @param list
   *     SLList used to represent a String
   * @return true if the String represented as a SLList is a palindrome, otherwise false
   */
  public static boolean checkPalindrome(SLList list) {
    LibraryQueue<Entry> queue = new LibraryQueue<>();

    if(list == null || list.size() == 0 || list.size() == 1){
      return true;
    }

    boolean result = true;

    int size = list.size();
    int mid = size/2;

    for(int i = 1 ; i <= mid ; i++){
      queue.enqueue(new Entry(i, list.removeFirst()));
    }

    if(size % 2 == 1){
      list.removeFirst();
    }

    for(int i = 1 ; i <= mid ; i ++){
      char c1 = queue.dequeue().getElement();
      char c2 = list.removeFirst();
      if(c1 != c2){
        result = false;
      }
    }

    return result;
  }
}
//class Solution {
//  /**
//   * Checks for a String represented as a SLList whether this String is a palindrome.
//   * This is done by using a queue.
//   *
//   * An empty String or null should return true.
//   *
//   * @param list
//   *     SLList used to represent a String
//   * @return true if the String represented as a SLList is a palindrome, otherwise false
//   */
//  public static boolean checkPalindrome(SLList list) {
//    LibraryQueue<Entry> queue = new LibraryQueue<>();
//	    if(list == null || list.size() == 0 || list.size() == 1) {
//	    	return true;
//	    }
//
//	    int size = list.size();
//	    int midPosition = size/2;
//	    int i;
//
//	    for( i = 1; i <= midPosition ; i++) {
//	    	char element = list.removeFirst();
//	    	queue.enqueue(new Entry(i, element));
//	    }
//
//	    if(size%2 != 0) {
//	    	list.removeFirst();
//	    	i++; // ADDED LATER NEEDED?
//	    }
//
//	    while(i <= size) {
//	    	char elQueue = queue.dequeue().getElement();
//	    	char elList = list.removeFirst();
//	    	if(elQueue != elList) {
//	    		return false;
//	    	}
//	    	i++;
//	    }
//	    return true;
//  }
//}
////
