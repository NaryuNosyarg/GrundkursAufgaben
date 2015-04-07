package kapitel4;

public class Aufgabe5 {
	
	public static void main(String[] args) {
		int zufallszahl;

		for (int i = 0; i < 500; i++) {
			try {
				zufallszahl = (int) (Math.random() * 100);
				if (zufallszahl == 0)
					throw new IstNull();
				System.out.println(zufallszahl);
			} catch (IstNull e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
