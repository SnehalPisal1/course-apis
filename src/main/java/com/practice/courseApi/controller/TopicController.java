package com.practice.courseApi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.courseApi.bean.Topic;
import com.practice.courseApi.service.TopicServiceImpl;

@RestController
@RequestMapping("courses/{courseId}")
public class TopicController {
	
	@Autowired
	private TopicServiceImpl topicServiceImpl;
	
	@PostMapping("/topics")
	public ResponseEntity<Map<String, Object>> addTopic(@RequestBody Topic topic,@PathVariable Integer courseId ) {
		
		System.out.println("TopicController courseId: "+courseId);

		topicServiceImpl.addTopic(topic, courseId);
		Map<String, Object> response=new HashMap<String,Object>();
		
		response.put("Topic Id", topic.getTopicId());
		response.put("message","Topic added sucessfully..");
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

}
