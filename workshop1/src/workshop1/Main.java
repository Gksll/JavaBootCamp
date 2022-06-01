package workshop1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kac adet bilet alacaksiniz?");
		int ticketNumber=scan.nextInt();
		List<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i < ticketNumber*6; i++) {
			while(true) 
			{
				int number = random.nextInt(49)+1;
				if(!numbers.contains(number)) {
					numbers.add(number);
					break;
				}
				
			}
		}
		for (int i = 0; i < ticketNumber; i++) {
			System.out.println(numbers.subList(6*i, 6*(i+1)));
		}
	}

}
