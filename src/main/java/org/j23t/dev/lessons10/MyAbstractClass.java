package org.j23t.dev.lessons10;

public abstract class MyAbstractClass {
	
	private	int	mySalary ; 		 	// data
	
	public void myBaseMethod() {	// function or method
		System.out.println("myBaseMethod:  Test" + mySalary) ;
		mySalary = mySalary + 100;
	}

	abstract public void  myMethod() ;

	// what is a class and why class

	//  class:  data + functions/method to process data

	public static void main( String[] arg ) {
		System.out.println("starting:  class" ) ;
	}

}
