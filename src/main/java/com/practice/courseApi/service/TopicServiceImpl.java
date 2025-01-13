package com.practice.courseApi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.courseApi.bean.Course;
import com.practice.courseApi.bean.Topic;
import com.practice.courseApi.repository.CourseRepository;
import com.practice.courseApi.repository.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService{
	
	private static final Logger logger=LoggerFactory.getLogger(TopicServiceImpl.class);
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired 
	private CourseRepository courseRepository;
	
	@Override
	public void addTopic(Topic topic, Integer courseId) {
		
		System.out.println("courseId: "+courseId);

		
		Course course= courseRepository.findById(courseId).get();
		
		System.out.println("course.getId--"+course.getCourseID());
		logger.info("course.getId--"+course.getCourseID());

		topic.setCourse(course);
		
		topicRepository.save(topic);
	}

}
