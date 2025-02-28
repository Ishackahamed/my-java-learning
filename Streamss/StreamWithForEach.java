package com.basiccodings.Streamss;


import java.util.ArrayList;

public class StreamWithForEach {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ahamed");
		names.add("Ishack");
		names.add("Ibrahim");
		names.add("Dhina");
		names.add("Eid");
		names.add("Samsu");

		names.stream().forEach(snames -> System.out.println(snames));

	}

}
