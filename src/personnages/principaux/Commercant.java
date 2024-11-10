package personnages.principaux;

import Boundaries.IPleutre;
import personnages.Humain;

public class Commercant extends Humain implements IPleutre{

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");

	}
	
	public int seFaireExtorquer() {
		this.parler("J’ai tout perdu! Le monde est trop injuste...");
		int argentVole = this.getArgent();
		this.perdreArgent(argentVole);
		return argentVole;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler("Je te remercie généreux donateur!");
	}

	@Override
	public void fuir() {
		this.parler(this.getNom() + "a peur et s'enfuit !");
	}
}
