package com.datarynx;

public class ExceptionHandlingDemo {
	

	public static void main(String[] args) {
		try {
			System.out.println("firstline");
			System.out.println("how are u");
			System.out.println("last line");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
