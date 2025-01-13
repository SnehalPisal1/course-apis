package  com.practice.courseApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.courseApi.bean.Course;
import com.practice.courseApi.repository.CourseRepository;
import com.practice.courseApi.repository.TopicRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Override
	public Course addCourse(Course course) {
		courseRepository.save(course);
		return course;	
	}

	@Override
	public List<Course> getAllCourse() {
		return courseRepository.findAll();
	}

	@Override
	public Course  getCourseById(Integer courseId) {		
		return courseRepository.findById(courseId).get();
	}

}
