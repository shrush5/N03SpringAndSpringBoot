package org.tnsif.placementmanagement.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")


	public class Student{
	private Integer roll;
	private String qualification;
	private String course;
	private Integer year;
	private Integer hallticketno;
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(Integer hallticketno) {
		this.hallticketno = hallticketno;
	}
	public Student(Integer roll, String qualification, String course, Integer year, Integer hallticketno) {
		super();
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallticketno = hallticketno;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", qualification=" + qualification + ", course=" + course + ", year=" + year
				+ ", hallticketno=" + hallticketno + "]";
	}
	
	

}
