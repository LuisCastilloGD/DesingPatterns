package behavioural.template_method;

public class BeachOutfit extends OutfitTemplate{
    @Override
    public void selectShoes() {
        System.out.println("selected some sandals");
    }

    @Override
    public void selectShirt() {
        System.out.println("selected a light shirt");
    }

    @Override
    public void selectPants() {
        System.out.println("selected a pair of shorts");
    }
}
