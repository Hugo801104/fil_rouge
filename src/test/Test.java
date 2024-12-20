package test;

import java.util.ArrayList;

import fil_rouge.*;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 * 
 * This class tries to run a PetriNet without creating an object of type PetriNet
 */
public class Test {
	public static void main(String[] args) {
		Place p1 = new Place(8);
		Place p2 = new Place(5);
		System.out.println("Initial number of tokens of p1 : "+p1.getTokens());
		System.out.println("Initial number of tokens of p2 : "+p2.getTokens());
		InArc a1 = new InArc(p1,3);
		OutArc a2 = new OutArc(p2,9);
		System.out.println("InArc Weight : "+a1.getWeight());
		System.out.println("OutArc Weight : "+a2.getWeight());
		ArrayList<InArc> ia = new ArrayList<InArc>();
		ArrayList<OutArc> oa = new ArrayList<OutArc>();
		ia.add(a1);
		oa.add(a2);
		Transition t1 = new Transition(ia,oa);
		t1.fire();
		System.out.println("Final tokens number of p1 : "+p1.getTokens());
		System.out.println("Final tokens number of p2 : "+p2.getTokens());
	}
}
