package com.hemant.datastructure.graph;

public class Test {
	public static void main(String[] args) {
		Graph undirectedGraph = new Graph(13);
		undirectedGraph.addEdge(0, 1);
		undirectedGraph.addEdge(0, 2);
		undirectedGraph.addEdge(0, 6);
		undirectedGraph.addEdge(0, 5);
		undirectedGraph.addEdge(3, 5);
		undirectedGraph.addEdge(3, 4);
		undirectedGraph.addEdge(4, 5);
		undirectedGraph.addEdge(4, 6);
		undirectedGraph.addEdge(7, 8);
		undirectedGraph.addEdge(9, 10);
		undirectedGraph.addEdge(9, 11);
		undirectedGraph.addEdge(9, 12);
		undirectedGraph.addEdge(11, 12);
		
		undirectedGraph.printGraph();
		System.out.println(undirectedGraph.printGraph());
	}
}
