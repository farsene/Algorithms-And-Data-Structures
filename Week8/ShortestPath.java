import java.util.*;

class Solution {
  /**
   * Find the shortest path between v and u in the graph g.
   *
   * @param g
   *     graph to search in.
   * @param v
   *     node to start from.
   * @param u
   *     node to reach.
   * @return the nodes you that form the shortest path, including v and u. An
   * empty list iff there is no path between v and u.
   */
  public static List<Vertex> shortestPath(Graph g, Vertex v, Vertex u) {
    GraphIterator git = new GraphIterator(g, v);
    Map<Vertex, Vertex> predecessors = new TreeMap<>();

    List<Vertex> result = new ArrayList<Vertex>();
    boolean hit = false;

    predecessors.put(v, v);

    if(v == u){
      return new ArrayList<Vertex>(Arrays.asList(v));
    }

    for(Vertex n : g.getNeighbours(v)){
      if(n == u){
        return new ArrayList<Vertex>(Arrays.asList(v,u));
      }
      predecessors.put(n, v);
    }

    while(git.hasNext()){
      Vertex temp = git.next();

      if(temp == u){
        hit = true;
      }

      for(Vertex n : g.getNeighbours(temp)){
        predecessors.put(n, temp);
      }
    }

    if(hit == true){
      result.add(0,u);
      Vertex temp = u;
      while(!predecessors.containsKey(temp)){
        temp = predecessors.get(temp);
        if(temp == v){
          result.add(0,temp);
          break;
        }
        result.add(0,temp);
      }
    }

    return result;
  }
}

  // FULL IMPLEMENTATION ON WEBLAB
  interface Vertex {
    int getId();
  }

  interface Graph {
    // Gets neighbours of v in this Graph, ordered by id
    public List<Vertex> getNeighbours(Vertex v);
    // Gets all vertices of this Graph
    public Collection<Vertex> getAllVertices();
  }
}
