package Courses;

public class Course {
	
	private int courseid;
	private String coursename;
	private String courseteacher;
	private int courseduration;
	private int totalfees;
	
	
	public Course(int courseid, String coursename, String courseteacher, int courseduration, int totalfees) {
		this.courseid = courseid;
		this.coursename = coursename;
		this.courseteacher = courseteacher;
		this.courseduration = courseduration;
		this.totalfees = totalfees;
	}
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	public String getCourseteacher() {
		return courseteacher;
	}
	public void setCourseteacher(String courseteacher) {
		this.courseteacher = courseteacher;
	}
	
	
	public int getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(int courseduration) {
		this.courseduration = courseduration;
	}
	
	
	public int getTotalfees() {
		return totalfees;
	}
	public void setTotalfees(int totalfees) {
		this.totalfees = totalfees;
	}
	
	@Override
	public String toString() {
		return "Course [Course ID=" + courseid + ", Course Name=" + coursename + ", Course Teacher=" + courseteacher
				+ ", Course Duration=" + courseduration + " min" +", Total Fees=" + totalfees + "]";
	}
}
