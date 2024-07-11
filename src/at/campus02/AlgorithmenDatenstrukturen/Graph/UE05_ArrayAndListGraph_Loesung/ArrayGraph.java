package at.campus02.AlgorithmenDatenstrukturen.Graph.UE05_ArrayAndListGraph_Loesung;

import java.util.ArrayList;
import java.util.List;

public class ArrayGraph implements Graph {

	private int[][] graph;
	private int numVertices;
	private boolean directed;
	
	public ArrayGraph(int numVertices, boolean directed) {
		graph = new int[numVertices][numVertices];
		this.numVertices = numVertices;
		this.directed = directed;
	}
	
	public int numVertices() {
		return numVertices;
	}

	public boolean isDirected() {
		return directed;
	}

	public boolean hasEdge(int v1, int v2) {
		return (graph[v1][v2] > 0);
	}

	public int getEdgeWeight(int v1, int v2) {
		return graph[v1][v2];
	}

	public void addEdge(int v1, int v2) {
		addEdge(v1, v2, 1);
	}
	
	public void addEdge(int v1, int v2, int weight) {
		graph[v1][v2] = weight;
		if (!directed)
			graph[v2][v1] = weight;
	}

	public void removeEdge(int v1, int v2) {
		graph[v1][v2] = 0;
		if (!directed)
			graph[v2][v1] = 0;
	}

	public List<WeightedEdge> getEdges(int v) {
		List<WeightedEdge> edges = null;
		for (int column = 0; column < numVertices; column++)
		{
			if (graph[v][column] > 0)
			{
				WeightedEdge weightedEdge = new WeightedEdge(v, column, graph[v][column]);

				if (edges == null)
					edges = new ArrayList<>();
				edges.add(weightedEdge);
			}
		}
		return edges;
	}
}
