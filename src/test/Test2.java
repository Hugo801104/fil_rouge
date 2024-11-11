package test;

import fil_rouge.*;

/**
 * @author Pierrick CAUSERET
 * @author Hugo JASMIN
 * 
 * This class try to run a PetriNet by creating an object of type PetriNet
 */
public class Test2 {

	public static void main(String[] args) {
		IPetriNet pn = new PetriNet();
		Place p1 = pn.addPlace(new Place(8));
		Place p2 = pn.addPlace(new Place(5));
		Transition t1 = pn.addTransition(new Transition());
		System.out.println("Nombre de jetons initial de p1 : "+p1.getTokens());
		System.out.println("Nombre de jetons initial de p2 : "+p2.getTokens());
		InArc a1 = pn.addInArcNormal(p1, t1, 3);
		OutArc a2 = pn.addOutArc(p2, t1, 9);
		System.out.println("Poids de l'InArc : "+a1.getWeight());
		System.out.println("Poids de l'OutArc : "+a2.getWeight());
		t1.fire();
		System.out.println("Nombre de jetons final de p1 : "+p1.getTokens());
		System.out.println("Nombre de jetons final de p2 : "+p2.getTokens());
		//---------
		System.out.println("test après modification des méthodes d'ajout d'arcs dans la classe PetriNet");
		//---------
		OutArc a3 = pn.addOutArc(p2, t1, 1);
		if (a3.equals(a2)) {
			System.out.println("ok a3 et a2 pointe bien vers le même objet");
		} else {
			System.out.println("problème");
		}
		InArc a4 = pn.addEmptyArc(p1, t1);
		//normalement on a enlevé a1 du PetriNet
		System.out.println(t1.isInT(a1));//doit renvoyer false
		System.out.println(t1.isInT(a4));//doit renvoyer true
	}

}
