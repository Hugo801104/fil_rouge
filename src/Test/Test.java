package Test;

import java.util.ArrayList;

import fil_rouge.*;

public class Test {
	public static void main(String[] args) {
		Place p1 = new Place(8);
		Place p2 = new Place(5);
		System.out.println("Nombre de jetons initial de p1 : "+p1.getJetons());
		System.out.println("Nombre de jetons initial de p2 : "+p2.getJetons());
		InArc a1 = new InArc(p1,3);
		OutArc a2 = new OutArc(p2,9);
		System.out.println("Poids de l'InArc : "+a1.getPoids());
		System.out.println("Poids de l'OutArc : "+a2.getPoids());
		ArrayList<InArc> ia = new ArrayList<InArc>();
		ArrayList<OutArc> oa = new ArrayList<OutArc>();
		ia.add(a1);
		oa.add(a2);
		Transition t1 = new Transition(ia,oa);
		t1.fire();
		System.out.println("Nombre de jetons final de p1 : "+p1.getJetons());
		System.out.println("Nombre de jetons final de p2 : "+p2.getJetons());
	}
}
