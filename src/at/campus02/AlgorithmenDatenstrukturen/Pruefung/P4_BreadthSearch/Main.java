package at.campus02.AlgorithmenDatenstrukturen.Pruefung.P4_BreadthSearch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayGraph graph = new ArrayGraph(10);
        ArrayList<Integer> visited = new ArrayList<Integer>();

        graph.addEdge(1,0);
        graph.addEdge(0,7);
        graph.addEdge(0,3);
        graph.addEdge(7,4);
        graph.addEdge(7,5);
        graph.addEdge(4,3);
        graph.addEdge(4,2);
        graph.addEdge(5,2);
        graph.addEdge(5,6);
        graph.addEdge(3,2);

        graph.performBreadthSearch(3, visited);
        System.out.println("[SOLL] [3, 0, 2, 4, 1, 7, 5, 6]");
        System.out.println("[IST ] " + visited.toString());
    }
}
