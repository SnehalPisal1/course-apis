package  com.practice.courseApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practice.courseApi.bean.Course;


@Service
public interface CourseService {
	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourse();
	 
	public Course getCourseById(Integer courseId);
	
}
