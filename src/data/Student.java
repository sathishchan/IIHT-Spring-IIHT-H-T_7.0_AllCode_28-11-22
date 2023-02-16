package data;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int gradeLevel;
	private Double gpa;
	private String gender;
	private List<String> activities = new ArrayList<>();
	
	
	public Student(String name, int gradeLevel, Double gpa, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}


	public Student() {
		super();
	}



	public List<String> getActivities() {
		return activities;
	}


	public void setActivities(List<String> activities) {
		this.activities = activities;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGradeLevel() {
		return gradeLevel;
	}


	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}


	public Double getGpa() {
		return gpa;
	}


	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activities=" + activities + "]";
	}


	
}
