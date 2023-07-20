package org.j23t.dev.lessons20;

public class MyBaseClass {
		String	defString ;
	public	String	pubString ;
	private	String	prvtString ;
	protected	String	protString ;
	
	public MyBaseClass( String a, String b, String c, String d) {
			defString = a;
			pubString = b;
			prvtString = c;
			protString = d ;		
	}
	
	
	public String getDefString() {
		return defString;
	}
	public void setDefString(String defString) {
		this.defString = defString;
	}
	public String getPubString() {
		return pubString;
	}
	public void setPubString(String pubString) {
		this.pubString = pubString;
	}
	public String getPrvtString() {
		return prvtString;
	}
	public void setPrvtString(String prvtString) {
		this.prvtString = prvtString;
	}
	public String getProtString() {
		return protString;
	}
	public void setProtString(String protString) {
		this.protString = protString;
	}
	
	
	
}
