package Graphs;
import java.util.*;

public class KahnsAlgo {
    //KahsAlgo - Topo sort using bfs.
    public static void main(String[] args) {
        int edges[][] = {{3, 0},  {1, 0}, {2, 0}};
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = 4;
        for(int i = 0;i < V; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
        }

        ArrayList<Integer> res = new ArrayList<>();
        int[] indegree = new int[V];

        for(int i = 0;i < V; i++){
            for(int it : adjList.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i < V; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);

            for(Integer it : adjList.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.offer(it);
                }
            }
        }

        System.out.println(res);
    }
}
