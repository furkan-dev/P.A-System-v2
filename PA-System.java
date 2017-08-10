package buton;

import java.util.Scanner;

public class Ders5 {
	
	public static void main (String[] args ) {
		
		System.out.print("Kullanýcý adý giriniz: ");
		
		Scanner input = new Scanner (System.in);
		
		String a = input.next();
		
		if (a.equals("furkan")) {
			
			System.out.print("Nasýlsýnýz Furkan Bey? ");
			
			Scanner input2 = new Scanner (System.in);
			
			String b = input2.next();
			
			if (b.equals("iyiyim")) {
				
				System.out.print("Sizin adýnýza sevindim..");
			} else {
				
				System.out.print("Ýyi olmanýz için ne yapabilirim? ");
			}
		} else {
			
			System.out.print("Kullanýcý kaydý bulunamadý..");
		}
	}		
}