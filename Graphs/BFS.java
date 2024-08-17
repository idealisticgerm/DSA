package Graphs;

import java.util.*;

public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(0);
        vis[0] = true;


        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }

        }
        return bfs;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); }});
        adj.add(new ArrayList<Integer>()); // Empty list
        adj.add(new ArrayList<Integer>() {{ add(4); }});
        adj.add(new ArrayList<Integer>()); // Empty list
        adj.add(new ArrayList<Integer>()); // Empty list

        ArrayList<Integer> bfs = bfsOfGraph(5,adj);

        for(Integer i:bfs){
            System.out.print(i + " ");
        }

//        for(int i = 0; i < bfs.size(); i++){
//            System.out.print(bfs.get(i) + " ");
//        }

}
}

