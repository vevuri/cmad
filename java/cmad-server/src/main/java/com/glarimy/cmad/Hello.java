package com.glarimy.cmad;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hello {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
