package com.basiccodings.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinked {

	public static void main(String[] args) {

		Map<String, String> city = new LinkedHashMap<>();

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
