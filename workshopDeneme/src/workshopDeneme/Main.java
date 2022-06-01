package workshopDeneme;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("kac adet bilet alacaksiniz?:");
		int sonuc = girdi.nextInt();
		 List<Integer> numbers= new ArrayList<>();
		 Random random = new Random();
		 
		 for (int i = 0; i < sonuc*6; i++) {
			while(true) 
			{
				int number =random.nextInt(49)+1;
				if(!numbers.contains(number)) 
				{
					numbers.add(number);
					break;
				}
			}
		}
		 for (int i = 0; i < sonuc; i++) {
			 System.out.println(numbers.subList(6*i,6*(i+1)));
		}
		}

	}


