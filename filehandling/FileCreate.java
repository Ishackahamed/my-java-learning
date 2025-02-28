package com.basiccodings.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		File ex = new File("//D://javaSample//example1//ahamed.txt");
		try {
			if (!ex.exists()) {
				ex.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(ex.mkdir());
	}

}
