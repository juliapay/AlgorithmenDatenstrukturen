package at.campus02.AlgorithmenDatenstrukturen.ProbePrüfung.P4_GraphBreadthSearch;

public class Edge {
	public int fromVertex;
	public int toVertex;

	public Edge(int fromVertex, int toVertex) {
		this.fromVertex = fromVertex;
		this.toVertex = toVertex;
	}

	@Override
	public String toString() {
		return "Edge{" +
				"from_vertex=" + fromVertex +
				", to_vertex=" + toVertex +
				'}';
	}
}
