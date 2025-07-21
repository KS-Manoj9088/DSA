package Graphs;
import java.util.*;

public class DetectCycleInUndirectedGraphByDFS {
    public boolean isCycle(int V, int[][] edges) {
        int[] visited = new int[V];
        Arrays.fill(visited, -1);

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Correct edge loop using edges.length
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Check every disconnected component
        for (int i = 0; i < V; i++) {
            if (visited[i] == -1) {
                if (dfsCycle(i, -1, adjList, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    // DFS-based cycle detection
    private boolean dfsCycle(int node, int parent, ArrayList<ArrayList<Integer>> adjList, int[] visited) {
        visited[node] = 1;

        for (Integer neighbor : adjList.get(node)) {
            if (visited[neighbor] == -1) {
                if (dfsCycle(neighbor, node, adjList, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}

