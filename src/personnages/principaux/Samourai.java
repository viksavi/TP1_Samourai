package personnages.principaux;

public class Samourai extends Ronin {
	
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
}
