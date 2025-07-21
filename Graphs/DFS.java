package Graphs;
import java.util.*;

public class DFS {
    public static void main(String[] args) {
        int[][] undirectedGraph = new int[][]{
            {1, 1, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1},
            {0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 0}
        };

        int n = undirectedGraph.length;

        // Create adjacency list with 1-based indexing
        List<List<Integer>> adjList = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Build adjacency list from adjacency matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (undirectedGraph[i][j] == 1 && i != j) {
                    adjList.get(i + 1).add(j + 1);
                }
            }
        }

        int[] visited = new int[n + 1];
        Arrays.fill(visited, -1);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (visited[i] == -1) {
                dfs(i, visited, adjList, res);
            }
        }

        System.out.println("DFS Traversal Order: " + res);
    }

    public static void dfs(int node, int[] visited, List<List<Integer>> adjList, ArrayList<Integer> res) {
        visited[node] = 1;
        res.add(node);

        for (Integer neighbor : adjList.get(node)) {
            if (visited[neighbor] == -1) {
                dfs(neighbor, visited, adjList, res);
            }
        }
    }
}