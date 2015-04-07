package kapitel3;

public class SubKonto extends Konto{
	
	public SubKonto(int kontonummer) {
		super(kontonummer);
	}

	public SubKonto(int kontonummer, double saldo) {
		super(kontonummer, saldo);
	}

	@Override
	void zahleAus(double betrag) {
		if(betrag <= saldo)
		saldo -= betrag;
	}
	
	void schreibeZinsenGut(double zinsen){
		saldo *= 1. + zinsen / 100;
	}
}