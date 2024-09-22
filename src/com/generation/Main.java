package com.generation;

import classes.SalesManager;
import classes.SalesRep;

public class Main {

    public static void main(String[] args) {
        SalesManager manager = new SalesManager("Fernando", "Ramirez", 120, 26, 788, 10, 300, 4, 120.00);
        SalesRep rep1 = new SalesRep("kris", "sandoval", 100, 88);
        
        System.out.println(manager);
        System.out.println("tiempo para el retiro: " + manager.timeToRetirement() + " años");
        System.out.println("Vacaciones sobrantes: " + manager.vacationTimeLeft() + " dias");
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println("comisiones: " + manager.calculateComission());

        manager.addSalesTeam(rep1);
        System.out.println(rep1);
        System.out.println("Commission for " + rep1.getFirstName() + ": " + rep1.calculateComission());

        
    }
}
