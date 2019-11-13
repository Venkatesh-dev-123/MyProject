package com.datarynx;

import java.io.File;
import java.io.FileInputStream;

public class TryWithResource {

	public static void main(String[] args)throws Exception {
		try(FileInputStream file = new FileInputStream("D:/input.txt")){
			int data = file.read();
			while(data!=-1) {
				data = file.read();
				System.out.println(data);
			}
			
			
		} 
		try(AutoClosableExample auto = new AutoClosableExample();AutoClosableExample auto1 = new AutoClosableExample()){
			//System.out.println(auto);
		}
		
		/*
			 * catch(Exception e) { e.printStackTrace();
			 * System.out.println("file not found"); }
			 */
	}
	
}
