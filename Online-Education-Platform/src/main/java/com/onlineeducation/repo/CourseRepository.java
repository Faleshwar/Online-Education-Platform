package com.onlineeducation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineeducation.model.Course;
import java.util.List;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

	List<Course> getCourseByCourseTitle(String courseTitle);
}
