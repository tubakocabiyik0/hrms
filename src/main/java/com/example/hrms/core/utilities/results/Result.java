package com.example.hrms.core.utilities.results;

public class Result {
	private String message;
	private boolean isSuccess;

	public Result(boolean isSuccess) {
		super();
		this.isSuccess = isSuccess;
	}

	public Result(boolean isSuccess, String message) {
		this(isSuccess);
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

}
