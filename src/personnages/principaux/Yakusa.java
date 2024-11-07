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
		reputation+=1;
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
		result.append("sous, snif...");
		this.parler(result.toString());
		return argentPerdus;
	}
	
	public void direBonjour() {
		StringBuilder result = new StringBuilder();
		result.append("Bonjour ! Je m'appelle ");
		result.append(this.getNom());
		result.append(" et j'aime boire du ");
		result.append(this.getBoisson());
		result.append(" et j'ai ");
		result.append(this.getArgent());
		result.append(" sous en poche.");
		this.parler(result.toString());
	}
}
