package kapitel3;

public class Beleg {
	private int belegnummer;
	private static int next = 10000;

	public Beleg() {

		belegnummer = next++;
	}

	public int getBelegnummer() {
		return belegnummer;
	}
}
