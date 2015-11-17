package main.java.com.dkasztelan.domain;


public class SprzedazKarnetu {

	private int id_sprzedazKarnetu;
	private int id_klient;
	private int id_karnet;
	
	
	public SprzedazKarnetu(int id_klient, int id_karnet){
	
	}

	public SprzedazKarnetu() {
			}

	public int getId_sprzedazKarnetu() {
		return id_sprzedazKarnetu;
	}
	
	public void setId_sprzedazKarnetu(int id_sprzedazKarnetu) {
		this.id_sprzedazKarnetu = id_sprzedazKarnetu;
	}

	public  int getId_klient(){
		return id_klient;
	}
	
	public void setId_klient(int id_klient){
		this.id_klient = id_klient;
		
	}
	
	public  int getId_karnet(){
		return id_karnet;
	}
	
	public void setId_karnet(int id_karnet){
		this.id_karnet = id_karnet;
	}
	
	}
