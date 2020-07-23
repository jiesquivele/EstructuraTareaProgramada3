package cr.ac.ulead.algorithms;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {

    public LinkedList depthFirstSearch(int[][] matrix, int startingNode){
        boolean[] visited = new boolean[matrix.length];
        visited[startingNode-1] = true;
        Stack<Integer> stack = new Stack<>();
        LinkedList<String> result = new LinkedList<>();
        stack.push(startingNode);
        int i,x;
        System.out.println("Empezando desde el nodo -------> " + (startingNode-1));
        while(!stack.isEmpty()){
            x = stack.pop();
            for(i=0; i<matrix.length; i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    stack.push(x);
                    visited[i] = true;
                    result.add("Desde el nodo " + (x-1) + " se llega al ---> " + (i));
                    x = i+1;
                    i = -1;
                }
            }
        }
        return result;
    }
}
