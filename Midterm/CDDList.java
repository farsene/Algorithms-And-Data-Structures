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
//class CDLList<T> {
//	class Node {
//		// Each Node object has these three fields
//		private T element;
//		private Node previous;
//		private Node next;
//
//		// Constructor: Creates a Node object with element = e, previous = p and next = n
//		Node(T e, Node p, Node n) {
//			element = e;
//			previous = p;
//			next = n;
//		}
//
//		// This function gets T e as input and sets e as the element of the Node
//		public void setElement(T e) {
//			element = e;
//		}
//
//		// This function returns the element variable of the Node
//		public T getElement() {
//			return element;
//		}
//
//		// This function gets Node n as input and sets the next variable of the current Node object as n.
//		public void setNext(Node n) {
//			next = n;
//		}
//
//		// This function returns the next Node
//		public Node getNext() {
//			return next;
//		}
//
//		// This function gets Node p as input and sets the previous variable of the current Node object as p.
//		public void setPrevious(Node p) {
//			previous = p;
//		}
//
//		// This function returns the previous Node
//		public Node getPrevious() {
//			return previous;
//		}
//	}
//
//	// Each object in CDLList has one field head, which points to the starting Node of CDLList.
//	private Node head;
//
//	/**
//	 * Constructor: initialises the head field as null
//	 */
//	public CDLList() {
//		head = null;
//	}
//
//	/**
//	 * @return The element in the first Node of this CDLL. If the list is empty, this method returns null.
//	 */
//	public T getFirst() {
//		if(head == null) {
//			return null;
//		}
//		return this.head.getElement();
//	}
//
//	/**
//	 * Adds element e in a new Node to the head of the list.
//	 *
//	 * @param e
//	 *     The element to add.
//	 */
//	public void addFirst(T e) {
//		if(this.head == null) {
//			this.head = new Node(e, null, null); // IS THIS ALRIGHT?
//			this.head.setPrevious(this.head);
//			this.head.setNext(this.head);
//		}
//		else {
//			Node tail = this.head.getPrevious();
//			Node oldHead = this.head;
//			Node n = new Node(e, tail, oldHead);
//			tail.setNext(n);
//			oldHead.setPrevious(n);
//			this.head = n;
//		}
//	}
//
//	/**
//	 * Remove the first Node in the list and return its element.
//	 *
//	 * @return The element of the first Node. If the list is empty, this method returns null.
//	 */
//	public T removeFirst() {
//	  if(this.head == null) {
//		  return null;
//	  }
//	  else if(this.head.getNext() == this.head){
//		  Node n = this.head;
//		  this.head = null;
//		  return n.getElement();
//	  }
//	  else{
//	    Node pred = this.head.getPrevious(); // what if is null ?
//		  Node next = this.head.getNext();
//
//		  this.head.setNext(null);
//		  this.head.setPrevious(null);
//		  T element = this.head.getElement();
//
//		  pred.setNext(next);
//		  next.setPrevious(pred);
//		  this.head = next;
//
//		  return element;
//	  }
//	}
//
//	/**
//	 * @return The element in the last Node of the CDLL. If the list is empty, this method returns null.
//	 */
//	public T getLast() {
//	  if(this.head == null) {
//		  return null;
//	  }
//	  return this.head.getPrevious().getElement();
//	}
//
//	/**
//	 * Adds element e in a new Node to the end of the list.
//	 *
//	 * @param e
//	 *     The element to add.
//	 */
//	public void addLast(T e) {
//		if(this.head == null) {
//			this.head = new Node(e, null, null);
//			this.head.setNext(this.head);
//			this.head.setPrevious(this.head);
//		}
//		else {
//			Node prev = this.head.getPrevious();
//			Node n = new Node(e, prev, this.head);
//			prev.setNext(n);
//			head.setPrevious(n);
//		}
//	}
//
//	/**
//	 * Remove the last Node in the list and return its element.
//	 *
//	 * @return The element of the last Node. If the list is empty, this method returns null.
//	 */
//	public T removeLast() {
//		if(this.head == null) {
//			return null;
//		}
//		else if(this.head.getPrevious() == this.head){
//		  Node n = this.head;
//		  this.head = null;
//		  return n.getElement();
//	  }
//		else {
//			Node n = this.head.getPrevious();
//			Node newTail = n.getPrevious();
//			this.head.setPrevious(newTail);
//			newTail.setNext(this.head);
//			n.setNext(null);
//			n.setPrevious(null);
//			return n.getElement();
//		}
//	}
//
//	/** s
//	 * Moves the head reference to the next element.
//	 */
//	public void rotateForward() {
//		if(this.head != null){
//		  this.head = this.head.getNext();
//		}
//	}
//
//	/**
//	 * Moves the head reference to the previous element.
//	 */
//	public void rotateBackward() {
//		if(this.head != null){
//		  this.head = this.head.getPrevious();
//		}
//	}
//}
