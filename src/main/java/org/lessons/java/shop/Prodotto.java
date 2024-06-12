package org.lessons.java.shop;

public class Prodotto {
    
	//dichiarazione proprietà della classe
	int code; 
	String name;
	String description;
	double price;
	double tax;
	
	//costruttore
	public Prodotto(String name, String description, double price, double tax) {
		//inizializzazione della proprietà codice prodotto, un numero random tra 100 e 999
		this.code = 100 + (int)(Math.random() * 900);
		//inizializzazione delle altre proprietà
		this.name = name;
		this.description = description;
		this.price = price;
		this.tax = tax;
	}
	
	//metodo che restituisce il prezzo
	public double getPrice() {
		return price;
	}
	
	//metodo che restituisce il prezzo comprensivo di iva, arrotondato a due cifre decimali
	public double getFullPrice () {
		price += price * (tax / 100);
		return Math.floor(price * 100) / 100;
	}
	
	//metodo che restituisce la concatenazione codice-nome
	public String getFullName () {
		return code + "-" + name;
	}
}