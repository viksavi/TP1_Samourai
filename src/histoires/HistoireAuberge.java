package histoires;

import Boundaries.Auberge;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;
import personnages.secondaires.Colporteur;
import personnages.secondaires.GrandMere;
import personnages.secondaires.Ninja;
import personnages.secondaires.Traitre;

public class HistoireAuberge {

	public static void main(String[] args) {
		Commercant commercant = new Commercant("Marchand", 35);
		Yakusa yakusa = new Yakusa("Yaku le noir", 42, "biere", "WarSong");
		Ronin ronin = new Ronin("Roro", 61, "sake");
		Samourai samourai = new Samourai("Samu", 30, "vodka", "Sensei");
		Traitre traitre = new Traitre("John", 50, "potion", "Samu");
		GrandMere grandMere = new GrandMere("Sonya", 20);
		Ninja ninja = new Ninja("Colibri", 0, "cyanure", "Long Fangs");
		Colporteur colporteur = new Colporteur("Leo", 45);
		
		
		Auberge auberge = new Auberge("Magique", 30);
		auberge.nouvelArrivant(yakusa);
		auberge.nouvelArrivant(traitre);
		auberge.nouvelArrivant(samourai);
		auberge.nouvelArrivant(colporteur);
		auberge.nouvelArrivant(ninja);
		auberge.nouvelArrivant(grandMere);
		auberge.nouvelArrivant(ronin);
		auberge.nouvelArrivant(commercant);
		auberge.fight();
		auberge.payerLaTournee(ninja);

	}

}
