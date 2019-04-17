import java.util.*;

class Solution {
 /**
  * Counts the number of vertices in the same connected component as v in graph g.
  * This is done using depth first search.
  *
  * Returns 0 if the graph or vertex is null
  *
  * @param g
  *     The graph to count vertices in.
  * @param v
  *     The vertex to start counting at.
  * @return the number of vertices in the same connected component.
  */
 public static int countVertices(Graph g, Graph.Vertex v) {
   Set<Graph.Vertex> known = new HashSet<Graph.Vertex>();
   if(g == null || v == null){
     return known.size();
   }else{
     countVertices(g, v, known);
     return known.size();
   }
 }

 public static void countVertices(Graph g, Graph.Vertex v, Set<Graph.Vertex> known){
   known.add(v);
   for(Graph.Vertex x : g.getNeighbours(v)){
     if(!known.contains(x)){
       known.add(x);
       countVertices(g, x, known);
     }
   }
 }
}
