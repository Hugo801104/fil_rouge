package fil_rouge;

public class OutArc extends Arc{
	
	private Place place;
	private Integer poids;
	
	public OutArc(Place place, Integer poids) {
		super(place, poids);
	}
	
	public void step() {
		this.place.addJetons(this.getPoids());
	}
}
