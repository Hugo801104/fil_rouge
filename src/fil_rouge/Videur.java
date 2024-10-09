package fil_rouge;

public class Videur extends InArc{
	
	private Place place;
	
	public Videur(Place place) {
		super(place, null);
	}
	
	public void step() {
		this.place.remJetons(this.place.getJetons());
	}
	
	public boolean isTrig() {
		return this.place.getJetons() > 0;
	}
}
