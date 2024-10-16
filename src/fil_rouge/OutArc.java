package fil_rouge;

public class OutArc extends Arc{
	
	public OutArc(Place place, int poids) {
		super(place, poids);
	}

	public void step() {
		this.place.addJetons(this.getPoids());
	}
}
