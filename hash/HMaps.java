package com.basiccodings.hash;

import java.util.HashMap;

public class HMaps {
	public static void main(String[] args) {

		HashMap<String, String> detail = new HashMap<String, String>();
		detail.put("Ahamed", "CS");
		detail.put("Syed", "CS");
		detail.put("Eid", "b.com");
		detail.put("Afzal", "b.com");
		detail.put("Dhina", "IT");
		System.out.println(detail);

		System.out.println("modify the element");
		detail.put("Dhina", "CS");
		System.out.println(detail);

		System.out.println("modify the element");
		detail.put("Dhina", "CS");
		System.out.println(detail);

		System.out.println("Remove the element");
		detail.remove("afzal");
		System.out.println(detail);

		System.out.println("Get the element");
		detail.get("Dhina");
		System.out.println(detail);

		System.out.println("Loop the map");
		for (String student : detail.keySet()) {
			System.out.println(student);
		}
	}

}
