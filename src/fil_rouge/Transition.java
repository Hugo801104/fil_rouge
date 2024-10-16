package fil_rouge;

import java.util.ArrayList;

public class Transition {
	
	private ArrayList<InArc> inArcs;
	private ArrayList<OutArc> outArcs;
	
	public Transition(ArrayList<InArc> inArcs, ArrayList<OutArc> outArcs) {
		this.inArcs = inArcs;
		this.outArcs = outArcs;
	}
	
	//no
	public void fire() {
		for (InArc ia : inArcs) {
			ia.step();
		}
		for (OutArc ia : outArcs) {
			ia.step();
		}
	}
	
	public void addOutArc(OutArc arc) {
		outArcs.add(arc);
	}
	
	public void addInArcNormal(InArc arc) {
		inArcs.add(arc);
	}
	
	public void addVideurArc(Videur arc) {
		inArcs.add(arc);
	}
	
	public void addZeroArc(Zero arc) {
		inArcs.add(arc);
	}
	
}
