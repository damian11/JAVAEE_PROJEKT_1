package main.java.com.dkasztelan.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.dkasztelan.domain.*;

public class KarnetManager {
	
	private List<Karnet> karnety = new ArrayList<Karnet>();
	private int id_karnet = 0;

	public void dodajKarnet(Karnet karnet){
		Karnet nowyKarnet = new Karnet(karnet.getRodzaj(), karnet.getOpis(), karnet.getCena());
	id_karnet++;
	nowyKarnet.setId_karnet(id_karnet);
	karnety.add(nowyKarnet);
}

public List<Karnet> pobierzKarnety() {
	return karnety;
}

}
