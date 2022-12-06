package Courses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CourseDataBase {
	
	public static List<Course> getAllCourses() {
		
		Course course1 = new Course(101,"JEE", "Sathish", 90, 3000);
		Course course2 = new Course(102,"NEET", "Nishant", 30, 5000);
		Course course3 = new Course(103,"CAT", "Vicky", 60, 2000);
		Course course4 = new Course(104, "Big Data", "Mala", 120, 7000);
		Course course5 = new Course(105, "Data Science", "Sathya", 120, 1000);
		Course course6 = new Course(106, "Software Development", "vinoth", 20, 6000);
		Course course7 = new Course(107, "Full-Stack Develpment", "Meena", 180, 4500);
		Course course8 = new Course(108, "Machine Learning", "Yaswanth", 45, 900);
		Course course9 = new Course(109, "Cloud Computing", "Arun", 50, 600);
		Course course10 = new Course(110, "DevOps", "Ram", 200, 1500);
		Course course11 = new Course(111, "Networking", "Vishal",80, 500);
		Course course12 = new Course(112, "Cyber Security", "Rani", 25, 1000);
		Course course13 = new Course(113, "Project Management", "Suba", 110, 3000);
		Course course14 = new Course(114, "Artifical Intelligence", "Santhosh", 95, 5000);
		Course course15 = new Course(115, "Business Administration", "Murali", 105, 3500);

		
		List<Course> courses = Arrays.asList(course1,course2,course3,course4,course5,course6,course7,course8,course9,course10,
				course11,course12,course13,course14,course15);
		return courses;
	}

}

//class MySort implements Comparator<Course> {

//	@Override
//	public int compare(Course o1, Course o2) {
		
//		return o1.getTotalfees() - o2.getTotalfees();
//	}
//}
	
//class MySort1 implements Comparator<Course> {

//	@Override
//	public int compare(Course o1, Course o2) {
		
//		return o1.getCourseduration() - o2.getCourseduration();
//	}
	
//}
	

