package com.basiccodings.program;
//import java.util.HashMap;

//import java.util.Map;

public class TwoSum {

	// public int[] twoSum(int[] nums, int target)
	// {
	// Map<Integer,Integer> map = new HashMap<>();
	// for(int i=0; i<nums.length; i++)
	// {
	// if(map.containsKey (target-nums[i]))
	// {
	// return new int[]{i,map.get(target -nums[i])};
	// }
	// map.put(nums[i],i);
	// }
	// return null;
	// }

	// nums = [2, 7, 11, 15], target = 9
	public static void main(String[] args) {
		int target = 9;
		int[] nums = { 2, 7, 11, 15 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; i++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("sum of target is : " + nums[i] + " " + nums[j]);
				}
			}
		}
	}
}