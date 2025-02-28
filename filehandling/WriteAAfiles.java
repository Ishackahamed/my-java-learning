package com.basiccodings.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAAfiles {

	public static void main(String[] args) {
		try {
			File ex = new File("D://javaSample//example1//ahamed.txt");

			FileWriter fw = new FileWriter(ex);

			fw.write(
					"This improved version is robust, easy to maintain, and user-friendly. Let me know if you'd like further enhancements!");

			fw.close();

			System.out.println("Content successfully written to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
}
