package com.linhtinhstuff.datastructure.lrucache;

public class DoublyLinkedList {
	
	private Node head, tail;
	private int size = 0;
	
	public void addFirst(Node node) {
		if (node == null) {
			return;
		}
		
		if (size == 0) {
			head = node;
			tail = node;
			size++;
			return;
		}
		
		
		node.setNext(head);
		node.setPrevious(null);
		head.setPrevious(node);
		head = node;
		size++;
	}
	
	public void removeLast() {
		if (size == 0) {
			return;
		}

		tail = tail.getPrevious();
		tail.setNext(null);
		size--;
	}
	
	public void remove(Node node) {
		if (size == 0 || node == null) {
			return;
		}
		
		Node previous = node.getPrevious();
		Node next = node.getNext();
		
		if (previous != null) {
			previous.setNext(next);
		}
		else {
			// this node is first node
			head = next;
		}
		
		
		if (next != null) {
			next.setPrevious(previous);
		}
		else {
			//this node is last node
			tail = previous;
		}
		
		size--;
		
	}
	
	public void moveToFirst(Node node) {
		if (head == node || node == null) {
			return;
		}
		
		remove(node);
		addFirst(node);
	}
	
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
