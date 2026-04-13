package edu.farmingdale.garmentsimulator;

// Interface for the Abstract Factory that creates garment families.
public interface GarmentFactory {
    Top createTop();

    Pants createPants();

    Shoes createShoes();
}
