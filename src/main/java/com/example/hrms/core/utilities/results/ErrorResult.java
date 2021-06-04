package com.example.hrms.core.utilities.results;

public class ErrorResult extends Result {

	public ErrorResult(boolean isSuccess) {
		super(false);
		
	}

	public ErrorResult(String message) {
		super(false,message);
		
	}
}
