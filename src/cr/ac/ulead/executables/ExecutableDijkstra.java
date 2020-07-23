package cr.ac.ulead.executables;

import cr.ac.ulead.algorithms.Dijkstra;

import java.util.LinkedList;

public class ExecutableDijkstra {

    public static void main(String[] args) {

//      MATRIZ 1-- - EJEMPLO DEL CODIGO DE GITHUB COMPARTIDO POR EL PROFE
//      ***Nota: SI EXISTE UNA DIFERENCIA. En este caso, si existe algun nodo
//               que no posea entradas (como el Nodo 0, en este ejemplo), el algoritmo
//               solo permite dar inicio a partir de ese nodo, de lo contrario dara un error,
//               ya que seria imposible recorrer el grafo en su totalidad.

        int[][] matrix = {
                { 0, 10, 15, 0, 0, 0 },
                { 0, 0, 0, 12, 0, 15 },
                { 0, 0, 0, 0, 10, 0 },
                { 0, 0, 0, 0, 2, 1 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 5, 0 }
        };

//       MATRIZ 2 --- EJEMPLO DE LA PRESENTACION EN PDF DADA EN CLASE
//       ***Nota: En este caso, debido a que los todos los nodos tienen una entrada,
//                no hay problema en seleccionar cualquier nodo de inicio.

//        int[][] matrix = {
//                {0, 10, 0, 5, 0},
//                {0, 0, 1, 2, 0},
//                {0, 0, 0, 0, 4},
//                {0, 3, 9, 0, 2},
//                {7, 0, 6, 0, 0},
//        };

//      Se debe indicar desde cual nodo dara inicio la busqueda por el algoritmo de Dijkstra.
        int startingNode = 0;

        Dijkstra algorithm = new Dijkstra();
        LinkedList result = algorithm.dijkstra(matrix, startingNode);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
