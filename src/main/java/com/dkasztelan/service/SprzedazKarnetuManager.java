package main.java.com.dkasztelan.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.dkasztelan.domain.Klient;
import main.java.com.dkasztelan.domain.Karnet;
import main.java.com.dkasztelan.domain.SprzedazKarnetu;

public class SprzedazKarnetuManager {
	
	private List<SprzedazKarnetu> sprzedazeKarnetu = new ArrayList<SprzedazKarnetu>();
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
	
	public void dodajSprzedazKarnetu(SprzedazKarnetu sprzedazKarnetu) {
	SprzedazKarnetu nowaSprzedazKarnetu = new SprzedazKarnetu(sprzedazKarnetu.getId_klient(), sprzedazKarnetu.getId_karnet() );
	id_sprzedazKarnetu++;
	nowaSprzedazKarnetu.setId_sprzedazKarnetu(id_sprzedazKarnetu);
	sprzedazeKarnetu.add(nowaSprzedazKarnetu);
	}
	
	
	public List<Karnet> pobierzKarnety() {
	return karnety;
}	
	public List<Klient> pobierzKlientow() {
	return klienci;
}

	public List<SprzedazKarnetu> pobierzSprzedazKarnetow() {
	return sprzedazeKarnetu;
}

}
