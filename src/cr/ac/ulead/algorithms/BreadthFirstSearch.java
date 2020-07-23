package cr.ac.ulead.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public LinkedList breadthFirstSearch(int[][] matrix, int startingNode){
        boolean[] visited = new boolean[matrix.length];
        visited[startingNode-1] = true;
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<String> result = new LinkedList<>();
        queue.add(startingNode);
        System.out.println("Empezando desde el nodo -------> " + (startingNode-1));
        while(!queue.isEmpty()){
            int x = queue.poll();
            int i;
            for(i=0; i<matrix.length;i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    queue.add(i+1);
                    visited[i] = true;
                    result.add("Desde el nodo " + (x-1) + " se llega al ---> " + (i));
                }
            }
        }
        return result;
    }
}
