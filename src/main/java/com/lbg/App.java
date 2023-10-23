package com.lbg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator cc = new Calculator();
        System.out.println( cc.add(3,7) );
        System.out.println( cc.subtract(3,7) );
        System.out.println( cc.remainingPercentage(100,20) );
    }
}
