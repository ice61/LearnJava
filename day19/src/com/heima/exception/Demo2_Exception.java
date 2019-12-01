package com.heima.exception;

import java.util.concurrent.ExecutionException;

public class Demo2_Exception {

	public static void main(String[] args) {
		
	}

}
class AgeOutOfBoundsException extends Exception {
	public AgeOutOfBoundsException() {
		super();
		
	}
	public AgeOutOfBoundsException(String message) {
		super(message);	
	}
}