package cr.ac.ulead.executables;

import cr.ac.ulead.algorithms.Kruskal;

import java.util.LinkedList;
import java.util.Scanner;

public class ExecutableKruskal {

    public static void main(String[] args) {

//      "INF" se refiere los espacios en la matriz donde no hay aristas,
//      por lo que no existe peso alguno.
        int INF = Integer.MAX_VALUE;


//      MATRIZ 1 --- EJEMPLO DEL CODIGO DE GITHUB COMPARTIDO POR EL PROFE
//      Nota: No existe ninguna diferencia en el recorrido o impresion,
//            al compararlo con la implementacion con arreglos hecha en clase.

        int[][] matrix = {
                { INF, 10, 6, 5 },
                { 10, INF, INF, 15 },
                { 6, INF, INF, 4 },
                { 5, 15, 4, INF },
        };

//      MATRIZ 2 --- EJEMPLO DE LA PRESENTACION EN PDF DADA EN CLASE
//      Nota: No existe ninguna diferencia en el recorrido o impresion,
//            al compararlo con la implementacion con arreglos hecha en clase.

//        int[][] matrix = {
//            { INF, 4, INF, INF, INF, INF, INF, 8, INF },
//            { 4, INF, 8, INF, INF, INF, INF, 11, INF },
//            { INF, 8, INF, 7, INF, 4, INF, INF, 2 },
//            { INF, INF, 7, INF, 9, 14, INF, INF, INF },
//            { INF, INF, INF, 9, INF, 10, INF, INF, INF },
//            { INF, INF, 4, 14, 10, INF, 2, INF, INF },
//            { INF, INF, INF, INF, INF, 2, INF, 1, 6 },
//            { 8, 11, INF, INF, INF, INF, 1, INF, 7 },
//            { INF, INF, 2, INF, INF, INF, 6, 7, INF }
//        };

        Kruskal algorithm = new Kruskal();
        LinkedList result = algorithm.kruskalMST(matrix);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
