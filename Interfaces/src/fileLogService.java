public class fileLogService implements LogService {

	@Override
	public void log(String logMessage) {
		System.out.println("Dosyaya Loglandi: "+logMessage);
		
	}

	
	

}
