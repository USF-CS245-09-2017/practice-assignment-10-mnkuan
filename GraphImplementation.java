import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphImplementation implements Graph {

  public int[][] adjMatrix;
  public int vertices;

  public GraphImplementation(int vertices) {
    adjMatrix = new int[vertices][vertices];
    this.vertices = vertices;
  }

  public void addEdge(int v1, int v2) {
    adjMatrix[v1][v2] = 1;
  }

  public List<Integer> topologicalSort() {
    Stack s = new Stack();

    int v, n;
    Node temp;

    return new ArrayList<Integer>();
  }

  public int[] neighbors(int vertex) {
    int count = 0;
    int neighborCount = 0;

    for (int i = 0; i < vertices; i++) {
      if (adjMatrix[vertex][i] > 0) {
        count++;
      }
    }

    int[] neighbors = new int[count];

    for (int i = 0; i < vertices; i++) {
      if (adjMatrix[vertex][i] > 0) {
        neighbors[neighborCount++] = i;
      }
    }

    return neighbors;
  }
}
