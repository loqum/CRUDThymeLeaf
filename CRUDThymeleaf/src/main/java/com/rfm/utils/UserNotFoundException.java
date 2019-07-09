package com.rfm.utils;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6000538989065845518L;

	public UserNotFoundException(long id) {
		super("User " + id + " not found.");
	}

}
