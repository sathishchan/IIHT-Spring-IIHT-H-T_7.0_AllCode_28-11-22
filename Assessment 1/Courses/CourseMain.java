package Courses;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CourseMain {
	
	
	public static void displaymain() {
		
		//Consumer<Course> c1 = course -> System.out.println(course);
		List<Course> courseList = CourseDataBase.getAllCourses();
		courseList.stream()
					.forEach(course -> System.out.println(course));
		
			}
	

	public static void displaymain1() {
		List<Course> courseList = CourseDataBase.getAllCourses();
		
		Collections.sort(courseList, (o1, o2) -> o1.getTotalfees() - o2.getTotalfees());
		System.out.println("Course Total Fees from Lowest to Highest(Assending): ");
		for (Course course : courseList) {
		System.out.println(course);
		}
		
		Collections.sort(courseList, (o1,o2) -> o2.getTotalfees() - o1.getTotalfees());
		System.out.println("\n" +"Course Total Fees from Highest to Lowest(Descending): ");
		for (Course course : courseList) {
		System.out.println(course);
		}
		
		Collections.sort(courseList, (o1,o2) -> o1.getCourseduration() - o2.getCourseduration());
		System.out.println("\n" +"Course Duration from Shortest to Longest: ");
		for (Course course : courseList) {
			System.out.println(course);
		}
	}
	
public static void displaymain2() {
		
		Consumer<Course> c2 = course -> System.out.println(course);
		List<Course> courseList = CourseDataBase.getAllCourses();
		courseList.forEach((course) -> {
			if(course.getTotalfees()>=5000) {
				c2.accept(course);
			}
		});
	}
	
	
	public static void main(String[] args) {
		
		displaymain1();
		
		}
	}


