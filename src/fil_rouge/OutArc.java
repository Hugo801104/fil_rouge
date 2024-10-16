package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class OutArc extends Arc{
	
	public OutArc(Place place, int poids) {
		super(place, poids);
	}
	
	/**
	 * Constructor of an arc (adapted for the following steps of the exercise)
	 * 
	 * @param place
	 * @param transition
	 * @param poids
	 */
	public OutArc(Place place, Transition transition, int poids) {
		this(place, poids);
		transition.addOutArc(this);
	}
	
	/**
	 * The method add the number of tokens needed when the transition if fired
	 */
	public void step() {
		this.place.addJetons(this.getPoids());
	}
}
