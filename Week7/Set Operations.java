import java.util.*;

class MySet extends HashSet<String> {
  private static final long serialVersionUID = 1L;

  public MySet() {
    super();
  }

  /**
   * @return the union of the elements of this and that
   */
  public MySet union(MySet that) {
    MySet result = new MySet();
    // TODO
    return result;
  }

  /**
   * @return the intersection of the elements of this and that
   */
  public MySet intersection(MySet that) {
    MySet result = new MySet();
    // TODO
    return result;
  }

  /**
   * @return the difference of the elements of this and that
   */
  public MySet difference(MySet that) {
    MySet result = new MySet();
    // TODO
    return result;
  }

  /**
   * @return the exclusive or (XOR) of the elements of this and that
   */
  public MySet exclusiveOr(MySet that) {
    MySet result = new MySet();
    // TODO
    return result;
  }

  /**
   * @return a String representation of a MySet object
   */
  public String toString() {
    // TODO
  }
}
//import java.util.*;
//
//class MySet extends HashSet<String> {
//  private static final long serialVersionUID = 1L;
//
//  public MySet() {
//    super();
//  }
//
//  /**
//   * @return the union of the elements of this and that
//   */
//  public MySet union(MySet that) {
//    MySet result = new MySet();
//    if(that == null || that.isEmpty()){
//      result.addAll(this);
//    }else{
//
//      Iterator<String> it = this.iterator();
//      while(it.hasNext()){ // if this is Empty the loop will not be executed
//        result.add(it.next());
//      }
//
//      Iterator<String> it2 = that.iterator();
//      while(it2.hasNext()){
//        result.add(it2.next());
//      }
//    }
//    return result;
//  }
//
//  /**
//   * @return the intersection of the elements of this and that
//   */
//  public MySet intersection(MySet that) {
//    MySet result = new MySet();
//    if(this.isEmpty() || that == null || that.isEmpty()){
//      return result;
//    }else{
//      Iterator<String> it = this.iterator();
//      while(it.hasNext()){
//        String temp = it.next();
//        if(that.contains(temp)){
//          result.add(temp);
//        }
//      }
//    }
//
//    return result;
//  }
//
//  /**
//   * @return the difference of the elements of this and that
//   */
//  public MySet difference(MySet that) {
//    MySet result = new MySet();
//    if(this.isEmpty()){
//      return result;
//    }else if(that == null || that.isEmpty()){
//      result.addAll(this);
//      return result; // is it alright?
//    }
//    else{
//      Iterator<String> it = this.iterator();
//      while(it.hasNext()){
//        String temp = it.next();
//        if(!that.contains(temp)){
//          result.add(temp);
//        }
//      }
//    }
//    return result;
//  }
//
//  /**
//   * @return the exclusive or (XOR) of the elements of this and that
//   */
//  public MySet exclusiveOr(MySet that) {
//    MySet result = new MySet();
//    if(that == null || that.isEmpty()){
//     result.addAll(this);
//      return result; // is it alright?
//    }else{
//      Iterator<String> it1 = this.iterator();
//      Iterator<String> it2 = that.iterator();
//      while(it1.hasNext()){
//        String temp = it1.next();
//        if(!that.contains(temp)){
//          result.add(temp);
//        }
//      }
//      while(it2.hasNext()){
//        String temp = it2.next();
//        if(!this.contains(temp)){
//          result.add(temp);
//        }
//      }
//    }
//    return result;
//  }
//
//  /**
//   * @return a String representation of a MySet object
//   */
//  public String toString() {
//    String result = "<MySet{";
//    if(this!=null){
//      Iterator<String> it = this.iterator();
//      while(it.hasNext()){
//        String temp = it.next();
//        result = result + temp + ","; // should use string builder
//      }
//      if(!this.isEmpty()){
//        result = result.substring(0, result.length() - 1);
//      }
//    }
//    result = result + "}>";
//    return result;
//
//  }
//}
////
