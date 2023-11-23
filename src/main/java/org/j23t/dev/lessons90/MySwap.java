package org.j23t.dev.lessons90;

public class MySwap {

    int[]  myarray = new int[5] ;

    void myInt() {
        myarray[0] = 4 ;
        myarray[1] = 9 ;
        myarray[2] = 1 ;
    }

    public static void main( String[] a ) {
        MySwap ms = new MySwap();

        ms.myarray[1] = ms.myarray[2] ;

    }


}
