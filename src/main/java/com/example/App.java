package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int a=3;
        int b=9;
        System.out.println("sum of" +a+ "and" +b+ "is:" +sum(a,b));
    }
    public static int sum(int x,int y){
        return x+y;
    }
}
