package com.linhtinhstuff.datastructure.hashmap;

public class MyHashMap<K, V> {
	private static final int CAPACITY = 16;
	private Entry<K, V>[] buckets;
	private int size;

	public MyHashMap() {
		buckets = new Entry[CAPACITY];
		size = 0;
	}

	public void put(K key, V value) {
		if (key == null || value == null) {
			return;
		}

		int hashcode = key.hashCode();
		int index = hashcode % CAPACITY;
		Entry<K, V> entry = buckets[index];		
		boolean keyExisted = false;
		
		while (entry != null) {
			if (entry.getKey().equals(key)) {
				// If key already existed, update value
				keyExisted = true;
				entry.setValue(value);
				break;
			}
			entry = entry.getNext();
		}
		
		// If key not existed, insert (key, value) into the last of bucket
		if (!keyExisted) {
			insertLast(index, new Entry<K, V>(key, value));
		}

	}
	
	public boolean containsKey(K key) {
		return get(key) == null ? false : true;
	}
	
	public V get(K key) {
		if (key == null) {
			return null;
		}
		
		int hashcode = key.hashCode();
		int index = hashcode % CAPACITY;
		
		Entry<K, V> entry = buckets[index];	
		while (entry != null) {
			if(entry.getKey().equals(key)) {
				return entry.getValue();
			}
			entry = entry.getNext();
		}
		
		return null;
	}

	private void insertLast(int index, Entry<K, V> newEntry) {
		Entry<K, V> lastEntry = buckets[index];
		if (lastEntry == null) {
			buckets[index] = newEntry;
			size++;
			return;
		}

		while (lastEntry.getNext() != null) {
			lastEntry = lastEntry.getNext();
		}
		lastEntry.setNext(newEntry);
		size++;
	}

	public int size() {
		return size;
	}
}
