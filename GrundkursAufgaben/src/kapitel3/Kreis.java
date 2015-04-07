package kapitel3;

public class Kreis extends Figur{
	int radius;

	Kreis(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	void zeichne() {
		System.out.println("Rechteck mit Bezugspunkt: (" + x + "," + y
				+ "), Radius: " + radius);
	}

	@Override
	double getFlaeche() {
		return radius * radius * 3.14159;
	}
	

}
