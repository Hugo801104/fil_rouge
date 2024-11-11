package fil_rouge;

import java.util.ArrayList;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 */
public class Transition {
	
	private ArrayList<InArc> inArcs;
	private ArrayList<OutArc> outArcs;
	
	/**
	 * Constructor with a list of inArcs and a list of outArcs
	 * 
	 * @param inArcs
	 * @param outArcs
	 */
	public Transition(ArrayList<InArc> inArcs, ArrayList<OutArc> outArcs) {
		this.inArcs = inArcs;
		this.outArcs = outArcs;
	}
	
	/**
	 * Constructor with empty lists of in/outArcs
	 */
	public Transition() {
		this(new ArrayList<InArc>(), new ArrayList<OutArc>());
	}
	
	/**
	 * The function verifies if the transition can be triggered and if it is able to, it runs the transition
	 */
	public void fire() {
		boolean isTrigTransition = true;
		for (InArc ia : inArcs) {
			isTrigTransition = isTrigTransition && ia.isTrig();
		}
		if (isTrigTransition) {
			for (InArc ia : inArcs) {
				ia.step();
			}
			for (OutArc ia : outArcs) {
				ia.step();
			}
		} else {
			System.out.println("Transition not triggerable");
		}
	}
	
	public void addOutArc(OutArc arc) {
		outArcs.add(arc);
	}
	
	public void addInArcNormal(InArc arc) {
		inArcs.add(arc);
	}
	
	public void addEmptyArc(Empty arc) {
		inArcs.add(arc);
	}
	
	public void addZeroArc(Zero arc) {
		inArcs.add(arc);
	}
	
	
	/**
	 * Return true if the Arc a is link to the transition 
	 * i.e. if a is in this.inArcs or in this.outArcs
	 * Else return false
	 * @param a
	 */
	public boolean isInT(Arc a) {
		if (a instanceof InArc) {
			return this.inArcs.contains(a);
		} else if (a instanceof OutArc) {
			return this.outArcs.contains(a);
		} else {//never happen
			return false;
		}
	}	
	
	/**
	 * Remove the Arc a from the transition
	 * 
	 * @param a
	 */
	public void remArcT(Arc a) {
		if (a instanceof InArc) {
			this.inArcs.remove(a);
		} else if (a instanceof OutArc) {
			this.outArcs.remove(a);
		}
	}
	
}
