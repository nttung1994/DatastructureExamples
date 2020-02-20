package com.linhtinhstuff.datastructure.lrucache;

import java.util.HashMap;
import java.util.Map;

public class Datasource {
	
	private static Map<Integer, String> datasource;
	private static final int MAX_SIZE = 100;
	static {
		datasource = new HashMap<Integer, String>();
		for (int i = 0; i < MAX_SIZE; i++) {
			datasource.put(i, "Data of key " + i);
		}
	}
	
	private Datasource() {}
	
	public static String getData(int key) {
		if (datasource.containsKey(key)) {
			return datasource.get(key);
		}
		return "Resource not found";
	}

}
