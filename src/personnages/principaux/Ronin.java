package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	
	}
	
	public void donner(int n, Commercant c) {
		StringBuilder result = new StringBuilder();
		this.perdreArgent(n);
		result.append("Tiens ");
		result.append(c.getNom());
		result.append(" voilà ");
		result.append(n);
		result.append(" sous.");
		this.parler(result.toString());
		c.recevoir(n);
	}
	
	public void provoquer(Yakusa y) {
		int reputationY = y.getReputation();
		if (honneur * 2 > reputationY) {
			int argentY = y.getArgent();
			this.gagnerArgent(argentY);
			this.honneur += 1;
			y.perdreDuel();
			this.parler("Je t’ai eu petit yakusa!");
		} else {
			this.honneur -= 1;
			y.gagnerDuel();
		}
	}
}
