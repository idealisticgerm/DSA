package Graphs;

import java.util.ArrayList;

public class DFS {

    public static void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls,boolean[] vis,Integer node){
        vis[node] = true;
        ls.add(node);

        for(Integer it:adj.get(node)){
            if(!vis[it]){
                dfs(adj,ls,vis,it);
            }
        }

    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<Integer>() {{ add(2); add(3); add(1); }});
        adj.add(new ArrayList<Integer>() {{add(0);}}); // Empty list
        adj.add(new ArrayList<Integer>() {{ add(0); add(4);}});
        adj.add(new ArrayList<Integer>(){{add(0);}}); // Empty list
        adj.add(new ArrayList<Integer>(){{add(2);}}); // Empty list

        ArrayList<Integer> ls= new ArrayList<>();
        boolean[] vis = new boolean[5];
        dfs(adj,ls,vis,0);

        for(Integer i:ls){
            System.out.print(i + " ");
        }
    }
}
