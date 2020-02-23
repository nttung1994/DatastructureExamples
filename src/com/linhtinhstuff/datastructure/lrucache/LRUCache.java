package com.linhtinhstuff.datastructure.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	private DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
	
	private Map<Integer, Node> hashMap = new HashMap<Integer, Node>();
	
	private static final int MAX_SIZE = 3;
	
	public String get(int key) {
		// If cache hit
		if (hashMap.containsKey(key)) {
			Node node = hashMap.get(key);
			doublyLinkedList.moveToFirst(node);
			return node.getData();
		}
		// If cache miss
		else {
			// If cache is full
			if (doublyLinkedList.getSize() == getMaxSize()) {
				// Remove last data in Doubly LinkedList and update HashTable
				hashMap.remove(doublyLinkedList.getTail().getKey());
				doublyLinkedList.removeLast();
			}
			
			// Get data from datasource
			String data = Datasource.getData(key);
			// Add to LinkedList and HashTable
			Node node = new Node(key, data);
			doublyLinkedList.addFirst(node);
			hashMap.put(key, node);
			return data;
		}
	}
	
	// Print all data in cache
	public void print() {
		Node node = doublyLinkedList.getHead();
		while(node != null) {
			System.out.print(node.getData() + " | ");
			node = node.getNext();
		}
		System.out.println();
	}
	
	private int getMaxSize() {
		return MAX_SIZE;
	}

}
