package buton;

import java.util.Scanner;

public class Ders5 {
	
	public static void main (String[] args ) {
		
		System.out.print("Kullan�c� ad� giriniz: ");
		
		Scanner input = new Scanner (System.in);
		
		String a = input.next();
		
		if (a.equals("furkan")) {
			
			System.out.print("Nas�ls�n�z Furkan Bey? ");
			
			Scanner input2 = new Scanner (System.in);
			
			String b = input2.next();
			
			if (b.equals("iyiyim")) {
				
				System.out.print("Sizin ad�n�za sevindim..");
			} else {
				
				System.out.print("�yi olman�z i�in ne yapabilirim? ");
			}
		} else {
			
			System.out.print("Kullan�c� kayd� bulunamad�..");
		}
	}		
}