package fil_rouge;

import java.util.ArrayList;

import fil_rouge.*;

public class PetriNet {
	
	private ArrayList<Place> places;
	private ArrayList<OutArc> outArcs;
	private ArrayList<InArc> inArcs;
	private ArrayList<Transition> transitions;
	
	public void addPlace(Integer jetons) {
		Place place = new Place(jetons);
		this.places.add(place);
	}
	
	public void addInArcNormal(Place place, Integer poids) {
		InArc arc = new InArc(place, poids);
		this.inArcs.add(arc);
	}
	
	public void addOutArc(Place place, Integer poids) {
		OutArc arc = new OutArc(place, poids);
		this.outArcs.add(arc);
	}
	
	public void addZeroArc(Place place) {
		Zero arc = new Zero(place);
		this.inArcs.add(arc);
	}
	
	public void addVideurArc(Place place) {
		Videur arc = new Videur(place);
		this.inArcs.add(arc);
	}
	
	public void addTransition(ArrayList<InArc> inArcs, ArrayList<OutArc> outArcs) {
		Transition transition = new Transition(inArcs, outArcs);
		this.transitions.add(transition);
	}
}
