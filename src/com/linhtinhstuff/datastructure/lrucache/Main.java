package com.linhtinhstuff.datastructure.lrucache;

public class Main {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache();
		//7, 0, 1, 2, 0, 3
		cache.get(7);
		cache.print();
		
		cache.get(0);
		cache.print();
		
		cache.get(1);
		cache.print();
		
		cache.get(2);
		cache.print();
		
		cache.get(0);
		cache.print();
		
		cache.get(3);
		cache.print();
	}

}
