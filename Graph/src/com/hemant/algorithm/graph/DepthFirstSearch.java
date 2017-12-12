package com.hemant.algorithm.graph;

import java.util.Stack;

import com.hemant.datastructure.graph.Graph;

public class DepthFirstSearch {
	private boolean visited[];
	private Integer edgeTo[];
	private Graph graph;
	private Integer source;
	StringBuilder s;

	public DepthFirstSearch(Graph graph, Integer sourceVertex) {
		this.graph = graph;
		this.source = sourceVertex;
		visited = new boolean[graph.vertices()];
		edgeTo = new Integer[graph.vertices()];
		s = new StringBuilder();
		doSearch(sourceVertex);
	}

	public void doSearch(Integer sourceVertex) {
		visited[sourceVertex] = true;
		for (Integer vertex : graph.adjacentVertices(sourceVertex)) {
			if (!visited[vertex]) {
				visited[vertex] = true;
				edgeTo[vertex] = sourceVertex;
				doSearch(vertex);
			}
		}
	}

	public boolean isConnected(Integer sourceVertex) {
		for (boolean index : visited) {
			if (!index) {
				return false;
			}
		}
		return true;
	}
	
	public boolean hasPathTo(Integer vertex) {
		if (visited[vertex]) {
			return true;
		}
		return false;
	}
	
	public Stack<Integer> pathTo(Integer vertex) {
		if (!hasPathTo(vertex)) {
			return null;
		}
		Stack<Integer> stack = new Stack<>();
		for(int x = vertex; x != source; x = edgeTo[x]) {
			stack.push(x);
		}
		stack.push(source);
		return stack;
	}
	
	// A modified DFS based approach to detect presence of a cycle in a graph
	public void isCyclic() {
		
	}
}
