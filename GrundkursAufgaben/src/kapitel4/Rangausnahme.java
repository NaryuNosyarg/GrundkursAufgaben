package kapitel4;

public class Rangausnahme extends Exception{

	public Rangausnahme(){
		
	}
	
	public Rangausnahme(int rang){
		super("Falscher Rang: " + rang);
	}
}
