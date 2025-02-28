package com.basiccodings.array;

import java.util.*;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);

		System.out.println(list.size());

		list.remove(3);

		System.out.println(list.size());
		System.out.println(list);
	}

}
