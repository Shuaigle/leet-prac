import java.util.Arrays;

class Solution {

    int find(int parent[], int i) {
        if (parent[i] == -1) // if not found parent -> this is root node
            return i;
        return find(parent, parent[i]); // recursive find
    }

    void union(int parent[], int x, int y) {
        int xset = find(parent, x); // recursive find x and y root node
        int yset = find(parent, y);
        if (xset != yset)
            parent[xset] = yset; // union two set if not connected
    }

    public int findCircleNum(int[][] isConnected) {
        int[] parent = new int[isConnected.length]; // construct parent matrix
        Arrays.fill(parent, -1); // fill(int[] a, int val)
        // traverse whole matrix
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1 && i != j) // connect then union
                    union(parent, i, j);
            }
        }
        int count = 0;
        for (int i = 0; i < parent.length; i++)
            if (parent[i] == -1)
                count++;
        return count;
    }
}
