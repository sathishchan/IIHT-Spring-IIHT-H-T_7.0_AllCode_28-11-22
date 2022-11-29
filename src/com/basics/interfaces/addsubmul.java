package com.basics.interfaces;

interface Square1 {
	void square1();
	static Integer Add(Integer i) { return i+i;};
	static Integer Sub(Integer i) { return i-i;};
	static Integer Mul(Integer i) { return i*i;};
	static Integer Div(Integer i) { return i/i;};
}

public class addsubmul {

	public static void main(String[] args) {
		Square1 s1= new Square10();
		Square1 s2= new Square10();
		Square1 s3= new Square10();
		Square1 s4= new Square10();
		s1.square1();
		s2.square1();
		s3.square1();
		s4.square1();
		System.out.println("Addition is " +Square1.Add(10));
		System.out.println("Subtraction is " +Square1.Sub(10));
		System.out.println("Multiply is " +Square1.Mul(10));
		System.out.println("Division is " +Square1.Div(10));
	}
	
}
	class Square10 implements Square1 {
		public void square1() {
			
		}
			
	}



