import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> students = new ArrayList<String>();
		students.add("Engin");
		students.add("Mert");
		students.add("Emrah");
		
		
		
		for (String student : students) {
			System.out.println(student);
		}
		students.remove("Engin");
	}

}
