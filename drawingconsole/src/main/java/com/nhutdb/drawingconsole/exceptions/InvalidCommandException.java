package com.nhutdb.drawingconsole.exceptions;

public class InvalidCommandException extends RuntimeException {
	private final String usage;
	
	public InvalidCommandException(String errMsg, String inUsage) {
		super(errMsg);
		usage = inUsage;
	}
	public String getUsage() {
		return usage;
	}

}
