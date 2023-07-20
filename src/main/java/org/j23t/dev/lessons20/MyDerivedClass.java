package org.j23t.dev.lessons20;

import com.java.lesson20.MyBaseClass;

public class MyDerivedClass extends MyBaseClass {
		String	ddefString ;
	public	String	dpubString ;
	private	String	dprvtString ;
	protected	String	dprotString ;
	
	public MyDerivedClass( String a, String b, String c, String d) {
			super( a, b, c, d );
			
			ddefString = "d" + a ;
			dpubString = "d" + b;
			dprvtString = "d" + c;
			dprotString = "d" + d ;		
	}

	public void testBaseclassAccess() {
		defString = "10" ;
		pubString = "20" ;
		prvtString = "30" ;
		protString = "40" ;		
}
	
}
