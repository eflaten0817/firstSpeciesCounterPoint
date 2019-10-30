package com.company;

public class node {
    String voxPrinc;
    String voxOrgan;
    node next;

    public node(String P, String O){
        voxPrinc = P;
        voxOrgan = O;
    }

    public String getIntervalName(node pair){
        int hS = pair.getInterval(pair);
        String intervalName = "";
        switch (hS){
            case 0:
            case 12:
                intervalName = "8";
                break;
            case 1:
            case 13:
            case 2:
            case 14:
                intervalName = "2";
                break;
            case 3:
            case 15:
            case 4:
            case 16:
                intervalName = "3";
                break;
            case 5:
            case 17:
                intervalName = "4";
                break;
            case 6:
            case 18:
                intervalName = "666";
                break;
            case 7:
            case 19:
                intervalName = "5";
                break;
            case 8:
            case 20:
            case 9:
            case 21:
                intervalName = "6";
                break;
            case 10:
            case 22:
            case 11:
            case 23:
                intervalName = "7";
                break;
        }
        return intervalName;
    }
    public int getInterval(node input){
        int top = getHalfSteps(input.voxPrinc);
        int bottom = getHalfSteps(input.voxOrgan);
        int interval = top - bottom;
        return interval;
    }

    public int getHalfSteps(String input){
        String check = input;
        int halfSteps = 0;
        switch (check){
            case "G2":
                halfSteps = -1;
                break;
            case "A3":
                halfSteps = 0;
                break;
            case "B3":
                halfSteps = 2;
                break;
            case "C3":
                halfSteps = 3;
                break;
            case "D3":
                halfSteps = 5;
                break;
            case "E3":
                halfSteps = 7;
                break;
            case "F3":
                halfSteps = 8;
                break;
            case "G3":
                halfSteps = 10;
                break;
            case "A4":
                halfSteps = 12;
                break;
            case "B4":
                halfSteps = 14;
                break;
            case "C4":
                halfSteps = 15;
                break;
            case "D4":
                halfSteps = 17;
                break;
            case "E4":
                halfSteps = 19;
                break;
            case "F4":
                halfSteps = 20;
                break;
            case "G4":
                halfSteps = 22;
                break;
            case "A5":
                halfSteps = 24;
                break;
            case "B5":
                halfSteps = 26;
                break;
            case "C5":
                halfSteps = 27;
                break;
            case "D5":
                halfSteps = 29;
                break;
            case "E5":
                halfSteps = 31;
                break;
            case "F5":
                halfSteps = 32;
                break;
            case "G5":
                halfSteps = 34;
                break;
        }
        return halfSteps;
    }
}
