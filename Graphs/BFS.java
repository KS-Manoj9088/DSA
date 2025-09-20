package Graphs;

import java.util.*;

public class BFS {

    public static void main(String[] args) {
        int[][] undirectedGraph = {
            {1, 1, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1},
            {0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 0}
        };

        List<List<Integer>> adjList = buildAdjList(undirectedGraph);
        System.out.println("Adjacency List: " + adjList);

        List<Integer> bfsOrder = bfsTraversal(adjList, 1); // Start from node 0
        System.out.println("BFS Traversal: " + bfsOrder);
    }

    // Converts adjacency matrix to adjacency list
    private static List<List<Integer>> buildAdjList(int[][] matrix) {
        int n = matrix.length;
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i <=n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1 && i != j) {
                    adjList.get(i+1).add(j+1);
                }
            }
        }

        return adjList;
    }

    // Performs BFS traversal from a given start node
    private static List<Integer> bfsTraversal(List<List<Integer>> adjList, int start) {
        int n = adjList.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        List<Integer> bfs = new ArrayList<>();

        visited[start] = true;
        q.offer(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }

        return bfs;
    }
}