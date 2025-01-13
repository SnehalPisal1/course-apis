package com.practice.courseApi.service;

import org.springframework.stereotype.Service;

import com.practice.courseApi.bean.Topic;

@Service
public interface TopicService {
	
	public void addTopic(Topic topic, Integer courseId);

}
