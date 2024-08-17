package Graphs;
import java.util.*;

// Leetcode 547(https://leetcode.com/problems/number-of-provinces)
public class NoOfProvinces {

    public static void dfs(ArrayList<ArrayList<Integer>> ls, boolean[] visited, int node) {
        visited[node] = true;
        for (Integer it : ls.get(node)) {
            if (visited[it] == false) {
                dfs(ls, visited, it);
            }
        }
    }

    public static int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        boolean[] visited = new boolean[V];

        // Converting matrix to ArrayList
        for (int i = 0; i < V; i++) {
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    rowList.add(j);
                }
            }
            ls.add(rowList);
        }
        int count = 0; // to count how many times if condition runs
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                count++;
                dfs(ls, visited, i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int count = findCircleNum(isConnected);
        System.out.println(count);
    }
}
