package fil_rouge;

public class Arc {
	protected Place place;
	protected Integer poids;
	
	public Arc(Place place, Integer poids) {
		this.place = place;
		this.poids = poids;
	}
	
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public int getPoids() {
		return this.poids;
	}
	
}
