package workshop1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
	public List<Integer> Play()
	{
		Random random = new Random();
	List<Integer> numbers = new ArrayList<>();
	for (int i = 0; i < 6; i++) {
		while(true) 
		{
			int number = random.nextInt(49)+1;
			if(!numbers.contains(number)) {
				numbers.add(number);
				break;
			}
		}
		
	}
	return numbers;
  }
	
	public void CheckAndAdd(List<Integer> ticket) 
	{
		List<List<Integer>> tickets;
		List<List<Integer>> tmp;
		
		
	}
}
