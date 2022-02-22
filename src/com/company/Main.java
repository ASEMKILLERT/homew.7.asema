package com.company;

public class Main {

    public static void main(String[] args) {
	HavingSuperAbility[] chrt = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < chrt.length; i++) {
            chrt[i].applySuperAbility("");
        }
    }
}
