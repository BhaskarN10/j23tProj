package org.j23t.dev.lessons10;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public	String	myMesg ;
	
	public MyException( String inError ) {
		
		super( inError );
		
		myMesg = inError ;
	}

	public String getExceptionMesg() {
		return myMesg ;
	}

}
