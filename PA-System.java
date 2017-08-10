//
//
// 10.08.17
// coded by furkan-dev
// licensed by gnu-general-license
//
//

import java.util.Scanner;

public class PASystem {
	
	public static void main (String[] args ) {
		
		System.out.print("Kullanýcý adý giriniz: ");
		
		Scanner input = new Scanner (System.in);
		
		String a = input.next();
		
		if (a.equals("x")) {
			
			System.out.print("Nasýlsýnýz x Bey? ");
			
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
