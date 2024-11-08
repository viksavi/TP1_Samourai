package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain {
	
	private String clan;
	private int reputation;

	public Yakusa(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commercant c) {
		gagnerArgent(c.seFaireExtorquer());
		reputation += 1;
		StringBuilder result = new StringBuilder();
		result.append("J’ai piqué le fric de ");
		result.append(c.getNom());
		this.parler(result.toString());
	}
	
	public void gagnerDuel() {
		reputation += 1;
		this.parler("J'ai gagné mon duel!");
	}
	
	public int perdreDuel() {
		int argentPerdus = this.getArgent();
		this.perdreArgent(argentPerdus);
		reputation -= 1;
		StringBuilder result = new StringBuilder();
		result.append("J’ai perdu mon duel et mes ");
		result.append(argentPerdus);
		result.append(" sous, snif...");
		this.parler(result.toString());
		return argentPerdus;
	}
	
	public void direBonjour() {
		super.direBonjour();
		StringBuilder resultNouveau = new StringBuilder();
		resultNouveau.append("Mon clan est celui de ");
		resultNouveau.append(this.clan);
		resultNouveau.append(".");
		this.parler(resultNouveau.toString());
	}
}
