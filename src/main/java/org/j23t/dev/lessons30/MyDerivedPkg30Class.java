package org.j23t.dev.lessons30;


import org.j23t.dev.lessons20.MyBaseClass;

public class MyDerivedPkg30Class extends MyBaseClass {

		String	d30defString ;
	public	String	d30pubString ;
	private	String	d30prvtString ;
	protected	String	d30protString ;
	
	public MyDerivedPkg30Class( String a, String b, String c, String d) {
			super( a, b, c, d );
			
			d30defString = "d" + a ;
			d30pubString = "d" + b;
			d30prvtString = "d" + c;
			d30protString = "d" + d ;		
	}
	
	public void testBaseclassAccess() {
	// access error	defString = "10" ;
		pubString = "20" ;
	// access error	prvtString = "30" ;
		protString = "40" ;	
	}
	

	public String getD30defString() {
		return d30defString;
	}

	public void setD30defString(String d30defString) {
		this.d30defString = d30defString;
	}

	public String getD30pubString() {
		return d30pubString;
	}

	public void setD30pubString(String d30pubString) {
		this.d30pubString = d30pubString;
	}

	public String getD30prvtString() {
		return d30prvtString;
	}

	public void setD30prvtString(String d30prvtString) {
		this.d30prvtString = d30prvtString;
	}

	public String getD30protString() {
		return d30protString;
	}

	public void setD30protString(String d30protString) {
		this.d30protString = d30protString;
	}

}
