package org.lessons.java.geometria;

import java.util.Iterator;

public class rettangolo {

	int base;
	int altezza;
	
	void calcolaArea() {
		int area = base * altezza;
		System.out.println("L'area del tuo rettangolo è di: " + area);
	}
	
	void calcolaPerimetro() {
		int perimetro = 2 * (base + altezza);
		System.out.println("Il perimetro del tuo rettangolo è di: " + perimetro);
	}
	
	void stampaRettangolo() {

	      for(int i = 0; i < base; i++) 
	    	  System.out.print("O");
	      		System.out.println();

	      for(int i = 0; i < altezza-2; i++) {
	         System.out.print("O");
	         for(int x = 0; x < base-2; x++) 
	         System.out.print(" ");
	         System.out.print("O");
	         System.out.println();
	      }
	      
	      for(int i = 0; i < base; i++) System.out.print("O");

	   }
}
