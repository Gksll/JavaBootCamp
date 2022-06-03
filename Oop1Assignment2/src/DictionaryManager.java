import java.util.ArrayList;
import java.util.List;

public class DictionaryManager implements DictionaryService{
	List<Dictionary> values ;
	public DictionaryManager() 
	{
		values = new ArrayList<Dictionary>();
	}
	@Override
	public void add(Dictionary dictionary) {
		values.add(dictionary);
		
	}

	@Override
	public List<Dictionary> getAll() {
		
		return values;
	}
	

}
