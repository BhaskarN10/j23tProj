package org.j23t.dev.lessons10;

public class MyStatements {
	public	int		width ;
	public	int		length ;
	
	public	int[] myNums = { 10, 5, 20 };
	public	String[] myNames = { "Ram", "Sam", "Mary" };
	
	public int calcArea() {
		
		int area = width * length ;
		return area ;
	}
	
	public void ifStatement() {

		if ( width > length ) {
			System.out.println(" width is greater than length" );
		} else {
			System.out.println(" width is less than length" );
		}
	}
	
	public void forStatement() {

		for ( int ix = 0 ; ix < 3 ; ix++ ) {
			System.out.println(" Name " + myNames[ix] );
		}

	}
	
	public void  checkStatement() throws MyException {

		if ( width < 0)
			throw new MyException("Width < zero ");

	}
	
	public void  tryStatement()  {

		try {
			checkStatement();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
