class CSLList<T> {
  class Node {
    // Each Node object has these two fields
    private T element;
    private Node next;

    // Constructor: Creates a Node object with element = e and next = n
    Node(T e, Node n) {
      element = e;
      next = n;
    }

    // This function gets T e as input and sets e as the element of the Node
    public void setElement(T e) {
      element = e;
    }

    // This function returns the element variable of the Node
    public T getElement() {
      return element;
    }

    // This function gets Node n as input and sets the next variable of the current Node object as n.
    public void setNext(Node n) {
      next = n;
    }

    // This function returns the next Node
    public Node getNext() {
      return next;
    }
  }

  // Each object in CSLList has one field tail, which points to the tail Node of CSLList.
  private Node tail;

  /**
   * Constructor: initialises the tail field as null
   */
  public CSLList() {
    tail = null;
  }

  /**
   * @return The element in the first Node of this CSLL. If the list is empty, this method returns null.
   */
  public T getFirst() {
    if (tail == null)
      return null;
    return tail.getNext().getElement();
  }

  /**
   * @return The element in the last Node of this CSLL. If the list is empty, this method returns null.
   */
  public T getLast() {
    if (tail == null)
      return null;
    return tail.getElement();
  }

  /**
   * Adds element e in a new Node to the head of the list.
   *
   * @param e
   *     The element to add.
   */
  public void addFirst(T e) {
    // TODO
  }

  /**
   * Adds element e in a new Node to the tail of the list.
   *
   * @param e
   *     The element to add.
   */
  public void addLast(T e) {
    // TODO
  }

  /**
   * Remove the first Node in the list and return its element.
   *
   * @return The element of the first Node. If the list is empty, this method returns null.
   */
  public T removeFirst() {
    // TODO
  }

  /**
   * Rotates the list such that the second element in the list will become the first element in the list.
   * Example: rotating the list [1, 2, 3] will become [2, 3, 1].
   */
  public void rotate() {
    // TODO
  }

  /**
   * Merges this list and the other list by alternating elements from the two lists.
   * If one of the lists is longer than the other, the remaining elements are added to the end of the resulting list.
   *
   * @param other
   *     The other list to alternate elements with. Is treated as an empty list if it is null.
   * @return A new list with alternated elements of this list and the other list.
   */
  public CSLList<T> alternate(CSLList<T> other) {
    // TODO
  }

  /**
   * Removes all elements at the odd positions in this list.
   * Note that the head of the list is element number 0, which is an even position.
   */
  public void dropOdd() {
    // TODO
  }
}
//class CSLList<T> {
//  class Node {
//    // Each Node object has these two fields
//    private T element;
//    private Node next;
//
//    // Constructor: Creates a Node object with element = e and next = n
//    Node(T e, Node n) {
//      element = e;
//      next = n;
//    }
//
//    // This function gets T e as input and sets e as the element of the Node
//    public void setElement(T e) {
//      element = e;
//    }
//
//    // This function returns the element variable of the Node
//    public T getElement() {
//      return element;
//    }
//
//    // This function gets Node n as input and sets the next variable of the current Node object as n.
//    public void setNext(Node n) {
//      next = n;
//    }
//
//    // This function returns the next Node
//    public Node getNext() {
//      return next;
//    }
//  }
//
//  // Each object in CSLList has one field tail, which points to the tail Node of CSLList.
//  private Node tail;
//
//  /**
//   * Constructor: initialises the tail field as null
//   */
//  public CSLList() {
//    tail = null;
//  }
//
//  /**
//   * @return The element in the first Node of this CSLL. If the list is empty, this method returns null.
//   */
//  public T getFirst() {
//    if (tail == null)
//      return null;
//    return tail.getNext().getElement();
//  }
//
//  /**
//   * @return The element in the last Node of this CSLL. If the list is empty, this method returns null.
//   */
//  public T getLast() {
//    if (tail == null)
//      return null;
//    return tail.getElement();
//  }
//
//  /**
//   * Adds element e in a new Node to the head of the list.
//   *
//   * @param e
//   *     The element to add.
//   */
//  public void addFirst(T e) {
//    if(tail == null) {
//    	Node n = new Node(e, null);
//    	tail = n;
//    	tail.setNext(tail);
//    }else if(tail.getNext() == tail){
//    	Node n = new Node(e, tail);
//    	tail.setNext(n);
//    }else {
//    	Node second = tail.getNext();
//    	Node n = new Node(e, second);
//    	tail.setNext(n);
//    }
//  }
//
//  /**
//   * Adds element e in a new Node to the tail of the list.
//   *
//   * @param e
//   *     The element to add.
//   */
//  public void addLast(T e) {
//    if(tail == null) {
//    	Node n =  new Node(e, null);
//    	tail = n;
//    	tail.setNext(tail);
//    }else {
//    	this.addFirst(e);
//    	this.rotate();
//    }
//  }
//
//  /**
//   * Remove the first Node in the list and return its element.
//   *
//   * @return The element of the first Node. If the list is empty, this method returns null.
//   */
//  public T removeFirst() {
//	  if(tail == null) {
//		  return null;
//	  }else if(tail.getNext() == tail) {
//		  T element = tail.getElement();
//		  tail = null;
//		  return element;
//	  }else {
//		  Node n = tail.getNext();
//		  Node first = n.getNext();
//		  T element = n.getElement();
//		  tail.setNext(first);
//		  n = null;
//		  return element;
//	  }
//  }
//
//  /**
//   * Rotates the list such that the second element in the list will become the first element in the list.
//   * Example: rotating the list [1, 2, 3] will become [2, 3, 1].
//   */
//  public void rotate() {
//    if(tail != null) {
//    	tail = tail.getNext();
//    }
//  }
//
//  /**
//   * Merges this list and the other list by alternating elements from the two lists.
//   * If one of the lists is longer than the other, the remaining elements are added to the end of the resulting list.
//   *
//   * @param other
//   *     The other list to alternate elements with. Is treated as an empty list if it is null.
//   * @return A new list with alternated elements of this list and the other list.
//   */
//  public CSLList<T> alternate(CSLList<T> other) { // TODO
//	CSLList<T> result = new CSLList<T>();
//	if(this == null && other == null || this.tail == null && other.tail == null) { //WTF
//		return result;
//	}
//	else {
//	  if(other != null)
//		while(this.tail != null && other.tail != null) {
//			result.addLast(this.tail.getNext().getElement());
//			this.removeFirst();
//			result.addLast(other.tail.getNext().getElement());
//			other.removeFirst();
//		}
//		while(this.tail != null) {
//			result.addLast(this.tail.getNext().getElement());
//			this.removeFirst();
//		}
//		if(other != null){
//		  while(other.tail != null) {
//			result.addLast(other.tail.getNext().getElement());
//			other.removeFirst();
//		}
//		}
//
//		return result;
//	}
//
//  }
//
//  /**
//   * Removes all elements at the odd positions in this list.
//   * Note that the head of the list is element number 0, which is an even position.
//   */
//  public void dropOdd() { // TO DO
//    if( this.tail != null  && this.tail.getNext() != tail){
//      Node n = tail;
//      this.rotate();
//      while(this.tail != n ){
//        if(this.tail.getNext() == n){
//          this.removeFirst();
//          break;
//        }
//        this.removeFirst();
//        this.rotate();
//      }
//
//
//    }
//  }
//
//  public static void main(String[] args) {
//	    CSLList<String> list = new CSLList<>();
//	    list.addFirst("Hello World");
//	    System.out.println();
//  }
//}
