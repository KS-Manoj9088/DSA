package Graphs;
import java.util.*;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0}, {1,1,0}, {0,0,1}};
        List<List<Integer>> adjList = new ArrayList<>();

        int noOfNodes = isConnected.length;
        for(int i = 0;i <= noOfNodes; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i <noOfNodes; i++){
            for(int j = 0;j < noOfNodes; j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i+1).add(j+1);
                }
            }
        }

        for(List<Integer> list : adjList){
            System.out.println(list);
        }

        int provinceCount = 0;
        int[] visited = new int[noOfNodes+1];
        Arrays.fill(visited, -1);

        for(int i = 1;i <= noOfNodes; i++){
            if(visited[i]==-1){
                provinceCount++;
                dfs(i, adjList, visited);
            }
        }

        System.out.println("No of Provinces : "+provinceCount);
    }

    public static void dfs(int node, List<List<Integer>> adjList, int[] visited){
        for(Integer it : adjList.get(node)){
            if(visited[it]==-1){
                visited[it]=1;
                dfs(it, adjList, visited);
            }
        }
    }
}
