package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	
	}
	
	public void donner(int n, Commercant C) {
		C.gagnerArgent(n);
		this.perdreArgent(n);
	}
	
	public void provoquer(Yakusa y) {
		int reputationY = y.getReputation();
		if (honneur * 2 > reputationY) {
			int argentY = y.getArgent();
			this.gagnerArgent(argentY);
			this.honneur += 1;
			y.perdreDuel();
		} else {
			this.honneur -= 1;
			y.gagnerDuel();
		}
	}
}
