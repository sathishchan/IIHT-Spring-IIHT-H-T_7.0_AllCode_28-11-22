package functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDataBase;

public class BiConsumerExample {
	
	public static void nameandactivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		BiConsumer<String,List<String>> bicon2 = (name,activities) -> System.out.println("Name :" +name + "," + "Activities :" +activities);
	
	studentList.forEach(S -> bicon2.accept(S.getName(), S.getActivities()));
	
	}
	
	public static void main(String[] args) {
		 
		
		BiConsumer<String, String> bicon = (a,b) -> {
		  System.out.println("a :" +a + " " + "b :" +b);
	  };
	  
	  bicon.accept("java7", "java8");
	  
	  
	  BiConsumer<Integer,Integer> mul = (a,b) -> {
		  System.out.println("Multiply :" + a*b);
	  };
	  
	 // mul.accept(10, 5);
	  
	  BiConsumer<Integer,Integer> div = (a,b) -> {
		  System.out.println("Division :" + a/b);
	  };
	  
	 // div.accept(10, 5);
	  
	  mul.andThen(div).accept(5, 5);
			
	  nameandactivities();
	  
	} 

}
