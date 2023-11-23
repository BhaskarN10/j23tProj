package org.j23t.dev.lessons90;

public class My10Types {
    public String myVar ; // "Ram"
    private Double myDbl ; // 3.14

    protected int[]  myAry = new int[5] ;

    int  myAry2[] = new int[5] ;

    private Empl myEmpl ;  // employee data

    private Dept myDept ;

    private Tsheet myTseet ;

    public static void main( String[] a ) {
        My10Types mt = new My10Types();  // instantiate

        mt.myVar = "20";
        mt.myEmpl = new Empl(); // new instance of employee
        mt.myEmpl.ename = "John" ;

        mt.myDept = new Dept() ;
        mt.myDept.dname = "IT" ;
        mt.myDept.did = 100 ; // primary key in sql

        mt.myEmpl.deid = mt.myDept.did ;
    }
}
