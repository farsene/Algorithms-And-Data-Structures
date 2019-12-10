class ArrayStack {
  private Object[] elements;
  private int size;
  private int capacity;

  /**
   * Creates an empty ArrayStack with capacity 1.
   */
  public ArrayStack() {
    this.elements = new Object[1];
    this.capacity = 1;
    this.size = 0;
  }

  /**
   * @return The size of this ArrayStack.
   */
  public int size() {
    return this.size;
  }

  /**
   * @return `true` iff this ArrayStack is empty, `false` otherwise.
   */
  public boolean isEmpty() {
    return this.size == 0;
  }

  /**
   * @return `true` iff the size is equal to the capacity, `false` otherwise.
   */
  public boolean isFull() {
    return this.size == this.capacity;
  }

  /**
   * @return the top element of the stack without removing it
   */
  public Object peek() throws EmptyStackException {
    if(size > 0){
      return this.elements[size-1];
    }
    throw new EmptyStackException();
  }

  /**
   * Adds `o` to the stack.
   * If capacity of stack was too small, capacity is doubled and `o` is added.
   *
   * @param o
   *     the element to add to the stack.
   */
  public void push(Object o) {
    if(this.size == this.capacity){
      int capacity2 = this.capacity * 2;
      Object[] result = new Object[capacity2];
      
      for(int i = 0 ; i < this.capacity; i++){
        result[i] = this.elements[i];
      }
      
      result[size] = o;
      this.size++;
      this.elements = result;
      this.capacity = capacity2;
    }
    else{
      this.elements[size] = o;
      size++;
    }
    
  }

  /**
   * Removes the top element from the stack.
   * If removing top would make the stack use less than 25% of its capacity,
   * then the capacity is halved.
   *
   * @return the element which was at the top of the stack.
   * @throws EmptyStackException
   *     iff the queue is empty
   */
  public Object pop() throws EmptyStackException {
    Object obj;
    if(this.isEmpty()){
      throw new EmptyStackException();
    }
    if(this.size-1 < capacity/4){
      this.capacity = this.capacity/2;
      
       Object[] result = new Object[this.capacity];
    
      for(int i =0 ;i < this.size ; i++){
        result[i] = this.elements[i];
       }
        this.elements = result;
    }
    
    obj = this.elements[this.size-1];
    
    this.size--;
   
    
    return obj;
  }

  /**
   * @return a String representation of the ArrayStack
   * Example output for ArrayStack with 2 elements and capacity 5:
   * <ArrayStack[1,2]>(Size=2, Cap=5)
   */
  public String toString() {
     String result = "<ArrayStack[";
     if(size == 0){
       result = result + "]>(Size=0, Cap=" + this.capacity + ")";
       return result;
     }
     else{
       for(int i = 0 ; i < this.size ; i++){
         result = result + this.elements[i] +",";
       }
       result = result.substring(0, result.length()-1);
       result = result + "]>(Size=" + this.size + ", Cap=" + this.capacity + ")";
       return result;
     }
  }

  // For testing, do not remove or change.
  public Object[] getElements() {
    return elements;
  }
}
//
