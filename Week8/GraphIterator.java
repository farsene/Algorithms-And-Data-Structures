import java.util.*;

/**
 * Implements a Depth first traversal of the Graph, starting at contructor vertex v. It
 * should return nodes at most once. If there is a choice between multiple next nodes,
 * always pick the lowest id node.
 */
class GraphIterator implements Iterator<Vertex> {
  private Graph g;
  private Vertex v;
  private Stack<Vertex> stack;
  private Set<Vertex> colored;
  private int graphSize;

  public GraphIterator(Graph g, Vertex v) {
    // TODO
  }

  @Override
  public boolean hasNext() {
    // TODO
  }

  @Override
  public Vertex next() {
    // TODO
  }
}