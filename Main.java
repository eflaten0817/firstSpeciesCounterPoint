package com.company;

public class Main {

    public static void main(String[] args) {

        node One = new node("F3", "B3");
        node Two = new node("G3", "E3");
        node Three = new node("A4", "F3");
        node Four = new node("B4", "G3");
        node Five = new node ("C4", "E3");
        node Six = new node ("B4", "D3");
        node Seven = new node ("C4", "C3");

        /*
        System.out.println(One.getIntervalName(One));
        System.out.println(Two.getIntervalName(Two));
        System.out.println(Three.getInterval(Three));
        */

        One.next = Two;
        Two.next = Three;
        Three.next = Four;
        Four.next = Five;
        Five.next = Six;
        Six.next = Seven;

        CantusFirmus pilot = new CantusFirmus();
        pilot.startingPitch = One;

       pilot.checkFinal(One);

    }
}
