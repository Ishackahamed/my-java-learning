package com.basiccodings.Streamss;


import java.util.ArrayList;

public class Sample5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(10);
		list.add(50);
		System.out.println("Ascend order");
		list.stream().sorted().forEach(Ascend -> System.out.println(Ascend));

		System.out.println("Descend order");
		list.stream().sorted((n1, n2) -> n2.compareTo(n1)).forEach(Descend -> System.out.println(Descend));
	}
}