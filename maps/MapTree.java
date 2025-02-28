package com.basiccodings.maps;

import java.util.TreeMap;
import java.util.Map;

public class MapTree {

	public static void main(String[] args) {

		Map<String, String> city = new TreeMap<>();

		city.put("London", "UK");
		city.put("New york", "USA");
		city.put("Chennai", "India");

		for (String cities : city.keySet()) {
			System.out.println(cities + " : " + city.get(cities));
		}

		System.out.println();
		System.out.println("After Modify Element");
		city.put("Chennai", "TN India");
		for (String cities : city.keySet()) {
			System.out.println(cities + " : " + city.get(cities));
		}

		System.out.println();
		System.out.println("After Remove Element");
		city.remove("Chennai", "TN India");
		for (String cities : city.keySet()) {
			System.out.println(cities + " : " + city.get(cities));
		}

	}

}
