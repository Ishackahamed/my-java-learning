package com.basiccodings.arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Sample1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Grapes");
		System.out.println(list);

		System.out.println("Add the element in between");
		list.add(1, "Mango");
		System.out.println(list);

		System.out.println("Remove the element");
		list.remove(3);
		System.out.println(list);

		System.out.println("Change the element");
		list.set(1, "Mangoooo");
		System.out.println(list);

		System.out.println("Size of array");
		list.size();
		System.out.println(list);

		System.out.println("Sort of array");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("Loop the array");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Loop the array");
		for (String fruits : list) {
			System.out.println(fruits);
		}

	}

}
