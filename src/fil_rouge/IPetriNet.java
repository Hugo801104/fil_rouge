package fil_rouge;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public interface IPetriNet {
	
	/**
	 * Add the Place p to the PetriNet
	 * 
	 * @param p the Place
	 */
	Place addPlace(Place p);
	
	/**
	 * Remove the Place p from the PetriNet
	 * 
	 * @param p
	 */
	void remPlace(Place p);
	
	/**
	 * Add the Transition t to the PetriNet
	 * 
	 * @param t the Transition
	 */
	Transition addTransition(Transition t);
	
	/**
	 * Remove the Transition t from the PetriNet
	 * 
	 * @param t
	 */
	void remTransition(Transition t);
	
	/**
	 * Add the Arc a to the PetriNet
	 * 
	 * @param p the Place links to the Arc
	 * @param poids the poids of the arc
	 */
	OutArc addOutArc(Place p, int poids); // ou void addOutArc(...)
	
	/**
	 * Add the Arc a to the PetriNet
	 * 
	 * @param p the Place links to the Arc
	 * @param poids the poids of the arc
	 */
	InArc addInArcNormal(Place p, int poids);
	
	/**
	 * Add the Arc a to the PetriNet
	 * 
	 * @param p the Place links to the Arc
	 */
	Videur addVideurArc(Place p);
	
	/**
	 * Add the Arc a to the PetriNet
	 * 
	 * @param p the Place links to the Arc
	 */
	Zero addZeroArc(Place p);
	
	/**
	 * Remove the Arc a from the PetriNet
	 * 
	 * @param a
	 */
	void remArc(Arc a);
}
