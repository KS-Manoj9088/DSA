package Graphs;
import java.util.*;

public class TopoSort {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Adjacency list
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0;i < V; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i = 0;i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adjList.get(u).add(v);
        }
        
        Stack<Integer> st = new Stack<>();
        
        boolean[] visited = new boolean[V];
        
        for(int i = 0;i < V; i++){
            if(visited[i]==false){
                dfs(i, visited, st, adjList);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        
        return res;
    }
    
    public static void dfs(int node, boolean[] visited, Stack<Integer> st, ArrayList<ArrayList<Integer>> adjList){
        visited[node] = true;
        
        for(Integer neighbor : adjList.get(node)){
            if(visited[neighbor] == false){
                dfs(neighbor, visited, st, adjList);
            }
        }
        
        st.push(node);
    }
}