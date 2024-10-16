package fil_rouge;

public class Zero extends InArc{

	public Zero(Place place) {
		super(place, 0);
	}
	
	public void step() {
		this.place.remJetons(0); //not necessary to write this line
	}
	
	public boolean isTrig() {
		return this.place.getJetons() == 0;
	}

}
