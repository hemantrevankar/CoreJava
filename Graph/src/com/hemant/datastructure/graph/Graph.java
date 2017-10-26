package com.hemant.datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	private LinkedList<Integer> adjacencyList[];
	private Integer v;

	@SuppressWarnings("unchecked")
	public Graph(Integer vertices) {
		this.v = vertices;
		adjacencyList = new LinkedList[vertices];
		
		for (int i = 0; i < v; i++) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(Integer source, Integer destination) {
		adjacencyList[source].add(destination);
		adjacencyList[destination].add(source);
	}
	
	public void removeEdge(Integer source, Integer destination) {
		adjacencyList[source].remove(destination);
		adjacencyList[destination].remove(source);
	}

	public void printGraph() {
		for (int i = 0; i < v; i++) {
			System.out.println("Adjacency list for vertex " + i);
			for (int j : adjacencyList[i]) {
				System.out.println(j);
			}
		}
	}
	
	public void breadthFirstSearch() {
		Queue<Integer> queue = new 
	}
}

