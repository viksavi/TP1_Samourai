package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant{

	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
	@Override
	public int seFaireExtorquer() {
		this.parler("Haha! J'ai sauvé mon argent");
		int argentVole = this.getArgent() / 2;
		this.perdreArgent(argentVole);
		return argentVole;
	}
}
