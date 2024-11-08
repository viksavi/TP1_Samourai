package personnages.secondaires;

import personnages.principaux.Commercant;
import personnages.principaux.Yakusa;
import java.util.Random;

public class Ninja extends Yakusa{
	
	private String clanSecretString;
	private ClanNinja clanSecretObject;
	private Commercant memoire;
	private static final int SEUILARGENT = 3;
	private static final String[] CLANSNINJA = ClanNinja.getClans();

	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		Random r = new Random();
		this.clanSecretString = switch(r.nextInt(CLANSNINJA.length)) {
			case 0 -> CLANSNINJA[0];
			case 1 -> CLANSNINJA[1];
			case 2 -> CLANSNINJA[2];
			case 3 -> CLANSNINJA[3];
			case 4 -> CLANSNINJA[4];
			default -> null;
		};
		clanSecretObject = new ClanNinja(clanSecretString);
	}
	
	@Override 
	public void direBonjour() {
		super.direBonjour();
		StringBuilder texte = new StringBuilder();
		texte.append("(mon clan secret est ");
		texte.append(this.getClan());
		texte.append(" ");
		texte.append(this.clanSecretObject.getClan());
		texte.append(" et maintenant que tu le sais, je vais devoir te tuer)");
		this.parler(texte.toString());
	}
	
	private int extorquerMefiant(Commercant c) {
		return c.seFaireExtorquer();
	}
	
	public void extorquer(Commercant c) {
		this.memoire = c;
		int argentExtorque = this.extorquerMefiant(memoire);
		this.gagnerArgent(argentExtorque);
		StringBuilder result = new StringBuilder();
		result.append("J’ai piqué le fric de ");
		result.append(memoire.getNom());
		this.parler(result.toString());
	}
	
	public void revenirExtorquer() {
		int argentExtorque = this.extorquerMefiant(memoire);
		this.gagnerArgent(argentExtorque);
		while (argentExtorque > 0) {
			argentExtorque = this.extorquerMefiant(memoire);
			this.gagnerArgent(argentExtorque);
			StringBuilder result = new StringBuilder();
			result.append("J’ai revenu extorquer le fric de ");
			result.append(memoire.getNom());
			this.parler(result.toString());
		}
	}
}
