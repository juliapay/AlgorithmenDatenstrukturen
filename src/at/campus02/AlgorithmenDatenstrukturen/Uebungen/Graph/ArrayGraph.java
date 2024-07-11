package at.campus02.AlgorithmenDatenstrukturen.Uebungen.Graph;

import at.campus02.AlgorithmenDatenstrukturen.Graph.UE05_ArrayAndListGraph_Loesung.WeightedEdge;

import java.util.ArrayList;
import java.util.List;

public class ArrayGraph implements Graph {
    private int[][] graph;
    private int numVertices;
    private boolean directed;

    @Override
    public int numVertices() {
        return 0;
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public boolean hasEdge(int v1, int v2) {
        return false;
    }

    @Override
    public int getEdgeWeight(int v1, int v2) {
        return 0;
    }

    @Override
    public void addEdge(int v1, int v2) {
        addEdge(v1, v2, 1);


    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        graph[v1][v2] = weight;
        if (!directed) {
            graph[v2][v1] = weight;
        }
    }

    @Override
    public void removeEdge(int v1, int v2) {
        graph[v1][v2] = 0;
        if (!directed) {
            graph[v2][v1] = 0;
        }
    }

    @Override
    public List<WeightedEdge> getEdges(int v) {
        List<WeightedEdge> edges = null;
        for (int column = 0; column < numVertices; column++) {
            if (graph[v][column] > 0) {
                WeightedEdge weightedEdge = new WeightedEdge(v, column, graph[v][column]);

                if (edges == null) {
                    edges = new ArrayList<>();
                    edges.add(weightedEdge);
                }
            }
        }
        return edges;
    }
}
