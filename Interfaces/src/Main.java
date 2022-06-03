import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<LogService> services=new ArrayList<LogService>();
		services.add(new DatabaseLogService());
		services.add(new EmailLogService());
		services.add(new fileLogService());
		Instructor instructor1=new Instructor();
		instructor1.id=1;
		instructor1.name="gksl";
		
		CourseManager manager = new CourseManager(services);
		manager.add(instructor1);
		for (Instructor item : manager.getAll()) {
			System.out.println(item.name);
		}
		
		
		
		
		
//		List<LogService> LogServices = new ArrayList<LogService>();
//		LogServices.add(new DatabaseLogService());
//		LogServices.add(new EmailLogService());
//		LogServices.add(new fileLogService());
//		
//		for (LogService item : LogServices) {
//			item.log("Goksel logladi");
//			
//		}
		
//		LogService logService = new fileLogService();
//				logService.log("goksel ekledi");

	}

}
