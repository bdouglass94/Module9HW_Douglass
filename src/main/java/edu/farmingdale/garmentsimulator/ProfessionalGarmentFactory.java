package edu.farmingdale.garmentsimulator;

//Professional garments
class ProfessionalTop implements Top {
    @Override
    public void wear() {
        System.out.println("You try on a Professional Top.");
    }
}

class ProfessionalPants implements Pants {
    @Override
    public void wear() {
        System.out.println("You try on Professional Pants.");
    }
}

class ProfessionalShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("You try on Professional Shoes.");
    }
}

//Concrete factory for Professional garments.
public class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
