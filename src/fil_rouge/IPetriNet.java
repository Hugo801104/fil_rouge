package fil_rouge;

public interface IPetriNet {
	
	/**
	 * Add the Place p to the PetriNet
	 * 
	 * @param p the Place
	 */
	void addPlace(Place p);
	
	/**
	 * Add the Transition t to the PetriNet
	 * 
	 * @param t the Transition
	 */
	void addTransition(Transition t);
	
	/**
	 * Add the Place p to the PetriNet
	 * 
	 * @param p the Place links to the Arc
	 * @param t the Transition links to the Arc
	 * @param poids the poids of the arc
	 */
	OutArc addOutArc(Place p, Transition t, int poids); // ou void addOutArc(...)
	
	/**
	 * Add the Place p to the PetriNet
	 * 
	 * @param p the Place
	 */
	InArc addInArcNormal(Place p, Transition t, int poids);
	
	/**
	 * Add the Place p to the PetriNet
	 * 
	 * @param p the Place
	 */
	Videur addVideurArc(Place p, Transition t, int poids);
	
	/**
	 * Add the Place p to the PetriNet
	 * 
	 * @param p the Place
	 */
	Zero addZeroArc(Place p, Transition t, int poids);
}
