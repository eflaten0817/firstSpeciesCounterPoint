package com.company;

public class CantusFirmus {
    node startingPitch;


    public void addEnd(node e) {

        node last = startingPitch;
        node ref = startingPitch;
        while (ref != null){
            last = ref;
            ref = ref.next;
        }
        last.next = e;
    }


    public void printCantus(node h){
        System.out.println("starting pitch-->");
        node ref = h;
        while (ref != null){
            System.out.println(ref.voxOrgan + "-->");
            ref = ref.next;
        }
        System.out.println("end");
    }
    public void printMelody(node h){
        System.out.println("starting pitch-->");
        node ref = h;
        while (ref != null){
            System.out.println(ref.voxPrinc + "-->");
            ref = ref.next;
        }
        System.out.println("end");
    }
    public void printIntervals(node h){
        //System.out.println("starting pitch-->");
        node ref = h;
        while (ref != null){
            System.out.print(ref.voxPrinc + " ");

            ref = ref.next;
        }
        System.out.println("");
        ref = h;
        while (ref != null){
            System.out.print(ref.getIntervalName(ref) + "  ");

            ref = ref.next;
        }
        System.out.println("");
        ref = h;
        while (ref != null){
            System.out.print(ref.voxOrgan + " ");
            ref = ref.next;
        }
        //System.out.println("end");
    }
    public void checkFinal(node e) {

        node last = startingPitch;
        node ref = startingPitch;
        while (ref != null){
            last = ref;
            ref = ref.next;
        }
        String finalInterval = last.getIntervalName(last);
        int intFinalInterval = Integer.parseInt(finalInterval);
        if (intFinalInterval == 8){
            System.out.println("Final Interval is good (8 or Unison)");
        }
        else
            System.out.println("ERROR last interval needs to be Unison or 8!");
    }
}
