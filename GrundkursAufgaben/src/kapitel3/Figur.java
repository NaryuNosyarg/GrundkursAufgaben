package kapitel3;

public abstract class Figur {
	int x,y;
	
	Figur(int x, int y){
		this.x = x;
		this.y = y;
	}

	abstract void zeichne();
	abstract double getFlaeche();
	
}
