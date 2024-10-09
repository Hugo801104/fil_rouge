package fil_rouge;

public class InArc extends Arc{
	
	public InArc(Place place, Integer poids) {
		super(place, poids);
	}

	public void step() {
		this.place.remJetons(this.getPoids());
	}
	
	public boolean isTrig() {
		return this.getPoids() <= this.place.getJetons();
	}
}
