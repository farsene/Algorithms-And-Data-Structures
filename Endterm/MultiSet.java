import java.util.*;

class MultiSet extends AbstractMultiSet {
  /**
   * Creates a new MultiSet that will contain the elements from `elements`.
   * The list of elements will be sorted in the constructor of the superclass.
   *
   * @param elements
   *     The list of elements that this MultiSet will contain.
   */
  public MultiSet(List<Integer> elements) {
    super(elements);
  }

  /**
   * Creates a new, empty MultiSet.
   */
  public MultiSet() {
    super();
  }

  /**
   * @param element
   *     the integer element to search for.
   * @return the number of occurrences of `element` in `this` multiset.
   */
  @Override
  public int count(int element) {
    int k = 0;
    for(Integer i : this.elements){
      if(i == element){
        k++;
      }
    }
    return k;
  }

  /**
   * Calculates the union between `this` and `other`.
   * In the union of `this` and `other`, the frequency of each distinct element in the result set is defined as follows:
   * Given `C = A.union(B)`. Then for every integer `i`, `C.count(i) == max(A.count(i), B.count(i))`.
   *
   * @param other
   *     the other multiset to take the union with.
   * @return The union of multisets `this` and `other`.
   */
  @Override
  public AbstractMultiSet union(AbstractMultiSet other) {
    if(other == null || other.elements.size() == 0){
      return this;
    }
    if(this.elements.size() == 0){
      return other;
    }
    
    List<Integer> result = new ArrayList<Integer>();
    
    int i = 0, j = 0;
    
    while(i < this.elements.size() && j < other.elements.size()){
      int e1 = this.elements.get(i), e2 = other.elements.get(j);
      if(e1 < e2){
        result.add(e1);
        i++;
      }else if(e1 > e2){
        result.add(e2);
        j++;
      }else{
        result.add(e1);
        i++;
        j++;
      }
    }
    
    while(i < this.elements.size()){
      result.add(this.elements.get(i));
      i++;
    }
    
    while(j< other.elements.size()){
      result.add(other.elements.get(j));
      j++;
    }
    
    return new MultiSet(result);
  }
}
