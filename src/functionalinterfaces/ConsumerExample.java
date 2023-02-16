package functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {
	
	static Consumer<Student> c1 = (student -> System.out.println(student));
	static Consumer<Student> c2 = (student -> System.out.print(student.getName()));
	static Consumer<Student> c3 = (student -> System.out.println(student.getActivities()));

	public static void print() {
		
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(c1);
		
	}
	
	public static void printnameandactivity() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2.andThen(c3));
	}
	
	public static void printlevel() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student -> {
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.5) {
				c2.andThen(c3).accept(student);
			}
		});
	}
	
	public static void main(String[] args) {
		
		Consumer<String> c = (con) -> System.out.println(con.toUpperCase());
		c.accept("java8 Functional interface consumer");
		
		//print();
		
		//printnameandactivity();
		
		printlevel();

	}

}
