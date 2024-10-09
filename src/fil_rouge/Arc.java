package fil_rouge;

public abstract class Arc {
	protected Place place;
	protected int poids;
	
	public Arc(Place place, int poids) {
		this.place = place;
		this.poids = poids;
	}
	
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public int getPoids() {
		return this.poids;
	}
	
	public abstract void step();
	
}
