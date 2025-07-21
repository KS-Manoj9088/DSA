package Graphs;
import java.util.*;

public class DetectCycleInUndirectedGraphByBFS {
     private static class Pair {
        int Node;
        int Parent;

        Pair(int Node, int Parent) {
            this.Node = Node;
            this.Parent = Parent;
        }
    }

    public boolean isCycle(int V, int[][] edges) {
        int[] visited = new int[V];
        Arrays.fill(visited, -1);

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Correct iteration: loop over number of edges, not number of vertices
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        //  Start BFS for each disconnected component
        for (int i = 0; i < V; i++) {
            if (visited[i] == -1) {
                if (bfsCycle(i, adjList, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean bfsCycle(int Node, ArrayList<ArrayList<Integer>> adjList, int[] visited) {
        visited[Node] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(Node, -1));

        while (!q.isEmpty()) {
            Pair poppedNode = q.poll();
            int parent = poppedNode.Parent;
            int node = poppedNode.Node;

            for (Integer neighbor : adjList.get(node)) {
                if (visited[neighbor] == -1) {
                    visited[neighbor] = 1;
                    q.offer(new Pair(neighbor, node));
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }
}


