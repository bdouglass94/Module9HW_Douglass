package edu.farmingdale.garmentsimulator;

//Casual garments
class CasualTop implements Top {
    @Override
    public void wear() {
        System.out.println("You try on a Casual Top.");
    }
}

class CasualPants implements Pants {
    @Override
    public void wear() {
        System.out.println("You try on Casual Pants.");
    }
}

class CasualShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("You try on Casual Shoes.");
    }
}

//Concrete factory for Casual garments.
public class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
