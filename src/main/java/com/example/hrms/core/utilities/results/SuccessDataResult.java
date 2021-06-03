package com.example.hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult {

	public SuccessDataResult(T data,boolean isSuccess) {
		super(data,true);
	}
	
	public SuccessDataResult(T data,String message) {
		super(data,true,message);
	}
	
}
