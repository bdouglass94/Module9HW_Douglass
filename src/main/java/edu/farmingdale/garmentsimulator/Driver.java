package edu.farmingdale.garmentsimulator;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

//Driver class for testing
public class Driver {

    //Main method to test the Abstract Factory pattern.
    public static void main(String[] args) {

        //Test Professional garments
        System.out.println("----------------------------------------");
        System.out.println("\nTrying on Professional Garments...");
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        Top professionalTop = professionalFactory.createTop();
        Pants professionalPants = professionalFactory.createPants();
        Shoes professionalShoes = professionalFactory.createShoes();
        professionalTop.wear();
        professionalPants.wear();
        professionalShoes.wear();
        System.out.println("You are wearing all professional garments!");
        System.out.println("\n----------------------------------------");

        //Test Casual Garments
        System.out.println("\nTrying on Casual Garments...");
        GarmentFactory casualFactory = new CasualGarmentFactory();
        Top casualTop = casualFactory.createTop();
        Pants casualPants = casualFactory.createPants();
        Shoes casualShoes = casualFactory.createShoes();
        casualTop.wear();
        casualPants.wear();
        casualShoes.wear();
        System.out.println("You are wearing all casual garments!");
        System.out.println("\n----------------------------------------");

        //Test Party Garments
        System.out.println("\nTrying on Party Garments...");
        GarmentFactory partyFactory = new PartyGarmentFactory();
        Top partyTop = partyFactory.createTop();
        Pants partyPants = partyFactory.createPants();
        Shoes partyShoes = partyFactory.createShoes();
        partyTop.wear();
        partyPants.wear();
        partyShoes.wear();
        System.out.println("You are wearing all party garments!");
        System.out.println("\n----------------------------------------");
    }
}
