package kapitel4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe4 {
	static final int MAX = 5;

	public static void main(String[] args) throws IOException {
		int zahl;
		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));

		for (int i = 0; i < MAX; i++) {
			System.out.print((i + 1) + ". Zahl: ");
			try {
				zahl = Integer.valueOf(ein.readLine()).intValue();
			} catch (NumberFormatException e) {
				System.out.println("Die Eingabe ist keine ganze Zahl");
				System.out.println(e.getMessage());
				e.printStackTrace();
				i--;
			}
		}
		ein.close();
	}
}
