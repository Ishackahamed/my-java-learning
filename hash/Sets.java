package com.basiccodings.hash;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

		Set<String> detail = new HashSet<String>();
		detail.add("Ahamed");
		detail.add("Syed");
		detail.add("Eid");
		detail.add("Afzal");
		detail.add("Dhina");
		System.out.println(detail);

		System.out.println("modify the element");
		detail.add("Dhina");
		System.out.println(detail);

		System.out.println("modify the element");
		detail.add("Dhina");
		System.out.println(detail);

		System.out.println("Remove the element");
		detail.remove("afzal");
		System.out.println(detail);

		System.out.println("Remove the element");
		detail.remove("afzal");
		System.out.println(detail);

		System.out.println("Loop the set");
		for (String student : detail) {
			System.out.println(student);
		}

	}

}
