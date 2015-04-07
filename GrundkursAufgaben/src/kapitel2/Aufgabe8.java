package kapitel2;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         Aufgabe 8 gibt eine bestimmte Anzahl von Sternchen in Form eines
 *         Dreiecks auf dem Bildschirm aus
 *
 */
public class Aufgabe8 {
	public static void main(String[] args) {
		int zeile, spalte;

		for (zeile = 1; zeile <= 10; zeile++) {
			for (spalte = 1; spalte <= zeile; spalte++)
				System.out.print('*');
			System.out.println();
		}

	}
}
