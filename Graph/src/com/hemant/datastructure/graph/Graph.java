package com.hemant.datastructure.graph;

import java.util.LinkedList;

public class Graph {
	private LinkedList<Integer> adjacencyList[];
	private Integer v;
	private Integer edges;

	@SuppressWarnings("unchecked")
	public Graph(Integer vertices) {
		this.v = vertices;
		this.edges = 0;
		adjacencyList = new LinkedList[vertices];
		
		for (int i = 0; i < v; i++) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(Integer source, Integer destination) {
		adjacencyList[source].add(destination);
		adjacencyList[destination].add(source);
		this.edges++;
	}
	
	public void removeEdge(Integer source, Integer destination) {
		adjacencyList[source].remove(destination);
		adjacencyList[destination].remove(source);
		this.edges--;
	}

	public String printGraph() {
		StringBuilder s = new StringBuilder();
		s.append("Vertices: " + this.v + " and Edges: " + this.edges + "\n");
		for (int i = 0; i < v; i++) {
			s.append(i + ":");
			for (int j : adjacencyList[i]) {
				s.append(j + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}
	
	public LinkedList<Integer> adjacentVertices(Integer vertex) {
		return adjacencyList[vertex];
	}

	public Integer degree(Integer vertex) {
		return adjacencyList[vertex].size();
	}

	public Integer vertices() {
		return this.v;
	}

	public Integer edges() {
		return edges;
	}

}

