package test;

import fil_rouge.*;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 * 
 * This class tries to run a PetriNet by creating an object of type PetriNet
 */
public class Test2 {

	public static void main(String[] args) {
		IPetriNet pn = new PetriNet();
		Place p1 = pn.addPlace(new Place(8));
		Place p2 = pn.addPlace(new Place(5));
		Transition t1 = pn.addTransition(new Transition());
		System.out.println("Initial number of tokens of p1 : "+p1.getTokens());
		System.out.println("Initial number of tokens of p2 : "+p2.getTokens());
		InArc a1 = pn.addInArcNormal(p1, t1, 3);
		OutArc a2 = pn.addOutArc(p2, t1, 9);
		System.out.println("InArc Weight : "+a1.getWeight());
		System.out.println("OutArc Weight : "+a2.getWeight());
		t1.fire();
		System.out.println("Final tokens number of p1 : "+p1.getTokens());
		System.out.println("Final tokens number of p2 : "+p2.getTokens());
		//---------
		System.out.println("Test after the modification of the methods of adding arcs in the class PetriNet");
		//---------
		OutArc a3 = pn.addOutArc(p2, t1, 1);
		if (a3.equals(a2)) {
			System.out.println("Ok, a3 and a2 refer to the same object");
		} else {
			System.out.println("Problem");
		}
		InArc a4 = pn.addEmptyArc(p1, t1);
		System.out.println("Must return false : "+t1.isInT(a1));//must return false
		System.out.println("Must return true : "+t1.isInT(a4));//must return true
	}

}
