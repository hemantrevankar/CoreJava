package com.hemant.datastructure.graph;

import java.util.Stack;

import com.hemant.algorithm.graph.BreadthFirstSearch;
import com.hemant.algorithm.graph.DepthFirstSearch;

public class Test {
	public static void main(String[] args) {
		Graph undirectedGraph = new Graph(12);
		undirectedGraph.addEdge(0, 1);
		undirectedGraph.addEdge(0, 5);
		undirectedGraph.addEdge(1, 7);
		undirectedGraph.addEdge(2, 7);
		undirectedGraph.addEdge(2, 3);
		undirectedGraph.addEdge(3, 6);
		undirectedGraph.addEdge(4, 6);
		undirectedGraph.addEdge(5, 7);
		undirectedGraph.addEdge(6, 11);
		undirectedGraph.addEdge(7, 11);
		undirectedGraph.addEdge(8, 9);
		undirectedGraph.addEdge(9, 10);
		/*undirectedGraph.addEdge(9, 12);
		undirectedGraph.addEdge(11, 12);*/
		
		undirectedGraph.printGraph();
		System.out.println(undirectedGraph.printGraph());
		BreadthFirstSearch bfs = new BreadthFirstSearch(undirectedGraph, 0);
		System.out.println(bfs.isConnected(0));
		Stack<Integer> stack = bfs.pathTo(4);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		DepthFirstSearch dfs = new DepthFirstSearch(undirectedGraph, 0);
		System.out.println(dfs.pathTo(7));
		System.out.println(dfs.isConnected(0));
		System.out.println("Path to:");
		Stack<Integer> dfsStack = dfs.pathTo(4);
		while(!dfsStack.isEmpty()) {
			System.out.println(dfsStack.pop());
		}
	}
}
