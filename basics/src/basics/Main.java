package basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 6 = 1,2,3
		PerfectNumber();
	}

	private static void PerfectNumber() {
		Scanner girdi = new Scanner(System.in);
		System.out.print("bir sayi giriniz:");
		int sonuc = girdi.nextInt();
		int p =0;
		int toplam=0;
		int [] bolenler= new int[sonuc];
		
		for(int i =1; i<sonuc;i++) {
			if(sonuc%i==0) {
				bolenler[p]=i;
				p++;
			}
		}
		for(int i=0; i<bolenler.length;i++) {
		toplam+=bolenler[i];
		}
		if(sonuc==toplam) {
			System.out.print("mukemmel");
		}
		else
		{
			System.out.print("degil");
		}
	}}


