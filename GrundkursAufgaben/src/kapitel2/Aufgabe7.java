package kapitel2;

/**
 * @author stefanie.feuerriegel
 * 
 * Aufgabe 7 liest n ganze Zahlen von der Tastatur ein und berechnet deren Mittelwert in while-Schleife
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe7 {

	public static void main(String[] args) throws IOException {
		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));
		int n, i = 1, zahl, summe = 0;
		double mittelwert;

		System.out.print("Anzahl Zahlen: ");
		n = Integer.valueOf(ein.readLine()).intValue();

		while (i <= n) {
			System.out.print(i + ".Zahl: ");
			zahl = Integer.valueOf(ein.readLine()).intValue();
			summe += zahl;
			i++;
		}
		ein.close();

		mittelwert = (double) summe / n;
		System.out.println("Mittelwert: " + mittelwert);
	}

}
