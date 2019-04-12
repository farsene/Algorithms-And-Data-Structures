import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// WORK HARD
class Solution {
  /**
   * The recursive helper function that performs the depth-first search.
   * @param g the graph
   * @param prev the vertex via which we have reached the vertex u (can be null)
   * @param u the vertex we are currently visiting
   * @param known the vertexes that we have already visited
   */
  public static boolean componentHasCycle(Graph g, Vertex prev, Vertex u, Set<Vertex> known) {
    boolean result = false;
    known.add(u);

    for(Vertex x : g.getNeighbours(u)){
      if(x != prev){
        if(known.contains(x)){
          result = true;
        }else{
          if(componentHasCycle(g, u, x, known)){
            result = true;
          }
        }
      }
    }

    return result;
  }

  public static int numCyclicComponents(Graph g) {
    Set<Vertex> known = new TreeSet<>();
    int num = 0;

    for(Vertex v : g.getAllVertices()){
      if(!known.contains(v)){
        if(componentHasCycle(g, null, v, known)){
          num++;
        }
      }
    }

    return num;
  }
  /**
 * DO NOT MODIFY
 */
interface Vertex extends Comparable<Vertex> {
  /**
   * @return the id of the vertex
   */
  public int getId();
}

/**
 * Interface for a generic graph. You may assume that our implementation is an
 * undirected graph.
 */
interface Graph {
  /**
   * @param id
   *            to look for a vertex by.
   * @return the vertex or null if not found.
   */

  public Vertex getVertexById(int id);
  /**
   * Returns the neighbours in a sorted collection by id
   *
   * @param v
   *            node to get the neighbours of.
   * @return sorted collection of neighbours.
   */
  public List<Vertex> getNeighbours(Vertex v);

  /**
   * @return an unsorted collection of all vertices in the graph.
   */
  public Collection<Vertex> getAllVertices();
}
}