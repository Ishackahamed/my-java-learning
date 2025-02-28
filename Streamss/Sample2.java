package com.basiccodings.Streamss;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;

public class Sample2 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,4,9,8,2);

		nums.stream()
		.filter(n -> n%2==1)
		.map(n -> n*2)
		.forEach(n -> System.out.println(n));

		//Stream<Integer> mapdata =data.map(n -> n*2);
		//mapdata.forEach(n -> System.out.println(n));

		//		long count =data.count();
		//		System.out.println(count);
		//		//data.forEach(n -> System.out.println(n));
	}
}