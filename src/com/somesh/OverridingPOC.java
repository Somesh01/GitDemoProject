package com.somesh;

class Father {

	public void home() {
		System.out.println("Father's home");
	}

	 static void car() {
		System.out.println("Father's Car");
	}
}

class Son extends Father {

	 protected static void car() {
		System.out.println("Son's Car");
	}
}

public class OverridingPOC {

	public static void main(String[] args) {
		Son s = new Son();
		s.home();
		s.car();
	}

}
