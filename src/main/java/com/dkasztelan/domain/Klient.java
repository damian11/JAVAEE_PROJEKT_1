package main.java.com.dkasztelan.domain;

public class Klient {

	private int id_klient;
	private String imie;
	private String nazwisko;
	private int telefon;
	public Klient() {}
	
	public Kleint (String imie, String nazwisko, int telefon)
	{
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.numer = numer;
	}
	
	
	public int getId_klient() {
		return id_klient;
	}
	public void setId_klient(int id_klient) {
		this.id_klient= id_klient;
	}
	