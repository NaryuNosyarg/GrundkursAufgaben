package kapitel4;

public class Aufgabe3 {
	static final int DEFAULTWERT = 1;

	public static void main(String[] args) {
		int a, b = 5, c = 0;

		try {
			a = b / c;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			a = DEFAULTWERT;
		}
		System.out.println("a: " + a);
	}
}
