import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	List<Course> courses;

	public CourseManager() {
		courses = new ArrayList<Course>();
	}

	public List<Course> getAll() {
		return courses;
	}

	public void add(Course course) {
		if (!checkIfCourseExists(course.getName())) {
			courses.add(course);
		} else {
			System.out.println("Kurs Mevcut");
		}
	}

	public void delete(Course course) 
	{
		courses.remove(getById(course.getId()));
		
	}
	
	public void update(Course course) 
	{
		Course courseToUpdate=getById(course.getId());
		courseToUpdate.setName(course.getName());
		courseToUpdate.setPicture(course.getPicture());
		courseToUpdate.setpLanguage(course.getpLanguage());
	}
	
	private boolean checkIfCourseExists(String courseName) {
		boolean exists = false;
		for (Course item : courses) {
			if (item.getName() == courseName) {
				exists = true;
			}
		}
		return exists;
	}

	private Course getById(int id) {
		Course courseToFind = null;
		for (Course item : courses) {
			if (item.getId() == id) {
				courseToFind = item;
			}
		}
		return courseToFind;
	}
}
