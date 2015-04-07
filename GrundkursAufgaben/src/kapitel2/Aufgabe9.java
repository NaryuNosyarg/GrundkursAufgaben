package kapitel2;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         Aufgabe 9 schreibt den Buchwert mit einem Abschreibungssatz und einem
 *         Restwert geometrisch degressiv ab
 *
 */
public class Aufgabe9 {

	public static void main(String[] args) {
		double buchwert = 15000;
		double satz = 40;
		double restwert = 100;
		int jahr = 1;

		while (buchwert > restwert) {
			buchwert *= 1. - satz / 100;
			System.out
					.println("Buchwert nach " + jahr + " Jahren: " + buchwert);
			jahr++;
		}
	}

}
