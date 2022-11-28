package com.basics.functions;

public class BasicFunction {
	
	public static void main(String[] args) {
				System.out.println(Addition(12,23));
				System.out.println(Sub(12,23));
				System.out.println(Mul(12,23));
				System.out.println(Div(12,23));
				System.out.println(Squ(12,23));
				System.out.println(Cube(12,23));
}
	static Integer Addition(Integer num1, Integer num2) {
		return num1+num2;
	}
	static Integer Sub(Integer num1, Integer num2) {
		return num1-num2;
	}
	static Integer Mul(Integer num1, Integer num2) {
		return num1*num2;
	}
	static Integer Div(Integer num1, Integer num2) {
		return num1/num2;
	}
	static Integer Squ(Integer num1, Integer num2) {
		return num1*num1;
	}
	static Integer Cube(Integer num1, Integer num2) {
		return num1*num1*num1;
	}
}