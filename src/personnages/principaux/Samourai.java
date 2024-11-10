package personnages.principaux;

import Boundaries.IGuerrier;
import personnages.Humain;

public class Samourai extends Ronin implements IGuerrier{
	
	private String seigneur;
	
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	public void boire(String boisson) {
		StringBuilder result = new StringBuilder();
		result.append("Mmm, un bon verre de ");
		result.append(boisson);
		result.append("! GLOUPS !");
		this.parler(result.toString());
	}

	@Override
	public void combattre(Humain h) {
		StringBuilder texte = new StringBuilder();
		texte.append(this.getNom());
		texte.append(" attaque ");
		texte.append(h.getNom());
		texte.append("!");
		this.parler(texte.toString());
		
	}

}
