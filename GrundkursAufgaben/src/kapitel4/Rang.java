package kapitel4;

public class Rang {
	private int persNummer;
	private int rang;

	public Rang(int nr, int r) throws Rangausnahme {
		persNummer = nr;
		rang = r;
		if (rang < 1 || rang > 3)
			throw new Rangausnahme(rang);
	}

	public void zeige() {
		System.out.println("Personalnummer " + persNummer + ", Rang: " + rang);
	}
}
