package com.practice.courseApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.courseApi.bean.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer>{
	
	//@Query("select * from topic t inner join course c on c.course_id=t.course_id where c.course_id = :course_id")
	//public List<Topic> fetchTopics(@Param("course_id") int course_id);

}
