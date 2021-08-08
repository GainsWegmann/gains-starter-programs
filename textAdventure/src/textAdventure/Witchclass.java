package textAdventure;

public class Witchclass implements Combat {

	public static int Health = 5;
	
	public static String att1() {
		return ("Heat flows through your entire body and irradiates from your hands in a massive fireball.");
	}

	public static String att2() {
		return ("You feel a pulse of energy start in the back of your head and beam through your enemy's eyes.");
	}

	public static String getFireball() {
		return att1();
	}

	public static String getmindPulse() {
		return att2();
	}

	Witchclass adventurerName = new Witchclass();
	public static int getHealth() {
		return Health;
	}
}
