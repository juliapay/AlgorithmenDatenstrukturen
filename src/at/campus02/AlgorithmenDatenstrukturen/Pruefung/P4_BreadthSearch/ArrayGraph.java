package at.campus02.AlgorithmenDatenstrukturen.Pruefung.P4_BreadthSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayGraph {
    private int[][] graph;
    private int size;
    public ArrayGraph(int size) {
        graph = new int[size][size];
        this.size = size;
    }

    public boolean addEdge(int from, int to)
    {
        if ((from >= size) || (to >= size))
            return false;

        graph[from][to] = 1;
        graph[to][from] = 1;
        return true;
    }

    public void performBreadthSearch(int startVertex, ArrayList<Integer> visited)
    {
        // TODO: Lösung implementieren
    }


}
