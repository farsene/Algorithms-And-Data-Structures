import java.util.*;

class Map {
  protected ArrayList<Entry> arr;

  /**
   * Constructor of the map. Represented by a sorted ArrayList.
   */
  public Map() {
    arr = new ArrayList<>();
  }

  /**
   * Takes a String as input and finds the corresponding value in the map.
   * If the Entry with this key can't be found, this will return -1.
   *
   * @param s
   *     - Key that you are looking for.
   * @return - value corresponding to the Entry found.
   */
  public int get(String s) {
    if(arr == null || arr.isEmpty()){
        return -1;
    }
    int low = 0, high = arr.size()-1;
    int mid = 0;
    while(low <= high){
      mid = (high+low)/2;
      int comparator = s.compareTo(arr.get(mid).getKey());
      
      if(comparator < 0){
          high = mid -1;
      }
      else if(comparator > 0){
          low = mid + 1;
      }
      else{
          return arr.get(mid).getValue();
      }
    }
    return -1;
  }

  /**
   * Left biased union of two maps, adds all entries from the map given as input to this map, keeping the maps sorted alphabetically on the key.
   * If a duplicate key occurs, takes the value from this map.
   *
   * @param m
   *     - other map used for the union
   */
  public Map union(Map m) {
    if(this.arr.size() == 0){
        if(m == null){
            return this;
        }
        else return m;
    }

    if(m == null){
        return this;
    }

    Map result = new Map();
    int i = 0;
    int j = 0;

    while(i < this.arr.size() && j < m.arr.size()){
        int c = this.arr.get(i).getKey().compareTo(m.arr.get(j).getKey());
        if(c < 0){
            result.arr.add(this.arr.get(i));
            i++;
        }
        else if(c > 0){
            result.arr.add(m.arr.get(j));
            j++;
        }else{
            result.arr.add(this.arr.get(i));
            i++;
            j++;
        }
    }

    while(i < this.arr.size()){
        result.arr.add(this.arr.get(i));
        i++;
    }

    while(j < m.arr.size()){
        result.arr.add(m.arr.get(j));
        j++;
    }

    return result;
  }
}
//import java.util.*;
//
//class Map {
//  protected ArrayList<Entry> arr;
//
//  /**
//   * Constructor of the map. Represented by a sorted ArrayList.
//   */
//  public Map() {
//    arr = new ArrayList<>();
//  }
//
//  /**
//   * Takes a String as input and finds the corresponding value in the map.
//   * If the Entry with this key can't be found, this will return -1.
//   *
//   * @param s
//   *     - Key that you are looking for.
//   * @return - value corresponding to the Entry found.
//   */
//  public int get(String s) { // How do Imake this run in O(log(n))
//    if(arr == null || arr.isEmpty()){
//      return -1;
//    }else{
//      // for(Entry e : arr){
//      //   if(e.getKey().equals(s)){
//      //     return e.getValue();
//      //   }
//      // }
//      int begin = 0; //a b c d e
//      int last = this.arr.size() - 1;
//      int mid = 0;
//      while(begin <= last){
//        mid = (begin + last)/2; 
//        if(this.arr.get(mid).getKey().compareTo(s) < 0){
//          begin = mid + 1;
//        }else if(this.arr.get(mid).getKey().compareTo(s) > 0){
//          last = mid - 1;
//        }else{
//          return this.arr.get(mid).getValue();
//        }
//      }
//      return -1;
//    }
//  }
//
//  /**
//   * Left biased union of two maps, adds all entries from the map given as input to this map, keeping the maps sorted alphabetically on the key.
//   * If a duplicate key occurs, takes the value from this map.
//   *
//   * @param m
//   *     - other map used for the union
//   */
//  public Map union(Map m) {
//    if(m == null || m.arr.isEmpty()){
//      return this;
//    }else{
//      if(this.arr.isEmpty()){
//        return m;
//      }
//      Map result = new Map();
//      int i = 0, j = 0;
//      while(i < this.arr.size() && j < m.arr.size()){
//        Entry e1 = this.arr.get(i);
//        Entry e2 = m.arr.get(j);
//        int C = e1.getKey().compareTo(e2.getKey());
//        if(C < 0){
//          result.arr.add(e1);
//          i++;
//        }else if(C == 0){
//          result.arr.add(e1);
//          i++;
//          j++;
//        }else{
//          result.arr.add(e2);
//          j++;
//        }
//      }
//      while(i < this.arr.size()){
//        Entry e1 = this.arr.get(i);
//        result.arr.add(e1);
//        i++;
//      }
//      while(j < m.arr.size()){
//        Entry e2 = m.arr.get(j);
//        result.arr.add(e2);
//        j++;
//      }
//      return result;
//    }
//  }
//}
////
