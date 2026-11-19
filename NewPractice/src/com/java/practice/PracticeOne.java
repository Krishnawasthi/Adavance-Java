package com.java.practice;
class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}
public class PracticeOne {

	public static void main(String[] args) {
		A obj = new B();
		obj.show();
		B.show();

	}

}
