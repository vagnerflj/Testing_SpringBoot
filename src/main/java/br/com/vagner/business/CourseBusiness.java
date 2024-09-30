package br.com.vagner.business;

import java.util.ArrayList;
import java.util.List;

import br.com.vagner.service.CourseService;

//SUT
public class CourseBusiness {
	
	//is a Dependency
	private CourseService service;

	public CourseBusiness(CourseService service) {
		this.service = service;
	}
	
	public List<String> retriveCoursesRelatedToSpring(String student){
		
		var filteredCourses = new ArrayList<String>();
		if("Foo Bar".equals(student)) return filteredCourses;
		var allCourses = service.retrieveCourses(student);
		
		for(String course : allCourses) {
			if(course.contains("Spring")) {
				filteredCourses.add(course);
			}
		}
		
		return filteredCourses;
	}
	public void deleteCoursesNotRelatedToSpring(String student){
		
		var allCourses = service.retrieveCourses(student);
		
		for(String course : allCourses) {
			if(!course.contains("Spring")) {
				service.deleteCourse(course);
			}
		}
		
	}
	

}
