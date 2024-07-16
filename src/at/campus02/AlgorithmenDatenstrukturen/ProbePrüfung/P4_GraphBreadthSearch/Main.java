package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P4_GraphBreadthSearch;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("*ListGraph*");
        ListGraph listGraph = new ListGraph(6, false);
        listGraph.addEdge(2,1);
        listGraph.addEdge(2,3);
        listGraph.addEdge(1,4);
        listGraph.addEdge(3,5);

        List<Integer> breathSearch = listGraph.performBreadthSearch(2);
        System.out.println("Soll: [2, 1, 3, 4, 5]");
        System.out.println("Ist: " + Arrays.toString(breathSearch.toArray()));
    }
}
