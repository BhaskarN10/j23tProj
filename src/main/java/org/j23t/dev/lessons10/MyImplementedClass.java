package org.j23t.dev.lessons10;


public class MyImplementedClass implements MyInterface {

	@Override
	public void myIntMethod() {
		//  see myInterface
		System.out.println("myIntMethod: Test");
	}

	public static void main( String[] args ) {
		MyImplementedClass mic = new MyImplementedClass() ;
		mic.myIntMethod();
		System.out.println("Implemnted class example");
	}

}
