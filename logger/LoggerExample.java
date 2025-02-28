package com.basiccodings.logger;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class LoggerExample {
	private static final Logger logger = System.getLogger(LoggerExample.class.getName());

	// ANSI color codes
	private static final String RESET = "\u001B[0m"; // Reset color
	private static final String RED = "\u001B[31m"; // For ERROR
	private static final String YELLOW = "\u001B[33m"; // For WARNING
	private static final String GREEN = "\u001B[32m"; // For INFO
	private static final String CYAN = "\u001B[36m"; // For DEBUG
	private static final String PURPLE = "\u001B[35m"; // For TRACE

	public static void main(String[] args) {
		logWithColor(Level.ERROR, "This is an ERROR message");
		logWithColor(Level.WARNING, "This is a WARNING message");
		logWithColor(Level.INFO, "This is an INFO message");
		logWithColor(Level.DEBUG, "This is a DEBUG message");
		logWithColor(Level.TRACE, "This is a TRACE message");
	}

	private static void logWithColor(Level level, String message) {
		String coloredMessage;
		switch (level) {
		case ERROR:
			coloredMessage = RED + message + RESET;
			break;
		case WARNING:
			coloredMessage = YELLOW + message + RESET;
			break;
		case INFO:
			coloredMessage = GREEN + message + RESET;
			break;
		case DEBUG:
			coloredMessage = CYAN + message + RESET;
			break;
		case TRACE:
			coloredMessage = PURPLE + message + RESET;
			break;
		default:
			coloredMessage = message; // Default message with no color
		}

		// Log the message with the chosen color
		logger.log(level, coloredMessage);
	}
}