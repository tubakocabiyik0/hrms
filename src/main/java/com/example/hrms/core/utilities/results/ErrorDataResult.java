package com.example.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult {

	public ErrorDataResult(T data, boolean isSuccess, String message) {
		super(data, false, message);
		// TODO Auto-generated constructor stub
	}

	public ErrorDataResult(T data, boolean isSuccess) {
		super(data, false);

	}
}
