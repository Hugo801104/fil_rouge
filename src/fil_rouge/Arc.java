package fil_rouge;

/**
 * Abstract class for the arcs of the PetriNet
 * 
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public abstract class Arc {
	protected Place place;
	protected int poids;
	
	/**
	 * Constructor of an arc
	 * 
	 * @param place
	 * @param poids
	 */
	public Arc(Place place, int poids) {
		this.place = place;
		this.poids = poids;
	}
	
	/**
	 * Set the weight of the arc
	 * 
	 * @param poids
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	/**
	 * 
	 * @return the weight of the arc
	 */
	public int getPoids() {
		return this.poids;
	}
	
	/**
	 * Abstract method for the step() method
	 */
	public abstract void step();
	
}
