package fil_rouge;

import java.util.ArrayList;

public class Transition {
	
	private ArrayList<InArc> inArcs;
	private ArrayList<OutArc> outArcs;
	
	public Transition(ArrayList<InArc> inArcs, ArrayList<OutArc> outArcs) {
		this.inArcs = inArcs;
		this.outArcs = outArcs;
	}
	
	
}
