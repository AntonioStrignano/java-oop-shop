package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("Nome prodotto: ");
	String nomeProd = input.nextLine();
	System.out.println("Descrizione prodotto: ");
	String descProd = input.nextLine();
	System.out.println("Prezzo prodotto: ");
	float prezzoProd = Float.parseFloat(input.nextLine());
	
	Prodotto userProd = new Prodotto(nomeProd, descProd, prezzoProd);
	
	System.out.println("Stai inserendo il prodotto:");
	System.out.println("Nome prodotto: " + userProd.getNome());
	System.out.println("Codice magazzino: " + userProd.getCodice());
	System.out.println("Codice esteso: " + userProd.codiceEsteso());
	System.out.println("Descrizione: " + userProd.getDescrizione());
	userProd.prezzatrice();
	
	
}
}
