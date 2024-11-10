package Boundaries;

import java.util.ArrayList;
import java.util.List;

import personnages.Humain;

public class Auberge {
	private static Humain[] clients;
	private String nom;
	private List<IGuerrier> guerriers = new ArrayList<>();
	private List<IPleutre> pleutres = new ArrayList<>();
	
	public Auberge(String nom, int capacite) {
		this.nom = nom;
		clients = new Humain[capacite];
		for (int i = 0; i < clients.length; i++) {
		    clients[i] = null;
		}
	}
	
	public void nouvelArrivant(Humain h) {
		for(int i = 0; i < clients.length; i++) {
			if(clients[i] == null) {
				h.direBonjour();
				for(Humain humainAssis : clients) {
					if(humainAssis != null)
						humainAssis.direBonjour();
				}
				clients[i] = h;
				if(h instanceof IGuerrier guerrier) {
					guerriers.add(guerrier);
				} 
				else if(h instanceof IPleutre pleutre) {
					pleutres.add(pleutre);
				}
				break;
			}
		}
	}
	
	public void payerLaTournee(Humain h) {
		h.perdreArgent(clients.length);
		for(Humain humain : clients) {
			if(humain != null) {
				humain.boire();
			}
		}
	}
	
	public void fight() {
		 for (IGuerrier guerrier : guerriers) {
		        for (IPleutre pleutre : pleutres) {
		            if (guerrier != pleutre) {
		                guerrier.combattre((Humain)pleutre);
		            }
		        }
		    }
	}
}
