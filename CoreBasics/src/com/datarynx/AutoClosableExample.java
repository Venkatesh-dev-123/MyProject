package com.datarynx;

public class AutoClosableExample implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close object");
	}

}
