class SLList<T> {
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

  // Each object in SLList has one field head, which points to the starting Node of SLList.
  private Node head;

  /**
   * Constructor: initialises the head field as null
   */
  public SLList() {
    head = null;
  }

  /**
   * @return The element in the first Node of this SLL. If the list is empty, this method returns null.
   */
  public T getFirst() {
    if (head == null)
      return null;
    return head.getElement();
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
   * Remove the first Node in the list and return its element.
   *
   * @return The element of the first Node. If the list is empty, this method returns null.
   */
  public T removeFirst() {
    // TODO
  }

  /**
   * Combine this list with the other list.
   * Each element of the resulting list is a Pair object holding one element of this list
   * and the corresponding element at the same position of the other list.
   * If one list is longer than the other, any extra elements should be dropped.
   * Example: Zipping [1, 2] with [5, 6, 7] results in [(1, 5), (2, 6)], where (x, y) denotes a Pair object.
   *
   * @param other
   *     The other list to combine elements with. Is treated as an empty list if it is null.
   * @return A new list with alternated elements of this list and the other list.
   */
  public SLList<Pair<T, T>> zip(SLList<T> other) {
    // TODO
  }

  /**
   * Appends another SLL to this SLL.
   *
   * @param other
   *     The list to append to this list. Is treated as an empty list if it is null.
   */
  public void append(SLList<T> other) {
    // TODO
  }

  /**
   * Removes all elements at the even positions in this list.
   * Note that the head of the list is element number 0, which is an even position.
   */
  public void dropEven() {
    // TODO
  }
}

//class SLList<T> {
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
//  // Each object in SLList has one field head, which points to the starting Node of SLList.
//  private Node head;
//
//  /**
//   * Constructor: initialises the head field as null
//   */
//  public SLList() {
//    head = null;
//  }
//
//  /**
//   * @return The element in the first Node of this SLL. If the list is empty, this method returns null.
//   */
//  public T getFirst() {
//    if (head == null)
//      return null;
//    return head.getElement();
//  }
//
//  /**
//   * Adds element e in a new Node to the head of the list.
//   *
//   * @param e
//   *     The element to add.
//   */
//  public void addFirst(T e) {
//      Node n = new Node(e, head);
//      head = n;
//  }
//
//  /**
//   * Remove the first Node in the list and return its element.
//   *
//   * @return The element of the first Node. If the list is empty, this method returns null.
//   */
//  public T removeFirst() {
//    if(head == null){
//      return null;
//    }else if(head.getNext() == null){
//      T element = head.getElement();
//      head = null;
//      return element;
//    }else{
//      T element = head.getElement();
//      head = head.getNext();
//      return element;
//    }
//  }
//
//  /**
//   * Combine this list with the other list.
//   * Each element of the resulting list is a Pair object holding one element of this list
//   * and the corresponding element at the same position of the other list.
//   * If one list is longer than the other, any extra elements should be dropped.
//   * Example: Zipping [1, 2] with [5, 6, 7] results in [(1, 5), (2, 6)], where (x, y) denotes a Pair object.
//   *
//   * @param other
//   *     The other list to combine elements with. Is treated as an empty list if it is null.
//   * @return A new list with alternated elements of this list and the other list.
//   */
//  public SLList<Pair<T, T>> zip(SLList<T> other) {
//    SLList<Pair<T, T>> result = new SLList<Pair<T, T>>();
//    if(other == null || this.head == null || other.head == null){
//      return result;
//    }else{
//      SLList<Pair<T, T>> reverse = new SLList<Pair<T, T>>();
//      while(this.head != null && other.head != null){
//        T a = this.removeFirst();
//        T b = other.removeFirst();
//        reverse.addFirst(new Pair<T,T>(a,b));
//      }
//      while(reverse.head != null){
//        result.addFirst(reverse.removeFirst());
//      }
//      return result;
//    }
//  }
//
//  /**
//   * Appends another SLL to this SLL.
//   *
//   * @param other
//   *     The list to append to this list. Is treated as an empty list if it is null.
//   */
//  public void append(SLList<T> other) {
//    if(head!= null && other != null && other.head != null){
//      Node it = this.head;
//      while(it.getNext() != null){
//        it = it.getNext();
//      }
//      it.setNext(other.head);
//    }else if(other != null && other.head != null){
//      this.head = other.head;
//    }
//  }
//
//  /**
//   * Removes all elements at the even positions in this list.
//   * Note that the head of the list is element number 0, which is an even position.
//   */
//  public void dropEven() {
//    if(this.head != null){
//      if(this.head.getNext()==null){
//        this.removeFirst();
//      }else{
//        this.removeFirst();
//        Node temp = this.head;
//        while(temp.getNext() != null){
//          temp.setNext(temp.getNext().getNext());
//          temp = temp.getNext();
//          if(temp == null)
//            break;
//        }
//      }
//    }
//  }
//}
