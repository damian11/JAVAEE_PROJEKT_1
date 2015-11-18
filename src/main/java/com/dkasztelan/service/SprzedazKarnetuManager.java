package main.java.com.dkasztelan.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.dkasztelan.domain.Klient;
import main.java.com.dkasztelan.domain.Karnet;

public class SprzedazKarnetuManager {
	
	private List<SprzedazKarnetu> sprzedazKarnetu = new ArrayList<SprzedazKarnetu>();
	private List<Klient> klienci = new ArrayList<Klient>();
	private List<Karnet> karnety = new ArrayList<Karnet>();

	private int id_sprzedazKarnetu = 0;
	private int id_klient = 0;
	private int id_karnet = 0;
	

	public void dodajKlienta(Klient klient){
	Klient nowyKlient = new Klient(klient.getImie(), klient.getNazwisko(), klient.getTelefon());
	id_klient++;
	nowyKlient.setId_klient(id_klient);
	klienci.add(nowyKlient);
	}
	
	public void dodajKarnet(Karnet karnet){
	Karnet nowyKarnet = new Karnet(karnet.getRodzaj(), karnet.getOpis(), karnet.getCena());
	id_karnet++;
	nowyKarnet.setId_karnet(id_karnet);
	karnety.add(nowyKarnet);
	}
	
}
