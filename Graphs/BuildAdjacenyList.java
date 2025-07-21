package Graphs;

import java.util.*;
public class BuildAdjacenyList{
    public static void main(String[] args) {
        int num = 5;
        int[][] edges = new int[][]{
            {1,2,2}, 
            {1,3,3},
            {3,4,4},
            {2,5,6},
            {2,4,1},
            {4,5,3}
        };
        
        ArrayList<ArrayList<int[]>> adjList = new ArrayList<>(num+1);
        for(int i = 0;i <= num; i++){
            adjList.add(new ArrayList<>());
        }

       for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adjList.get(u).add(new int[]{v, w});
            adjList.get(v).add(new int[]{u, w});
        }

        // Print Adjacency List

        for(ArrayList<int[]> node : adjList){
            for(int[] edge : node){
                System.out.print(edge[0]+" "+edge[1]+"  ");
            }
            System.out.println();
        }


        

    }
}