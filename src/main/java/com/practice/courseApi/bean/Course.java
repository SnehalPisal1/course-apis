package com.practice.courseApi.bean;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int course_Id;
	
	private String courseName;
	
	private String courseDescription;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Topic> topics;
	
	public List<Topic> getTopics() {
		return topics;
	}
	
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	public int getCourseID() {
		return course_Id;
	}
	public void setCourseID(int courseID) {
		this.course_Id = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String description) {
		this.courseDescription = description;
	}

}
