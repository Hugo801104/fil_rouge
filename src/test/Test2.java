package test;

import java.util.ArrayList;
import java.util.Arrays;

import fil_rouge.*;

public class Test2 {

	public static void main(String[] args) {
		IPetriNet pn = new PetriNet();
		Place p1 = pn.addPlace(new Place(8));
		Place p2 = pn.addPlace(new Place(5));
		System.out.println("Nombre de jetons initial de p1 : "+p1.getTokens());
		System.out.println("Nombre de jetons initial de p2 : "+p2.getTokens());
		InArc a1 = pn.addInArcNormal(p1, 3);
		OutArc a2 = pn.addOutArc(p2, 9);
		System.out.println("Poids de l'InArc : "+a1.getWeight());
		System.out.println("Poids de l'OutArc : "+a2.getWeight());
		Transition t1 = pn.addTransition(new Transition(new ArrayList<InArc>(Arrays.asList(a1)), new ArrayList<OutArc>(Arrays.asList(a2))));
		t1.fire();
		System.out.println("Nombre de jetons final de p1 : "+p1.getTokens());
		System.out.println("Nombre de jetons final de p2 : "+p2.getTokens());
		
		//le commentaire pour voir, avant d'ajouter la biblio JUnit chez moi
	}

}
