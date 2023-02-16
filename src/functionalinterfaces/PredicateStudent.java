package functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateStudent {
	
	static Predicate<Student> p1 = (i) -> i.getGradeLevel()>=3;
	static Predicate<Student> p2 = (i) -> i.getGpa()>=3.5;
	
	public static void display() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student -> {
			if(p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void main(String[] args) {
		
		display();
	}

}
