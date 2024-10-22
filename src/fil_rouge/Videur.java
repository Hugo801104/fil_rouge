package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class Videur extends InArc{
	
	public Videur(Place place) {
		super(place, 0);
	}
	
	/**
	 * Constructor of an arc (adapted for the following steps of the exercise)
	 * 
	 * @param place
	 * @param transition
	 */
	public Videur(Place place, Transition transition) {
		this(place);
		transition.addVideurArc(this);
	}
	
	/**
	 * The method empties the place
	 */
	public void step() {
		this.place.remJetons(this.place.getJetons());
	}
	
	/**
	 * @return true if the arc does have some tokens, false else
	 */
	public boolean isTrig() {
		return this.place.getJetons() > 0;
	}
}
