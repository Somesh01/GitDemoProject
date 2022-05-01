package com.somesh;

abstract class MyTest {
	static int d=10;
	public MyTest() {
		System.out.println("Constructor :: ");
	}
	abstract void calculate(int a, int b);
	int add() {
		return 0;
	}
	 final static void mul(){
		System.out.println("called :: "+d);
	}
	 final void m1()
	 { 
	    System.out.println("Final method"); 
	  } 
}

class Addition extends MyTest {
	@Override
	void calculate(int a, int b) {
		System.out.println(d + "Addition :: " + (a + b));
	}
}

class Multiplication extends MyTest {
	@Override
	void calculate(int a, int b) {
		System.out.println("Multiplication :: " + (a * b));
	}
}

public class AbstractClassPOC {
	public static void main(String[] args) {

		MyTest mt = new Addition();
		MyTest mt2 = new Multiplication();
		MyTest.mul();
		mt.calculate(20, 10);
		mt2.calculate(20, 10);
		MyTest.d=30;
		mt.calculate(20, 10);
		mt.m1();

	}
}
