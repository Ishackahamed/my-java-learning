package com.basiccodings.program;

public class revserse {

//		public static void main(String[] args) {
//			
//			String name  = "amma";
//			
//			
//			String reverse = "";
//			
//			int length  = name.length();
//			
//			for (int i=length-1; i>=0; i--) 
//			{
//				reverse = reverse+name.charAt(i);
//			}
//			if (name.toLowerCase().equals(reverse.toLowerCase()))
//			{
//				System.out.println(name + " is palindrome");
//			}
//			else 
//			{
//				System.out.println(name + " is not palindrome");
//			}
//		}

	public static void main(String[] args) {
		int num = 1002;
		int result = 0;

		while (num != 0) {
			int digits = num % 10;
			result = result * 10 + digits;
			num = num / 10;
		}

		System.out.println(result);
	}
}
