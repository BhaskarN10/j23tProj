package org.j23t.dev.lessons10;

public class MyBasicClass {

	public String  myVar = "Hi";		// data of a class

	public void myMethod() {
										// processing of data in a class
		System.out.println("MyMethod " + myVar);
	}

	public static void main(String[] args) {
		// Instantiate a class - new creates an object from class
		MyBasicClass mbc = new MyBasicClass() ;

		mbc.myMethod();		// prints

		System.out.println("End");
	}

}
