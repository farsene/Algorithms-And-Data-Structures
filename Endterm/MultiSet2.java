import java.util.*;

class MultiSet extends AbstractMultiSet {
  /**
   * Creates a new MultiSet that will contain copies of the elements from `elements`.
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
   * Inserts an element into this MultiSet, preserving the order of the elements.
   *
   * @param element
   *     The element to insert into this MultiSet.
   */
  @Override
  public void insert(int element) {
    int index = 0;
    
    while(index < this.elements.size() && this.elements.get(index) < element){
      index++;
    }
    
    if(index < this.elements.size()){
      this.elements.add(index, element);
    }else{
      this.elements.add(element);
    }
  }

  /**
   * Calculates the intersection between `this` and `other`.
   * In the intersection of `this` and `other`, the frequency of each distinct element in the result set
   * is defined as follows:
   * Given `C = A.intersection(B)`. Then for every integer `i`, `C.count(i) == min(A.count(i), B.count(i))`.
   *
   * @param other
   *     the other multiset to take the intersection with.
   * @return The intersection of multisets `this` and `other`.
   */
  @Override
  public AbstractMultiSet intersection(AbstractMultiSet other) {
    if(other == null || other.elements.size() == 0 || this.elements.size() == 0){
      return new MultiSet();
    }

    List<Integer> result  = new ArrayList<Integer>();

    int i = 0, j = 0;

    while(i < this.elements.size() && j < other.elements.size()){
      int e1 = this.elements.get(i);
      int e2 = other.elements.get(j);

      if(e1 < e2){
        i++;
      }else if(e1 > e2){
        j++;
      }
      else{
        result.add(e1);
        i++;
        j++;
      }
    }

    return new MultiSet(result);
  }
}