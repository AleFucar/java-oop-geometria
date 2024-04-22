package org.lessons.java.geometria;

public class rettangolo {

	int base;
	int altezza;
	
	void calcolaArea() {
		int area = base * altezza;
		System.out.println("L'area del tuo rettangolo è di: " + area);
	}
	
	void calcolaPerimetro() {
		int perimetro = (2 * base) + (2 * altezza);
		System.out.println("Il perimetro del tuo rettangolo è di: " + perimetro);
	}
}
