import java.util.*;

class Solution {
 /**
  * Counts the number of vertices in the same connected component as v in graph g.
  * This is done using breadth first search.
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
   if(g == null || v == null){
     return 0;
   }

   Set<Graph.Vertex> colored = new HashSet<Graph.Vertex>();
   LinkedList<Graph.Vertex> queue = new LinkedList<Graph.Vertex>();
   queue.add(v);
   colored.add(v);

   while(!queue.isEmpty()){
     Graph.Vertex s = queue.poll();
     colored.add(s);

     for(Graph.Vertex n : g.getNeighbours(s)){
       if(!colored.contains(n)){
         queue.add(n);
       }
     }
   }
   return colored.size();
 }
}
