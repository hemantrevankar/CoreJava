package com.hemant.datastructure.graph;

public class Test {
	public static void main(String[] args) {
		Graph undirectedGraph = new Graph(5);
		undirectedGraph.addEdge(0, 1);
		undirectedGraph.addEdge(0, 2);
		undirectedGraph.addEdge(1, 3);
		undirectedGraph.addEdge(2, 4);
		
		undirectedGraph.printGraph();
		undirectedGraph.removeEdge(0, 2);
		undirectedGraph.printGraph();
	}
}
