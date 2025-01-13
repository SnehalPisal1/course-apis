package com.practice.courseApi.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int topicId;
	
	private String topicName;
	private String topicDescription;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_Id", nullable = false)
    @JsonBackReference
	private Course course;
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int id) {
		this.topicId = id;
	}
	public String getTopicName() {
		return topicName;
	}
	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", topicName=" + topicName + ", topicDescription=" + topicDescription
				+ ", course=" + course + "]";
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

}
