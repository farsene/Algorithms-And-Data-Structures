class CDLList<T> {
  class Node {
    // Each Node object has these three fields
    private T element;
    private Node previous;
    private Node next;

    // Constructor: Creates a Node object with element = e, previous = p and next = n
    Node(T e, Node p, Node n) {
      element = e;
      previous = p;
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

    // This function gets Node p as input and sets the previous variable of the current Node object as p.
    public void setPrevious(Node p) {
      previous = p;
    }

    // This function returns the previous Node
    public Node getPrevious() {
      return previous;
    }
  }

  // Each object in CDLList has one field head, which points to the starting Node of CDLList.
  private Node head;

  /**
   * Constructor: initialises the head field as null
   */
  public CDLList() {
    head = null;
  }

  /**
   * @return The element in the first Node of this CDLL. If the list is empty, this method returns null.
   */
  public T getFirst() {
    // TODO
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
   * @return The element in the last Node of the CDLL. If the list is empty, this method returns null.
   */
  public T getLast() {
    // TODO
  }

  /**
   * Adds element e in a new Node to the end of the list.
   *
   * @param e
   *     The element to add.
   */
  public void addLast(T e) {
    // TODO
  }

  /**
   * Remove the last Node in the list and return its element.
   *
   * @return The element of the last Node. If the list is empty, this method returns null.
   */
  public T removeLast() {
    // TODO
  }

  /**
   * Moves the head reference to the next element.
   */
  public void rotateForward() {
    // TODO
  }

  /**
   * Moves the head reference to the previous element.
   */
  public void rotateBackward() {
    // TODO
  }
}