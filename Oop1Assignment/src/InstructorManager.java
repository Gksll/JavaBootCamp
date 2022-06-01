import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
	List<Instructor> instructors;

	public InstructorManager() {
		instructors = new ArrayList<Instructor>();
	}

	public List<Instructor> getAll() {
		return instructors;
	}

	public void add(Instructor instructor) {
		if (!checkIfInstructorExists(instructor.name)) {
			instructors.add(instructor);
		} else {
			System.out.println("The name used already");
		}
	}

	public void delete(Instructor instructor) {
		instructors.remove(getById(instructor.id));
	}

	public void update(Instructor instructor) {
		Instructor instructorToUpdate = getById(instructor.id);
		instructorToUpdate.name=instructor.name;
	}

	public Instructor getById(int id) {
		Instructor instructorToFind = null;
		for (Instructor item : instructors) {
			if (item.id == id) {
				instructorToFind = item;
			}
		}
		return instructorToFind;
	}

	public boolean checkIfInstructorExists(String name) {
		boolean exists = false;
		for (Instructor item : instructors) {
			if (item.name == name) {
				exists = true;
			}
		}
		return exists;
	}
}
