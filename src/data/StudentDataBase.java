package data;

import java.util.Arrays;
import java.util.List;


public class StudentDataBase {
	
	public static List<Student> getAllStudents() {
		
		/*
		 * 2nd grade Students
		 */
		
		Student student1 = new Student("sathish",2, 3.5, "male", Arrays.asList("volleyball","cricket","kabaddi"));
		Student student2 = new Student("sandhya",2, 3.9, "female",Arrays.asList("basketball","volleyball","throwball"));
	
		
		/*
		 * 3rd grade Students
		 */
		
		Student student3 = new Student("kumar",3, 3.2, "male",Arrays.asList("volleyball","running","badminton"));
		Student student4= new Student("mala",3, 4.0, "male",Arrays.asList("kabaddi","badminton","throwball"));
		
		/*
		 * 4th grade Students
		 */
		
		Student student5 = new Student("meena",4, 3.5, "female",Arrays.asList("cricket","volleyball","basketball"));
		Student student6 = new Student("arun",4, 3.8, "male",Arrays.asList("throwball","running","volleyball"));
	
	
	List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
	return students;
	
	}

}
