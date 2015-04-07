package kapitel3;

public class Konto {
	int kontonummer;
	double saldo;

	public Konto(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public Konto(int kontonummer, double saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void zahleEin(double betrag) {
		saldo += betrag;
	}

	void zahleAus(double betrag) {
		saldo -= betrag;
	}

}
