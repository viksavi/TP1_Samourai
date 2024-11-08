package personnages.secondaires;

import personnages.Humain;

public class GrandMere extends Humain{
	
	private Humain [] memoire = new Humain [30]; 
	private int nbConnaissances = 0;
	java.util.Random r = new java.util.Random();
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "tisane");
		
	}
	
	private String HumainHasard() {
		return switch (r.nextInt(1, 5)) {
			case 1 -> "Ronin";
			case 2 -> "Samourai";
			case 3 -> "Yakusa";
			case 4 -> "Commercant";
			default -> null;
		};
		
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		memoire[nbConnaissances++] = humain;
	}
	
	public void ragoter() {
		for (int i = 0; i < nbConnaissances; i++) {
			StringBuilder texte = new StringBuilder();
			Humain humain = memoire[i];
			if (humain instanceof Traitre) {
				texte.append("Je sais que ");
				texte.append(humain.getNom());
				texte.append(" est un traître !");
			} else {
				texte.append("Je crois que ");
				texte.append(humain.getNom());
				texte.append(" est un ");
				texte.append(this.HumainHasard());
				texte.append(".");
			}
			this.parler(texte.toString());
		}
	}
	
}
