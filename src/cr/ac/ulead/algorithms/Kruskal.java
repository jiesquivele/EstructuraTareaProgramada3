package cr.ac.ulead.algorithms;

import java.util.*;

public class Kruskal {

    int V = 0;
    int[] parent;
    int INF = Integer.MAX_VALUE;

    public int find(int i) {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

    public void union1(int i, int j) {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }

    public LinkedList kruskalMST(int cost[][]) {
        this.V = cost[0].length;
        this.parent = new int[V];
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i < V; i++)
            parent[i] = i;
        int edgeCount = 0;
        while (edgeCount < V - 1) {
            int min = INF;
            int x = -1;
            int y = -1;
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (find(i) != find(j) && cost[i][j] < min) {
                        min = cost[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
            union1(x, y);
            edgeCount++;
            result.add("Entre los nodos " + x + " y " + y + " hay un peso de: " + min);
        }
        return result;
    }
}
