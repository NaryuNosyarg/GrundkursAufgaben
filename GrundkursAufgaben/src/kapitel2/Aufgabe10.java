package kapitel2;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         Aufgabe 10 gibt eine ganze Zahl vom Typ int in Binärdarstellung (32
 *         Bit) aus
 *
 */
public class Aufgabe10 {

	public static void main(String[] args) {
		int zahl = 4711;
		for (int i = 31; i >= 0; i--) {
			if ((zahl & (1 << i)) != 0) {
				System.out.print('1');
			} else {
				System.out.print('0');
			}
			if (i % 8 == 0) {
				System.out.print(' ');
			}
		}
	}
}
