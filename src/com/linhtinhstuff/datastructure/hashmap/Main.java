package com.linhtinhstuff.datastructure.hashmap;

import static org.junit.Assert.*;

import org.junit.Test;

public class Main {
	
	@Test
	public void testMyHashMap1() {
	    MyHashMap<String, String> map = new MyHashMap<>();
	    map.put("Viet Nam", "Ha Noi");
	    map.put("USA", "Washington DC");
	    map.put("Nepal", "Kathmandu");
	    map.put("India", "New Delhi");
	    map.put("Australia", "Sydney");
	    
	    assertNotNull(map);
	    assertEquals(5, map.size());
	    assertEquals("Ha Noi", map.get("Viet Nam"));
	    assertEquals("Kathmandu", map.get("Nepal"));
	    assertEquals("Sydney", map.get("Australia"));
	}
	
	@Test
	public void testMyHashMap2() throws Exception {
		MyHashMap<Employee, Integer> map = new MyHashMap<Employee, Integer>();
		map.put(new Employee(1), 100);
		map.put(new Employee(2), 200);
		
		assertNotNull(map);
	    assertEquals(2, map.size());
	    assertEquals(100, (int) map.get(new Employee(1)));
	    assertEquals(200, (int) map.get(new Employee(2)));
	}

}
