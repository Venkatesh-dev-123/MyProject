package com.datarynx;

public class ExceptionHandlingDemo {
	

	public static void main(String[] args) {
		try {
			System.out.println("firstline");
			System.out.println("how are u");
			System.out.println("last line");
			System.out.println("No exception");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
