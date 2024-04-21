package it.main;

import java.util.Scanner;

import it.rettangolo.rettangolo;


public class calcolaAreaePerimetro {
	
  public static void calcolaArea() {
	
	rettangolo rettangolo1 = new rettangolo();	
	
	Scanner scan =  new Scanner(System.in);
	
	System.out.println("Quanto è lunga la base?");
	rettangolo1.base = scan.nextInt();
	
	System.out.println("Quanto è lunga l'altezza?");
	rettangolo1.altezza = scan.nextInt();
	
	rettangolo1.area = rettangolo1.base * rettangolo1.altezza;
	
	
	System.out.println("L'area del tuo rettangolo è " + rettangolo1.area);
	
	
  }
  
  public static void calcolaPerimetro() {
	  
	  	
	  	Scanner scan =  new Scanner(System.in);
	
	  	rettangolo rettangoloPerimetro = new rettangolo();
	  	
	  	rettangoloPerimetro.base = rettangolo1.base;
		
		System.out.println("L'area del tuo rettangolo è " + rettangolo1.area + 1);
}
}