package com.basiccodings.Streamss;


import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamUsingMap {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Ahamed");
		list.add("Eid");
		list.add("Afzal");
		list.add("Ibrahim");
		list.add("Dhina");
		List<String> starts = list.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		System.out.println(starts);
	}
}
