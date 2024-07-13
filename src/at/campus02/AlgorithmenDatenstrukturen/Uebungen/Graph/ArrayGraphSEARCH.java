package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayGraphSEARCH {
    private int[][] graph;
    private int size;

    public ArrayGraphSEARCH(int size) {
        graph = new int[size][size];
        this.size = size;
    }

    public boolean addEdge(int from, int to) {
        if ((from >= size) || (to >= size))
            return false;

        graph[from][to] = 1;
        graph[to][from] = 1;
        return true;
    }
    // GRAPH BRREITENSUCHE
    public void performBreadthSearch(int startVertex, ArrayList<Integer> visited) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitedArray = new boolean[size];

        queue.add(startVertex);
        visitedArray[startVertex] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            visited.add(vertex);

            for (int i = 0; i < size; i++) {
                if (graph[vertex][i] == 1 && !visitedArray[i]) {
                    //  graph[vertex][i] > 0 && !visitedArray[i]
                    // wenn edges are weighted
                    queue.add(startVertex);
                    visitedArray[startVertex] = true;
                }
                    queue.add(i);
                    visitedArray[i] = true;
                }
            }
        }

    // GRAPH TIEFENSUCHE
    public void performDepthSearch(int startVertex, ArrayList<Integer> visited) {

        visited.add(startVertex);
        for (int i = 0; i < size; i++) {

            if (graph[startVertex][i] == 1) {
                if (!visited.contains(i)) {
                    performDepthSearch(i, visited);
                }
            }
        }
    }
}
