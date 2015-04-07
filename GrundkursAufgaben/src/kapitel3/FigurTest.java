package kapitel3;

public class FigurTest {
	public static void main(String[] args) {
		Figur[] f = new Figur[4];
		f[0] = new Kreis(10, 10, 5);
		f[1] = new Rechteck(0, 0, 20, 6);
		f[2] = new Kreis(100, 50, 12);
		f[3] = new RechtwinkligesDreieck(3, 7, 4, 5);

		for (int i = 0; i < 4; i++) {
			f[i].zeichne();
			System.out.println("Flaeche: " + f[i].getFlaeche());
		}
	}

}
