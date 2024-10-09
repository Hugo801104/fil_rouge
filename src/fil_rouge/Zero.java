package fil_rouge;

public class Zero extends InArc{
	
	private Place place;

	public Zero(Place place) {
		super(place, 0);
	}
	
	public void step() {
		this.place.remJetons(0);
	}
	
	public boolean isTrig() {
		return this.place.getJetons() == 0;
	}

}
