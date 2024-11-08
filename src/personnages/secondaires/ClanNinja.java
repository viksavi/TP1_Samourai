package personnages.secondaires;

public class ClanNinja {
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private String clan;
	
	public ClanNinja(String clan) {
		this.clan = clan;
	}
	
	public static String[] getClans() {
		return clansNinja;
	}
	
	public String getClan() {
		return clan;
	}
}
