package com.basiccodings.maps;

import java.util.Map;
import java.util.HashMap;

public class MapHash {

	public static void main(String[] args) {
		// map is key value pair

		Map<String, Integer> Quantity = new HashMap<String, Integer>();

		Quantity.put("apple", 10);
		Quantity.put("orange", 20);
		Quantity.put("grapes", 30);
		Quantity.put("banana", 40);

		for (String key : Quantity.keySet()) {
			System.out.println(key + " :" + Quantity.get(key));
		}

		System.out.println();
		System.out.println("After Modify Value");
		Quantity.put("banana", 50);

		for (String key : Quantity.keySet()) {
			System.out.println(key + " :" + Quantity.get(key));
		}

		System.out.println();
		System.out.println("After Remove Element");
		Quantity.remove("banana");

		for (String key : Quantity.keySet()) {
			System.out.println(key + " :" + Quantity.get(key));
		}

	}

}
