package deneme;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		 //char karakter = 'B';

        ////Karakterin sayısal değerini yazdırma
        //int sayisal = (int)karakter;//char türündeki karakter isimli değişkenimin içindeki int(sayısal) veriyi ayır

        //Console.WriteLine("Sayısal değeri = " + sayisal);
        ////A - Z     65-90 arasında değer alır
        ////a - z     97-122 arasında değer alır
		
		// Konsoldan alınan karakter büyük mü küçük mü?
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a keywords:");
		char number = scan.next().charAt(0);
		int inumber=(int)number;
		if (inumber>=97 && inumber<=122) {
			
			System.out.println("it was Small");
		} else if(inumber>=65 && inumber<=90){
			System.out.println("Big");
		}
		else 
		{
			System.out.println("Not a Keyword");
		}
		
	}

}
