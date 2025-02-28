package com.basiccodings.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDelete {

	public static void main(String[] args) throws IOException {
		File ex = new File("//D://javaSample//example1//ahamed.txt");
		ex.createNewFile();
		ex.canRead();
		ex.canWrite();

//		if(ex.exists()) {
//			ex.delete();
//			System.out.println(ex.mkdir());
//		}

	}

}
