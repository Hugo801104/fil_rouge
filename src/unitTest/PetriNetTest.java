package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fil_rouge.*;

class PetriNetTest {
    private PetriNet petriNet;
    private Place p1;
    private Transition t1;

    @BeforeEach
    void setUp() {
        petriNet = new PetriNet();
        p1 = new Place();
        t1 = new Transition();
    }

    @Test
    void testAddPlace() {
        petriNet.addPlace(p1);
        assertTrue(petriNet.getPlaces().contains(p1));
    }

    @Test
    void testRemPlace() {
        petriNet.addPlace(p1);
        petriNet.remPlace(p1);
        assertFalse(petriNet.getPlaces().contains(p1));
    }

    @Test
    void testAddTransition() {
        petriNet.addTransition(t1);
        assertTrue(petriNet.getTransitions().contains(t1));
    }

    @Test
    void testRemTransition() {
        petriNet.addTransition(t1);
        petriNet.remTransition(t1);
        assertFalse(petriNet.getTransitions().contains(t1));
    }

    @Test
    void testAddOutArc() {
        OutArc oa = petriNet.addOutArc(p1, t1, 5);
        assertTrue(petriNet.getOutArcs().contains(oa));
        assertEquals(5, oa.getWeight());
        assertTrue(t1.isLinked(p1));
        petriNet.addOutArc(p1, t1, 3);
        assertEquals(t1.getTheLinkOut(p1).getWeight(),3);
    }

    @Test
    void testAddInArcNormal() {
        InArc ia = petriNet.addInArcNormal(p1, t1, 3);
        assertTrue(petriNet.getInArcs().contains(ia));
        assertEquals(3, ia.getWeight());
        assertTrue(t1.isLinked(p1));
        petriNet.addInArcNormal(p1, t1, 5);
        System.out.println(t1.getTheLinkOut(p1).getWeight());
        assertEquals(t1.getTheLinkOut(p1).getWeight(),5);
    }

    @Test
    void testAddEmptyArc() {
        Empty e = petriNet.addEmptyArc(p1, t1);
        assertTrue(petriNet.getInArcs().contains(e));
        assertTrue(t1.isLinked(p1));
        petriNet.addInArcNormal(p1, t1, 5);
        System.out.println(t1.getTheLinkOut(p1).getWeight());
        assertEquals(t1.getTheLinkOut(p1).getWeight(),5);
    }

    @Test
    void testAddZeroArc() {
        Zero z = petriNet.addZeroArc(p1, t1);
        assertTrue(petriNet.getInArcs().contains(z));
        assertTrue(t1.isLinked(p1));
        petriNet.addInArcNormal(p1, t1, 5);
        System.out.println(t1.getTheLinkOut(p1).getWeight());
        assertEquals(t1.getTheLinkOut(p1).getWeight(),5);
    }

    @Test
    void testRemArc() {
        OutArc oa = petriNet.addOutArc(p1, t1, 4);
        petriNet.remArc(oa);
        assertFalse(petriNet.getOutArcs().contains(oa));
        System.out.println(t1.isInT(oa));
        assertFalse(t1.isInT(oa)); // Il y a une erreur
    }
}

