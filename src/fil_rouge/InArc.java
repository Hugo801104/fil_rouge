package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class InArc extends Arc{
	
	public InArc(Place place, int poids) {
		super(place, poids);
	}

	/**
	 * Constructor of an arc (adapted for the following steps of the exercise)
	 * 
	 * @param place
	 * @param transition
	 * @param poids
	 */
	public InArc(Place place, Transition transition, int poids) {
		this(place, poids);
		transition.addInArcNormal(this);
	}
	
	/**
	 * The method remove the number of tokens needed to fire the transition
	 */
	public void step() {
		this.place.remJetons(this.getPoids());
	}
	
	/**
	 * @return true if the arc is triggerable, false else
	 */
	public boolean isTrig() {
		return this.getPoids() <= this.place.getJetons();
	}
}
