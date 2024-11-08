package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;
import personnages.secondaires.GrandMere;
import personnages.secondaires.Traitre;

public class MonHistoire {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
		Yakusa yakusa = new Yakusa("Yaku le noir", 42, "biere", "WarSong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);
		Ronin ronin = new Ronin("Roro", 61, "sake");
		ronin.donner(10, commercant );
		ronin.provoquer(yakusa);
		ronin.direBonjour();
		
		Samourai samourai = new Samourai("Samu", 30, "vodka", "Sensei");
		samourai.direBonjour();
		samourai.boire();
		samourai.boire("sake");
		
		Traitre traitre = new Traitre("John", 50, "potion", "Samu");
		traitre.direBonjour();
		traitre.extorquer(commercant);
		traitre.direBonjour();
		traitre.boire();
		traitre.faireLeGentil(ronin, 10);
		traitre.direBonjour();
		
		GrandMere grandMere = new GrandMere("Sonya", 20);
		grandMere.direBonjour();
		grandMere.boire();
		grandMere.faireConnaissanceAvec(samourai);
		grandMere.faireConnaissanceAvec(ronin);
		grandMere.faireConnaissanceAvec(yakusa);
		grandMere.faireConnaissanceAvec(traitre);
		
		grandMere.ragoter();

	}

}
