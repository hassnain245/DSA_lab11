package graph;

/**
 *
 * @author SCS
 */
public class Graph {
    public static void main(String[] args) {
        // TODO code application logic here
        int vertices = 4;

        int[][] adjacencyMatrix = new int[vertices][vertices];

        int[][] edges = {{1, 2},{2, 3},{3, 4},{4, 1}};

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyMatrix[u - 1][v - 1] = 1; 
        }

        
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
