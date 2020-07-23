package cr.ac.ulead.executables;

import cr.ac.ulead.algorithms.TopologicalSort;

import java.util.LinkedList;

public class ExecutableTopological {

    // NOTA: ESTE ES EL ALGORTIMO TRABAJADO EN CLASE
    //       POR MEDIO DE UNA LISTA.

    public static void main(String args[]) {
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Ordenamiento topologico del grafo: ");
        LinkedList<String> result = new LinkedList<>();
        result = g.topologicalSort();
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
    }
}
