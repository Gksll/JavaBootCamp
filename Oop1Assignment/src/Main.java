
public class Main {

	public static void main(String[] args) {
		InstructorManager manager = new InstructorManager();
		Instructor instructor1 = new Instructor();
		instructor1.id=1;
		instructor1.name="Goksel";
		Instructor instructor2 = new Instructor();
		instructor1.id=1;
		instructor1.name="Osman";
		manager.add(instructor1);
		manager.update(instructor1);
		
		for (Instructor item : manager.getAll()) {
			System.out.println(item.name);
		}
		
		
		
		
		
		
		
//		CourseManager manager = new CourseManager();
//		Course course1 = new Course();
//		course1.setId(1);
//		course1.setName("Java Kampi");
//		course1.setPicture("123asdl1k231k31k3");
//		course1.setpLanguage("Native Java");
//		Course course2 = new Course();
//		course2.setId(1);
//		course2.setName("Python Kampi");
//		course2.setPicture("123asdl1k231k31k3");
//		course2.setpLanguage("Native Java");
//		manager.add(course1);
//		manager.add(course2);
//		manager.update(course1);
//		
//		for (Course c : manager.getAll()) {
//		System.out.println(c.getName());
//		}
		
		
//		Category c1 = new Category();
//		CategoryManager manager = new CategoryManager();
//		c1.setId(1);
//		c1.setDescription("1 numaralı kategori");
//		c1.setName("Back-End");
//		Category c2 = new Category();
//		c2.setId(2);
//		c2.setDescription("2 numaralı kategori");
//		c2.setName("Front-End");
//		Category c3 = new Category();
//		c3.setId(2);
//		c3.setDescription("3 numaralı kategori");
//		c3.setName("Front-Back");
//		
//		manager.add(c1);
//		manager.add(c2);
//		manager.delete(c1);
//		manager.update(c3);
//		
//		
//		
//		for (Category c : manager.GetAll()) {
//			System.out.println(c.getName());
//		}

	}

}
