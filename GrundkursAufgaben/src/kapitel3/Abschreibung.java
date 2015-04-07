package kapitel3;

public class Abschreibung {
	double anschaffungspreis;
	double abschreibungssatz;
	int nutzungsjahre;

	public Abschreibung(double preis, int jahre) {
		this.anschaffungspreis = preis;
		this.nutzungsjahre = jahre;
	}

	public Abschreibung(double preis, double satz, int jahre) {
		this.anschaffungspreis = preis;
		this.abschreibungssatz = satz;
		this.nutzungsjahre = jahre;
	}

	public void lineareAbschreibung() {
		double x;
		x = anschaffungspreis / nutzungsjahre;
		System.out.println("linear");
		for(int i = 1; i <= nutzungsjahre; i++){
			anschaffungspreis -= x;
			System.out.println(i + "\t" + anschaffungspreis);
		}

	}

	public void geometrischDegressiveAbschreibung() {
		System.out.println("degressiv");
		for (int i = 1; i <= nutzungsjahre; i++) {
			anschaffungspreis *= 1. - abschreibungssatz / 100;
			System.out.println("Buchwert nach " + i + " Jahren: "
					+ anschaffungspreis);
		}
	}

}
