package fil_rouge;

public class InArc extends Arc{
	
	public InArc(Place place, Integer poids) {
		super(place, poids);
	}

	public InArc(Place place, Transition transition, int poids) {
		this(place, poids);
		transition.addInArcNormal(this);
	}
	
	public void step() {
		this.place.remJetons(this.getPoids());
	}
	
	public boolean isTrig() {
		return this.getPoids() <= this.place.getJetons();
	}
}
