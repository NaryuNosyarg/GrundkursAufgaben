package kapitel3;

public class AbschreibungTest {

	public static void main(String[] args){
		Abschreibung abschreibung1 = new Abschreibung(5000, 7);
		abschreibung1.lineareAbschreibung();
		Abschreibung abschreibung2 = new Abschreibung(12000, 50, 11);
		abschreibung2.geometrischDegressiveAbschreibung();
		Abschreibung abschreibung3 = new Abschreibung(15000, 40, 10);
		abschreibung3.geometrischDegressiveAbschreibung();
		
		SubKonto konto = new SubKonto(4, 100, 5);
		konto.schreibeZinsengut(5);
		System.out.println(konto.getSaldo());
	}
}
