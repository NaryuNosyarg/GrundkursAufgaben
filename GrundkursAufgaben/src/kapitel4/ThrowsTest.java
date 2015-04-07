package kapitel4;

public class ThrowsTest {

	public static void main(String[] args) throws Rangausnahme{
		int persNummer = 100456;
		int rang = 4;
		Rang r;
		
		r = new Rang(persNummer, rang);
		r.zeige();
	}
}
