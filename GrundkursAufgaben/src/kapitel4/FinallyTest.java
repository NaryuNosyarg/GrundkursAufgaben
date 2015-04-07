package kapitel4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyTest {

	public static void durchlaufe() throws IOException, Exception {
		int zahl;
		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));
		Rang r;

		while (true) {
			System.out.print("Bitte Zahl eingeben: ");
			zahl = Integer.valueOf(ein.readLine()).intValue();

			try {
				if (zahl == 1)
					throw new Rangausnahme(0);
				if (zahl == 2)
					throw new Exception();
				if (zahl == 3)
					break;
			} catch (Rangausnahme e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("finally durchlaufen");
			}
		}
		System.out.println("Ende der Schleife");
		ein.close();
	}

	public static void main(String[] args) throws IOException, Exception {
		durchlaufe();
	}
}
