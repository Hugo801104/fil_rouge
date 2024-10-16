package fil_rouge;

public class OutArc extends Arc{
	
	public OutArc(Place place, int poids) {
		super(place, poids);
	}
	
	public OutArc(Place place, Transition transition, int poids) {
		this(place, poids);
		transition.addOutArc(this);
	}

	public void step() {
		this.place.addJetons(this.getPoids());
	}
}
