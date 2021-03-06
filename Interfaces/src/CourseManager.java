import java.util.List;
import java.util.ArrayList;

public class CourseManager {
	List<LogService> logServices; 
	List<Instructor> instructors; 

	public CourseManager(List<LogService> logServices) { 
		this.logServices = logServices; 
		instructors = new ArrayList<Instructor>();
	}

	public void add(Instructor instructor) {
		instructors.add(instructor);

		logMessage("eklendi");

	}

	public List<Instructor> getAll() {
		return instructors;
	}

	private void logMessage(String message) {
		for (LogService logs : logServices) {
			logs.log("loglandi");
		}

	}
}

// kodlama C# 4-5 gün ödevleri