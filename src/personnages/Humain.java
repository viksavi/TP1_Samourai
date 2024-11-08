package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain (String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		StringBuilder texte_affichage = new StringBuilder();
		texte_affichage.append("(");
		texte_affichage.append(this.nom);
		texte_affichage.append(") - ");
		texte_affichage.append(texte);
		System.out.println(texte_affichage.toString());
	}
	
	public void direBonjour() {
		StringBuilder result = new StringBuilder();
		result.append("Bonjour ! Je m'appelle ");
		result.append(this.nom);
		result.append(" et j'aime boire du ");
		result.append(this.boisson);
		result.append(" et j'ai ");
		result.append(this.getArgent());
		result.append(" sous en poche.");
		this.parler(result.toString());
	}
	
	public void boire() {
		StringBuilder result = new StringBuilder();
		result.append("Mmm, un bon verre de ");
		result.append(this.boisson);
		result.append("! GLOUPS !");
		this.parler(result.toString());
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public String getBoisson() {
		return this.boisson;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void gagnerArgent(int n) {
		this.argent += n;
	}
	
	public void perdreArgent(int n) {
		this.argent -= n;
	}
}
