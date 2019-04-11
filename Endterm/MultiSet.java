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
    // TODO
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
    // TODO
  }

  /**
   * LIBRARY CLASS.
   */
  public abstract class AbstractMultiSet {
    /**
     * The list of elements that this MultiSet contains.
     * This list is sorted in the constructor.
     */
    protected final List<Integer> elements;
  
    /**
     * Creates a new MultiSet that will contain the elements from `elements`.
     * The list of elements will be sorted.
     *
     * @param elements
     *     The list of elements that this MultiSet will contain.
     */
    public AbstractMultiSet(List<Integer> elements) {
      this.elements = elements;
      Collections.sort(this.elements);
    }
  
    /**
     * Creates a new, empty MultiSet.
     */
    public AbstractMultiSet() {
      this(new ArrayList<>());
    }
  
    /**
     * @return A copy of the elements of this multiset.
     */
    public List<Integer> getElements() {
      return new ArrayList<>(elements);
    }
  
    /**
     * @param element
     *     the integer element to search for.
     * @return the number of occurrences of `element` in `this` multiset.
     */
    public abstract int count(int element);
  
    /**
     * Calculates the union between `this` and `other`.
     * In the union of `this` and `other`, the frequency of each distinct element in the result set is defined as follows:
     * Given `C = A.union(B)`. Then for every integer `i`, `C.count(i) == max(A.count(i), B.count(i))`.
     *
     * @param other
     *     the other multiset to take the union with.
     * @return The union of multisets `this` and `other`.
     */
    public abstract AbstractMultiSet union(AbstractMultiSet other);
  }
}

