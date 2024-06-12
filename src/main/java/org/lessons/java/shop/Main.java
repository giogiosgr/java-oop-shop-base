package org.lessons.java.shop;



public class Main {

	public static void main(String[] args) {
		
      //creazione di un nuovo oggetto di classe Prodotto
	  Prodotto prodotto1 = new Prodotto("Prodottone", "bel prodotto", 30.55, 20);
	
	  //stampa del prezzo del prodotto
	  System.out.println(prodotto1.getPrice());
	
	  //stampa del prezzo del prodotto comprensivo di IVA
	  System.out.println(prodotto1.getFullPrice());
	
	  //stampa del nome completo del prodotto in formato codice-nome
	  System.out.println(prodotto1.getFullName());
	
	  //stampa della descrizione del prodotto
	  System.out.println(prodotto1.description);
	  
	  //creazione di una seconda instanza per altre prove
	  Prodotto prodotto2 = new Prodotto("Aggeggio", "non puoi farne a meno", 999.99, 0);
	  
	  System.out.println(prodotto2.getFullPrice());
	  
	}
}
