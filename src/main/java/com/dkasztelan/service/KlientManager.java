package main.java.com.dkasztelan.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.dkasztelan.domain.Klient;

public class KlientManager {
	
	private List<Klient> klienci = new ArrayList<Klient>();
	private int id_klient = 0;

	public void dodajKlienta(Klient klient){
		Klient nowyKlient = new Klient(klient.getImie(), klient.getNazwisko(), klient.getTelefon());
	id_klient++;
	nowyKlient.setId_klient(id_klient);
	klienci.add(nowyKlient);
}
	
	
	
}
