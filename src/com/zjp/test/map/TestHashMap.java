package com.zjp.test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer,Integer> m = new HashMap<>();
		for(int i = 1; i <= 16; i++) {
			m.put(i, i);
		}
	}
}
