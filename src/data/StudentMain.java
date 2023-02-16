package data;

import java.util.List;

public class StudentMain {
	
	public static void display() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(i -> System.out.println(i));
	}
	
	public static void main(String[] args) {
		
		display();
		
	}

}
