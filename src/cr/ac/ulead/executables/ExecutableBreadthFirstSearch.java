package cr.ac.ulead.executables;

import cr.ac.ulead.algorithms.BreadthFirstSearch;

import java.util.LinkedList;

public class ExecutableBreadthFirstSearch {

    public static void main(String[] args) {

//      MATRIZ 1-- - EJEMPLO DEL CODIGO DE GITHUB COMPARTIDO POR EL PROFE
//      Nota: No existe niguna diferencia en el recorrido o impresion,
//            al compararlo con la implementacion con listas hecha en clase.

        int[][] matrix = {
                { 0, 1, 0, 1, 0, 0, 0 },
                { 1, 0, 1, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 0, 0 },
                { 1, 1, 0, 0, 1, 1, 0 },
                { 0, 1, 1, 1, 0, 1, 1 },
                { 0, 0, 0, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 1, 0 }
        };

//       MATRIZ 2 --- EJEMPLO DE LA PRESENTACION EN PDF DADA EN CLASE
//       Nota: No existe niguna diferencia en el recorrido o impresion,
//             al compararlo con la implementacion con listas hecha en clase.

//        int[][] matrix = {
//                { 0, 1, 0, 0, 1, 0, 0, 0 },
//                { 1, 0, 0, 0, 0, 1, 0, 0 },
//                { 0, 0, 0, 1, 0, 1, 1, 0 },
//                { 0, 0, 1, 0, 0, 0, 1, 1 },
//                { 1, 0, 0, 0, 0, 0, 0, 0 },
//                { 0, 1, 1, 0, 0, 0, 1, 0 },
//                { 0, 0, 1, 1, 0, 1, 0, 1 },
//                { 0, 0, 0, 1, 0, 0, 1, 0 }
//        };

//      Se debe indicar desde cual nodo dara inicio la busqueda por amplitud.
        int startingNode = 0;

        BreadthFirstSearch algorithm = new BreadthFirstSearch();
        LinkedList result = algorithm.breadthFirstSearch(matrix, (startingNode + 1));
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
