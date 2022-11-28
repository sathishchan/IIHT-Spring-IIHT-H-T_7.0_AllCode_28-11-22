package com.basics.lambda;

public class LearnLambda {

	public static void main(String[] args) {
		System.out.println("Hi All");
		
		LearnLambda lambda1 = new LearnLambda();
		
		Mathoperation add = (Integer num1, Integer num2) -> num1 + num2;
		Mathoperation sub = (Integer num1, Integer num2) -> num1 - num2;
		Mathoperation div = (Integer num1, Integer num2) -> num1 / num2;
		Mathoperation multiply = (Integer num1, Integer num2) -> num1 * num2;
		
		System.out.println("Adding of two numbers 100,50= " +lambda1.operate(100, 50, add));
		System.out.println("Subtraction of two numbers 100,50= " +lambda1.operate(100, 50, sub));
		System.out.println("Division of two numbers 100,50= " +lambda1.operate(100, 50, div));
		System.out.println("Multiply of two numbers 100,50= " +lambda1.operate(100, 50, multiply));

	}
	
	private Integer operate(Integer num1, Integer num2, Mathoperation mathoperation) {
		return mathoperation.operation(num1, num2);
	}

}
