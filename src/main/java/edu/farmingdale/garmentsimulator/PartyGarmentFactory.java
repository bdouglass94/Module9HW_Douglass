package edu.farmingdale.garmentsimulator;

//Party garments
class PartyTop implements Top {
    @Override
    public void wear() {
        System.out.println("You try on a Party Top.");
    }
}

class PartyPants implements Pants {
    @Override
    public void wear() {
        System.out.println("You try on Party Pants.");
    }
}

class PartyShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("You try on Party Shoes.");
    }
}

//Concrete factory for Party garments.
public class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
