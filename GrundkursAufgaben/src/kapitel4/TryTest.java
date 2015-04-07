package kapitel4;

public class TryTest {
	public static void main(String[] args) {
		int persNummer = 100456;
		int rang = 1;
		Rang r = null;

		try {
			r = new Rang(persNummer, rang);
			System.out.println("Alles OK");
		} catch (Rangausnahme e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			try {
				r = new Rang(persNummer, 3);
			} catch (Rangausnahme a) {
			}
		}
		r.zeige();
	}
}
