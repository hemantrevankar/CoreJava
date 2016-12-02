package com.learning.collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author hemant_revankar
 * ArrayList is a dynamically sized array data structure that holds only the objects of a class
 * and does not hold the primitive data type.
 * ArrayList is a part of the java collections framework.
 * Unlike an Array, the size of ArrayList can be increased dynamically to add more elements, although
 * there is a provision kept to define the initial size call capacity of the ArrayList.
 * Elements can be dynamically added, removed into and from the list.
 * Since ArrayList does not hold primitive data typed values, instead hold the references to the objects,
 * the references are stored in a contiguous location but not the objects. The objects can be anywhere on the heap.
 */

/**
 * ERRORS
 * @author hemant_revankar
 * Cannot reference an instance field while explicitly invoking constructor of a class.
 */
public class MyArrayList<E extends Object> {
	private int size;
	private static final  int default_capacity = 10;
	private int capacity;
	private Object[] list;
	
	public MyArrayList()
	{
		this(default_capacity);
	}
	
	public MyArrayList(int initial_capacity)
	{
		this.capacity = initial_capacity;
		list = new Object[capacity];
		size = 0;
	}
	
	public void add(E element)
	{
		if(size >= capacity)
		{
			list = Arrays.copyOf(list, capacity*2);
		}
		list[size++] = element;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index)
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		return (E) list[index];
	}
	
	public void delete(int index)
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index == size-1)
		{
			list[index]=null;
		}
		else
		{
		for(int i=index; i<size-1; i++)
		{
			list[i] = list[i+1];
		}
		list[size-1]=null;
		}
		size--;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		if(size == 0)
		return true;
		return false;
	}
	
	public String toString()
	{
		StringBuilder string = new StringBuilder();
		string.append("[");
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				string.append(list[i]).append(",");
			}
			if (string.substring(string.length() - 1, string.length()).equals(
					",")) {
				string.deleteCharAt(string.length() - 1);
			}
		}
		string.append("]");
		return string.toString();
	}
	
}
