package org.j23t.dev.lessons10;

//  this class inherits abstract class
public class MyExtendedClass extends MyAbstractClass {

	public 	Integer myNumber =10 ;
	@Override
	public void myMethod() {
		//
		System.out.println("myMethod: number " + myNumber);
	}

	public static void main( String[] args ) {

		MyExtendedClass mec = new MyExtendedClass() ;
		mec.myBaseMethod();		// calls base class method
		mec.myMethod();			// calls this class method
		System.out.println("End of extended class.");
	}

}
