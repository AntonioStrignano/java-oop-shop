/*
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori,
i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in
modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random 
- il codice prodotto sia accessibile solo in lettura 
- gli altri attributi siano accessibili sia in lettura che in scrittura 
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
- il prodotto esponga un metodo per 
avere il nome esteso, ottenuto concatenando codice-nome Nello stesso package 
aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità 
della classe Prodotto.
BONUS: create un metodo (statico) che restituisca il codice con un pad left 
di 0 per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 
123445567 resta come è)
Buon lavoro!
*/

package org.lessons.java.shop;

import java.text.NumberFormat;

public class Prodotto {
	private final String codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private static final double IVA = 1.22;
	
	public Prodotto (String nome, String descrizione, float prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		codice = randomCodeGen();
	}
	
	
	//		RANDOM CODE GEN
	private static String randomCodeGen()
	{
		int rdmCode = (int) ((((99999999 - 1) + 1) * Math.random()) + 1);
		String code = String.valueOf(rdmCode);
		while (code.length() == 8) {
			code = "0" + code;
		}
		return code;
	}
	
	public void prezzatrice() {
		double prezzoListino = prezzo/IVA;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String prezzoListinoString = currency.format(prezzoListino);
		System.out.println("Il prezzo del prodotto é: " + prezzo + "(" + prezzoListinoString + 
				", di cui IVA " + (prezzo - prezzoListino));
	}
	
	//		GETTER E SETTER
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public double getIva() {
		return IVA;
	}
	public int getCodice() {
		return codice;
	}
	//		/GETTER E SETTER
	
	
}
