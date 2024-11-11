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
	
	public OutArc addOutArc(Place p, Transition t, int weight) {
		OutArc arc = new OutArc(p, weight);
		//we check if there is already an arc between the place p and the transition t, and decide what to do.
		if (t.isLinked(p)) {
			System.out.println("there is already an OutArc between t and p");
			//update the arc
			t.getTheLinkOut(p).setWeight(weight);
			return t.getTheLinkOut(p);
		} else {
			this.outArcs.add(arc);
			t.addOutArc(arc);
			return arc;
		}
	}
	
	public InArc addInArcNormal(Place p, Transition t, int weight) {
		InArc arc = new InArc(p, weight);
		if (t.isLinked(p)) {
			System.out.println("there is already an InArc between t and p");
			//we remove the arc, and put the new arc (because the old arc can be an specific arc like a Zero arc, by removing it is more simple)
			this.remArc(t.getTheLinkIn(p));
			this.inArcs.add(arc);
			t.addInArcNormal(arc);
			System.out.println("the arc has been change");
			return arc;
		} else {
			this.inArcs.add(arc);
			t.addInArcNormal(arc);
			return arc;
		}
	}
	
	public Empty addEmptyArc(Place p, Transition t) {
		Empty arc = new Empty(p);
		if (t.isLinked(p)) {
			System.out.println("there is already an InArc between t and p");
			this.remArc(t.getTheLinkIn(p));
			this.inArcs.add(arc);
			t.addEmptyArc(arc);
			System.out.println("the arc has been change");
			return arc;
		} else {
			this.inArcs.add(arc);
			t.addEmptyArc(arc);
			return arc;
		}
	}
	
	public Zero addZeroArc(Place p, Transition t) {
		Zero arc = new Zero(p);
		if (t.isLinked(p)) {
			System.out.println("there is already an InArc between t and p");
			this.remArc(t.getTheLinkIn(p));
			this.inArcs.add(arc);
			t.addZeroArc(arc);
			System.out.println("the arc has been change");
			return arc;
		} else {
			this.inArcs.add(arc);
			t.addZeroArc(arc);
			return arc;
		}
	}
	
	public void remArc(Arc a) {
		if (a instanceof InArc) {
			this.inArcs.remove(a);
		} else if (a instanceof OutArc) {
			this.outArcs.remove(a);
		}
		//now we remove the Arc from the transition it is linked with
		for (Transition t : this.transitions) {
			if (t.isInT(a)) {
				t.remArcT(a);;
			}
		}
	}
	
}