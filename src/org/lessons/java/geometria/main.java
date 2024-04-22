package org.lessons.java.geometria;

import java.util.Scanner;

public class main {

	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
				
		rettangolo rettangolo1 = new rettangolo();

		System.out.println("Inserisci la base del rettangolo");
		rettangolo1.base = scan.nextInt();
		
		System.out.println("Inserisci l'altezza del rettangolo");
		rettangolo1.altezza = scan.nextInt();
		
		rettangolo1.calcolaArea();
		
		rettangolo1.calcolaPerimetro();
		
		rettangolo1.stampaRettangolo();
	}
}
