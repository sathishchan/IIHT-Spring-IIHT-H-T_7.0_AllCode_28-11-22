package com.basics.ref.Cons;

public class ConsMain {

	public static void main(String[] args) {
		System.out.println("We are studing Constructor Reference");
		
		IStudent istudent = () -> new Student();
		Student student = istudent.getStudent();
		
		//student.display("sathish","MCA");
	}

}
