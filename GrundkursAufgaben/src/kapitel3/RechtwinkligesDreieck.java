package kapitel3;

public class RechtwinkligesDreieck extends Figur{
	int a, b;

	RechtwinkligesDreieck(int x, int y, int a, int b) {
		super(x, y);
		this.a = a;
		this.b = b;
	}

	@Override
	void zeichne() {
		System.out.println("Rechteck mit Bezugspunkt: (" + x + "," + y
				+ "), Seite a: " + a + ", Seite b: " + b);		
	}

	@Override
	double getFlaeche() {
		return (a * b) / 2;
	}

}
