
public class EmailLogService implements LogService{

	@Override
	public void log(String logMessage) {
		System.out.println("Email'e loglandi!"+logMessage);
		
	}

}
