package com.basiccodings.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		File fr = new File("D://javaSample//example1//ahamed.txt");
		Scanner fileread;
		try {
			fileread = new Scanner(fr);
			while (fileread.hasNext()) {
				String value = fileread.nextLine();
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
