class Solution {
  /**
   * Checks for a String represented as a SLList whether this String is a palindrome.
   * This is done by using a stack.
   *
   * An empty String or null should return true.
   *
   * @param list
   *     SLList used to represent a String
   * @return true if the String represented as a SLList is a palindrome, otherwise false
   */
  public static boolean checkPalindrome(SLList list) {
    LibraryStack<Character> stack = new LibraryStack<>();
    // TODO

  }
}
import java.util.*;

class LibraryStack<T> {
  private LinkedList<T> ll;

  public LibraryStack() {
    ll = new LinkedList<>();
  }

  /**
   * @return true iff the stack is empty, else false
   */
  public boolean isEmpty() {
    return ll.isEmpty();
  }

  /**
   * @return amount of elements in stack
   */
  public int size() {
    return ll.size();
  }

  /**
   * Pushes a new element to the stack.
   *
   * @param e
   *     element to be added to the stack
   */
  public void push(T e) {
    ll.offer(e);
  }

  /**
   * Removes top element from the stack and returns it.
   *
   * @return top element of the stack
   * @throws NoSuchElementException
   *     iff the stack is empty
   */
  public T pop() throws NoSuchElementException {
    return ll.removeLast();
  }

  /**
   * Returns the top element of the stack, without removing it.
   *
   * @return top element of the stack
   * @throws NoSuchElementException
   *     iff the stack is empty
   */
  public T peek() throws NoSuchElementException {
    if (ll.peekLast() == null) {
      throw new NoSuchElementException();
    }
    return ll.peekLast();
  }
}

class SLList {
  private LinkedList<Character> ll;

  /**
   * Creates a new SLList with a String, each character will be a node.
   * The first character in the String will be the head.
   *
   * @param s
   *     String that this SLList represents.
   */
  public SLList(String s) {
    ll = new LinkedList<>();
    for (int i = s.length() - 1; i >= 0; i--) {
      ll.addFirst(s.charAt(i));
    }
  }

  /**
   * Removes the first element in the list and returns it.
   *
   * @return first element in the list
   */
  public Character removeFirst() {
    return ll.poll();
  }

  /**
   * Returns the first element in the first and returns it, without removing it.
   *
   * @return first element in the list
   */
  public Character getFirst() {
    return ll.peek();
  }

  /**
   * Returns the size of the list.
   *
   * @return the size of the list
   */
  public int size() {
    return ll.size();
  }
}
