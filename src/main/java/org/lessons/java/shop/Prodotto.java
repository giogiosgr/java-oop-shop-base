package org.lessons.java.shop;

class Prodotto {
    
	//dichiarazione proprietà della classe
	int code; 
	String name;
	String description;
	double price;
	double tax;
	
	//costruttore
	Prodotto(String name, String description, double price, double tax) {
		//inizializzazione della proprietà codice prodotto, un numero random tra 100 e 999
		this.code = 100 + (int)(Math.random() * 900);
		//inizializzazione delle altre proprietà
		this.name = name;
		this.description = description;
		this.price = price;
		this.tax = tax;
	}
	
	//metodo che restituisce il prezzo
	double getPrice() {
		return price;
	}
	
	//metodo che restituisce il prezzo comprensivo di iva, arrotondato a due cifre decimali
	double getFullPrice () {
		price += price * (tax / 100);
		return Math.floor(price * 100) / 100;
	}
	
	//metodo che restituisce la concatenazione codice-nome
	String getFullName () {
		return code + "-" + name;
	}
}