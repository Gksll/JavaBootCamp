
public class DatabaseLogService implements LogService {

	@Override
	public void log(String logMessage) {
		System.out.println("Veri tabanına loglandi!"+logMessage);
		
	}

}
