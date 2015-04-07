package kapitel3;

public class Rechteck extends Figur {
	int breite, hoehe;

	Rechteck(int x, int y, int breite, int hoehe) {
		super(x, y);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	void zeichne() {
		System.out.println("Rechteck mit Bezugspunkt: (" + x + "," + y + "), Breite: " + breite + ", Hoehe: " + hoehe);
	}

	@Override
	double getFlaeche() {
		return breite * hoehe;
	}

	
	
}
