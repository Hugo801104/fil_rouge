package fil_rouge;

import java.util.ArrayList;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class PetriNet implements IPetriNet {
	
	private ArrayList<Place> places;
	private ArrayList<OutArc> outArcs;
	private ArrayList<InArc> inArcs;
	private ArrayList<Transition> transitions;

	/**
	 * The default constructor
	 * 
	 */
	public PetriNet() {
		this.places = new ArrayList<Place>();
		this.outArcs = new ArrayList<OutArc>();
		this.inArcs = new ArrayList<InArc>();
		this.transitions = new ArrayList<Transition>();
	}
	
	public Place addPlace(Place p) {
		this.places.add(p);
		return(p);
	}
	
	public void remPlace(Place p) {
		this.places.remove(p);
	}
	
	public Transition addTransition(Transition t) {
		this.transitions.add(t);
		return(t);
	}
	
	public void remTransition(Transition t) {
		this.transitions.remove(t);
	}
	
	public OutArc addOutArc(Place p, int weight) {
		OutArc arc = new OutArc(p, weight);
		this.outArcs.add(arc);
		return arc;
	}
	
	public InArc addInArcNormal(Place p, int weight) {
		InArc arc = new InArc(p, weight);
		this.inArcs.add(arc);
		return arc;
	}
	
	public Empty addEmptyArc(Place p) {
		Empty arc = new Empty(p);
		this.inArcs.add(arc);
		return arc;
	}
	
	public Zero addZeroArc(Place p) {
		Zero arc = new Zero(p);
		this.inArcs.add(arc);
		return arc;
	}
	
	public void remArc(Arc a) {
		if (a instanceof InArc) {
			this.inArcs.remove(a);
		} else if (a instanceof OutArc) {
			this.outArcs.remove(a);
		}
	}
	
}