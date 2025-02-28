package com.basiccodings.filehandling;

import java.io.File;

public class AccessFile {

	public static void main(String[] args) {
		File ex = new File("//D://javaSample");

		// String[] sam = ex.list();
		// for(int i=0; i<sam.length;i++) {
		// System.out.println(sam[i]);
		// }

		File[] f = ex.listFiles();
		for (int i = 0; i < ex.length(); i++) {
			System.out.println(f[i]);
		}
	}

}
