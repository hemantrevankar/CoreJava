package com.hemant.algorithm.graph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import com.hemant.datastructure.graph.Graph;

public class BreadthFirstSearch {
	private boolean visited[];
	Queue<Integer> queue;
	Graph graph;
	Integer edgeTo[];
	Integer source;

	public BreadthFirstSearch(Graph graph, Integer sourceVertex) {
		this.graph = graph;
		this.source = sourceVertex;
		visited = new boolean[graph.vertices()];
		queue = new ArrayDeque<>();
		edgeTo = new Integer[graph.vertices()];
		doSearch(sourceVertex);
	}
	
	public void doSearch(Integer sourceVertex) {
		StringBuilder s = new StringBuilder();
		visited[sourceVertex] = true;
		s.append(sourceVertex + " ");
		queue.add(sourceVertex);
		edgeTo[sourceVertex] = sourceVertex;
		while(!queue.isEmpty()) {
			Integer dequeuedElement = queue.poll();
			for (Integer vertex : graph.adjacentVertices(dequeuedElement)) {
				if (!visited[vertex]) {
					visited[vertex] = true;
					s.append(vertex + " ");
					queue.add(vertex);
					edgeTo[vertex] = dequeuedElement; 
				}
			}
		}
		System.out.println("BFS traversal order of vertices : \n" + s.toString());
	}
	
	public boolean isConnected(Integer sourceVertex) {
		doSearch(sourceVertex);
		for (boolean index : visited) {
			if (!index) {
				return false;
			}
		}
		return true;
	}
	
	public boolean hasPathTo(Integer destinationVertex) {
		if (visited[destinationVertex]) {
			return true;
		}
		return false;
	}
	
	public Stack<Integer> pathTo(Integer destinationVertex) {
		Stack<Integer> stack = new Stack<>();
		if (hasPathTo(destinationVertex)) {
			for(int x = destinationVertex; x != source; x = edgeTo[x]) {
				stack.push(x);
			}
			stack.push(source);
		}
		return stack;
	}
}
