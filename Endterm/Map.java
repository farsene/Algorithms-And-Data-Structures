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
    // TODO
  }

  /**
   * Left biased union of two maps, adds all entries from the map given as input to this map, keeping the maps sorted alphabetically on the key.
   * If a duplicate key occurs, takes the value from this map.
   *
   * @param m
   *     - other map used for the union
   */
  public Map union(Map m) {
    // TODO
  }
}