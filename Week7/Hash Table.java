import java.util.*;

/**
 * Entry objects are used to represent "Key-Value" pairs.
 * An entry can be created by using new Entry(String key, Integer Value)
 * The .equals() method of Entry will compare the keys only.
 */
class Entry {
  public final String key;
  public final Integer value;

  public Entry(String s, Integer v) {
    key = s;
    value = v;
  }

  public boolean equals(String s) {
    return s == null && key == null || key.equals(s);
  }

  @Override
  public boolean equals(Object o) {
    return this == o || o != null && getClass() == o.getClass() && this.equals(((Entry) o).key);
  }

  public String getKey() {
    return key;
  }

  public int getValue() {
    return value;
  }
}

abstract class HashTable {
  protected LinkedList<Entry>[] myTable;

  /**
   * Constructs a new HashTable.
   *
   * @param capacity
   *     to be used as capacity of the table.
   * @throws IllegalArgumentException
   *     if the input capacity is invalid.
   */
  @SuppressWarnings("unchecked")
  public HashTable(int capacity) {
    // TODO
  }

  /**
   * Add a key value pair to the HashTable.
   *
   * @param key
   *     to identify the value.
   * @param value
   *     that is identified by the key.
   */
  public void put(String key, Integer value) {
    // TODO
  }

  /**
   * @param key
   *     to look for in the HashTable.
   * @return true iff the key is in the HashTable.
   */
  public boolean containsKey(String key) {
    // TODO
  }

  /**
   * Get a value from the HashTable.
   *
   * @param key
   *     that identifies the value.
   * @return the value associated with the key or `null` if the key is not in the HashTable.
   */
  public Integer get(String key) {
    // TODO
  }

  /**
   * @return the capacity of the HashTable.
   */
  public int getCapacity() {
    return myTable.length;
  }

  /**
   * Hashes a string/key.
   *
   * @param item
   *     to hash.
   * @return the hashcode of the string, modulo the capacity of the HashTable.
   */
  public abstract int hash(String item);
}
//import java.util.*;
//
///**
// * Entry objects are used to represent "Key-Value" pairs.
// * An entry can be created by using new Entry(String key, Integer Value)
// * The .equals() method of Entry will compare the keys only.
// */
//class Entry {
//  public final String key;
//  public final Integer value;
//
//  public Entry(String s, Integer v) {
//    key = s;
//    value = v;
//  }
//
//  public boolean equals(String s) {
//    return s == null && key == null || key.equals(s);
//  }
//
//  @Override
//  public boolean equals(Object o) {
//    return this == o || o != null && getClass() == o.getClass() && this.equals(((Entry) o).key);
//  }
//
//  public String getKey() {
//    return key;
//  }
//
//  public int getValue() {
//    return value;
//  }
//}
//
//abstract class HashTable {
//  protected LinkedList<Entry>[] myTable;
//
//  /**
//   * Constructs a new HashTable.
//   *
//   * @param capacity
//   *     to be used as capacity of the table.
//   * @throws IllegalArgumentException
//   *     if the input capacity is invalid.
//   */
//  @SuppressWarnings("unchecked")
//  public HashTable(int capacity) {
//    if(capacity <= 0){
//      throw new IllegalArgumentException();
//    }
//    myTable = new LinkedList[capacity]; // myTable = new LinkedList<Entry>[capacity] why DOESNT THIS WORK
//  }
//
//  /**
//   * Add a key value pair to the HashTable.
//   *
//   * @param key
//   *     to identify the value.
//   * @param value
//   *     that is identified by the key.
//   */
//  public void put(String key, Integer value) {
//    int hashCode = this.hash(key);
//    if(myTable[hashCode] == null){ // myTable of hashCode cannot be null can it?
//      myTable[hashCode] = new LinkedList<Entry>();
//      myTable[hashCode].add(new Entry(key,value));
//    }else{
//      if(!this.containsKey(key)){
//        myTable[hashCode].add(new Entry(key,value));
//      }
//      else{
//        int k = 0;
//        ListIterator<Entry> it = myTable[hashCode].listIterator(0);
//      while(it.hasNext()){
//        Entry temp = it.next();
//
//        if(temp.equals(key)){
//          break;
//       }
//       k++;
//    }
//        myTable[hashCode].set(k,new Entry(key,value));
//      }
//    }
//  }
//
//  /**
//   * @param key
//   *     to look for in the HashTable.
//   * @return true iff the key is in the HashTable.
//   */
//  public boolean containsKey(String key) {
//    int hashCode = this.hash(key);
//    if(myTable[hashCode] == null){
//      return false;
//    }
//    ListIterator<Entry> it = myTable[hashCode].listIterator(0);
//    while(it.hasNext()){
//      Entry temp = it.next();
//      if(temp.equals(key)){
//        return true;
//      }
//    }
//    return false;
//  }
//
//  /**
//   * Get a value from the HashTable.
//   *
//   * @param key
//   *     that identifies the value.
//   * @return the value associated with the key or `null` if the key is not in the HashTable.
//   */
//  public Integer get(String key) {
//    if(!this.containsKey(key)){
//      return null;
//    }
//    int hashCode = this.hash(key);
//    ListIterator<Entry> it = myTable[hashCode].listIterator(0);
//    int result = 0;
//    while(it.hasNext()){
//      Entry temp = it.next();
//      if(temp.equals(key)){
//        result = temp.getValue();
//      }
//    }
//    return result;
//  }
//
//  /**
//   * @return the capacity of the HashTable.
//   */
//  public int getCapacity() {
//    return myTable.length;
//  }
//
//  /**
//   * Hashes a string/key.
//   *
//   * @param item
//   *     to hash.
//   * @return the hashcode of the string, modulo the capacity of the HashTable.
//   */
//  public abstract int hash(String item);
//}
////
