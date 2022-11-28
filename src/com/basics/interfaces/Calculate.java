package com.basics.interfaces;


interface Square {
	void square();
	static Integer Sq(Integer x) { return x*x;};
		
	}

public class Calculate {

	public static void main(String[] args) {
		Square s1=new SquareOf10();
		s1.square();
		System.out.println(Square.Sq(10));

	}
	
}
	class SquareOf10 implements Square {
		public void square() {
			System.out.println("Square of the number is:" );
		}
		
	}


