package main.java.com.example.silownia_jdbc.domain;


public class Karnet {
	private int id_karnet;
	private String rodzaj = "brak";
	private String opis = "brak";
	private double cena;
	
	
	public Karnet() {
		super();
		}
	
	
	public Karnet(String rodzaj, String opis, double cena) {
		super();
		
		this.rodzaj = rodzaj;
		this.opis = opis;
		this.cena = cena;
		
	}
	
	}
