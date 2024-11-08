package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai {
	
	private int traitrise = 0;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
	}

	public void extorquer(Commercant c) {
		if (this.traitrise < 3) {
			this.gagnerArgent(c.seFaireExtorquer());
			traitrise += 1;
			StringBuilder texte = new StringBuilder();
			texte.append("J'ai piqué le fric de ");
			texte.append(c.getNom());
			this.parler(texte.toString());
		} else {
			this.parler("Je ne peux plus extorquer des gens");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		StringBuilder result = new StringBuilder();
		result.append("Mon niveau de traitise est ");
		result.append(this.traitrise);
		result.append(".");
		this.parler(result.toString());
	}
	
	public void faireLeGentil(Humain h, int argent) {
		StringBuilder texte = new StringBuilder();
		h.gagnerArgent(argent);
		this.perdreArgent(argent);
		this.traitrise -= argent / 10;
		texte.append("Tiens ");
		texte.append(h.getNom());
		texte.append(" voilà ");
		texte.append(argent);
		texte.append(" sous.");
		this.parler(texte.toString());
	}
}
