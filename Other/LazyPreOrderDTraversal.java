
import java.util.*;

/**
* Iterates lazily over a binary tree in a depth-first manner. For instance a tree
* with 8 as it's root and 4 and 10 as it's children should be iterated as: 8 ->
* 4 -> 10.
*/
class BinaryTreeIterator<V> implements Iterator<V> {
 Stack<Position<V>> stack;
 BTree<V> tree;
 /**
  * Constructor.
  * Should reset on a new tree.
  *
  * @param tree
  *     takes the tree
  */
 public BinaryTreeIterator(BTree<V> tree) {
   this.stack = new Stack<Position<V>>();
   this.tree = tree;
   if(this.tree.getRoot() != null)
   this.stack.push(this.tree.getRoot());
 }

 /**
  * @return True if there is a next element in the iterator, else False
  */
 @Override
 public boolean hasNext() {
   if(this.stack.size() > 0){
     return true;
   }
   else return false;
 }

 /**
  * Get the next element of the iterator and shift
  * iterator by one.
  *
  * @return current element value
  * @post iterator is moved to next element
  */
 @Override
 public V next(){
   if(this.stack.size() == 0){
     return null;
   }
   Position<V> element = this.stack.peek();
   this.remove();
   return element.getValue();
 }

 /**
  * Skip a single element of the iterator.
  *
  * @post iterator is moved to next element.
  */
 @Override
 public void remove(){
   if(this.hasNext()){
     Position<V> element = this.stack.peek();
     try{
       this.stack.pop();
      if(this.tree.hasRight(element)){
         this.stack.push(this.tree.getRight(element));
      }
       if(this.tree.hasLeft(element)){
         this.stack.push(this.tree.getLeft(element));
      }
     }
     catch(InvalidPositionException e){

     }
     }
   }
}

/**
* DO NOT MODIFY
*/
interface Position<V> {
 /**
  * @return the key of this position.
  */
 public int getKey();

 /**
  * @return the value of the position.
  */
 public V getValue();
}

interface BTree<V> {
 /**
  * @return the root of the tree
  */
 public Position<V> getRoot();

 /**
  * Get the left child of a position.
  *
  * @param v
  *     the position to get the child of.
  * @return the child of the position iff hasLeft(v) is true.
  * @throws InvalidPositionException
  *     else
  */
 public Position<V> getLeft(Position<V> v) throws InvalidPositionException;

 /**
  * Get the right child of a position.
  *
  * @param v
  *     the position to get the child of.
  * @return the child of the position iff hasRight(v) is true.
  * @throws InvalidPositionException
  *     else
  */
 public Position<V> getRight(Position<V> v) throws InvalidPositionException;

 /**
  * Check if a position has a left child.
  *
  * @param v
  *     position to check.
  * @return true iff v has a left child.
  * @throws InvalidPositionException
  *     if v is not valid (e.g. null)
  */
 public boolean hasLeft(Position<V> v) throws InvalidPositionException;

 /**
  * Check if a position has a right child.
  *
  * @param v
  *     position to check.
  * @return true iff v has a right child.
  * @throws InvalidPositionException
  *     if v is not valid (e.g. null)
  */
 public boolean hasRight(Position<V> v) throws InvalidPositionException;

 /**
  * Adds a new entry to the tree.
  *
  * @param key
  *     to use.
  * @param value
  *     to add.
  */
 public void add(int key, V value);
}
//import java.util.*;
//
///**
// * Iterates lazily over a binary tree in a depth-first manner. For instance a tree
// * with 8 as it's root and 4 and 10 as it's children should be iterated as: 8 ->
// * 4 -> 10.
// */
//class BinaryTreeIterator<V> implements Iterator<V> {
//  Stack<Position<V>> stack;
//  BTree<V> tree;
//  /**
//   * Constructor.
//   * Should reset on a new tree.
//   *
//   * @param tree
//   *     takes the tree
//   */
//  public BinaryTreeIterator(BTree<V> tree) {
//    this.stack = new Stack<Position<V>>();
//    this.tree = tree;
//    this.stack.push(this.tree.getRoot());
//  }
//
//  /**
//   * @return True if there is a next element in the iterator, else False
//   */
//  @Override
//  public boolean hasNext() {
//    if(this.stack.size() > 0){
//      return true;
//    }
//    else return false;
//  }
//
//  /**
//   * Get the next element of the iterator and shift
//   * iterator by one.
//   *
//   * @return current element value
//   * @post iterator is moved to next element
//   */
//  @Override
//  public V next() throws InvalidPositionException{
//    if(this.stack.size() == 0){
//      return null;
//    }
//    Position<V> element = this.stack.peek();
//    this.remove();
//    return element.getValue();
//  }
//
//  /**
//   * Skip a single element of the iterator.
//   *
//   * @post iterator is moved to next element.
//   */
//  @Override
//  public void remove() throws InvalidPositionException{
//    if(this.stack.size() != 0){
//      Position<V> element = this.stack.peek();
//      if(this.tree.hasRight(element)){
//        this.stack.push(this.tree.getRight(element));
//      }
//      if(this.tree.hasLeft(element)){
//        this.stack.push(this.tree.getLeft(element));
//      }
//      this.stack.pop();
//    }
//  }
//}
//
///**
// * DO NOT MODIFY
// */
//interface Position<V> {
//  /**
//   * @return the key of this position.
//   */
//  public int getKey();
//
//  /**
//   * @return the value of the position.
//   */
//  public V getValue();
//}
//
//interface BTree<V> {
//  /**
//   * @return the root of the tree
//   */
//  public Position<V> getRoot();
//
//  /**
//   * Get the left child of a position.
//   *
//   * @param v
//   *     the position to get the child of.
//   * @return the child of the position iff hasLeft(v) is true.
//   * @throws InvalidPositionException
//   *     else
//   */
//  public Position<V> getLeft(Position<V> v) throws InvalidPositionException;
//
//  /**
//   * Get the right child of a position.
//   *
//   * @param v
//   *     the position to get the child of.
//   * @return the child of the position iff hasRight(v) is true.
//   * @throws InvalidPositionException
//   *     else
//   */
//  public Position<V> getRight(Position<V> v) throws InvalidPositionException;
//
//  /**
//   * Check if a position has a left child.
//   *
//   * @param v
//   *     position to check.
//   * @return true iff v has a left child.
//   * @throws InvalidPositionException
//   *     if v is not valid (e.g. null)
//   */
//  public boolean hasLeft(Position<V> v) throws InvalidPositionException;
//
//  /**
//   * Check if a position has a right child.
//   *
//   * @param v
//   *     position to check.
//   * @return true iff v has a right child.
//   * @throws InvalidPositionException
//   *     if v is not valid (e.g. null)
//   */
//  public boolean hasRight(Position<V> v) throws InvalidPositionException;
//
//  /**
//   * Adds a new entry to the tree.
//   *
//   * @param key
//   *     to use.
//   * @param value
//   *     to add.
//   */
//  public void add(int key, V value);
//}
////
