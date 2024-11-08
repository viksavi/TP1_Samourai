package personnages.secondaires;

import personnages.principaux.Yakusa;
import java.util.Random;

public class Ninja extends Yakusa{
	
	private String clanSecret;
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};

	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		Random r = new Random();
		this.clanSecret = switch(r.nextInt(1, 6)) {
			case 1 -> "of Shadows";
			case 2 -> "of Mist";
			case 3 -> "of Clouds";
			case 4 -> "of Fog";
			case 5 -> "of Darkness";
			default -> null;
		};
	}
	
	@Override 
	public void direBonjour() {
		super.direBonjour();
		StringBuilder texte = new StringBuilder();
		texte.append("(mon clan secret est ");
		texte.append(this.getClan());
		texte.append(" ");
		texte.append(this.clanSecret);
		texte.append(" et maintenant que tu le sais, je vais devoir te tuer)");
		this.parler(texte.toString());
	}
}
