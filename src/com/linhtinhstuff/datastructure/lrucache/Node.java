package com.linhtinhstuff.datastructure.lrucache;

public class Node {
	
	private int key;
	private String data;
	private Node previous;
	private Node next;
	
	public Node(int key, String value) {
		this.key = key;
		this.data = value;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
