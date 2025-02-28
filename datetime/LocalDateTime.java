package com.basiccodings.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalDateTime {

	public static void main(String[] args) {
		SimpleDateFormat sdatef = new SimpleDateFormat("hh:mm:ss a dd/MM/YYYY");
		Date date = new Date();
		System.out.println(date);
		System.out.println(sdatef.format(date));

	}

}
