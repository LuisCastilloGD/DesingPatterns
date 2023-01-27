package behavioural.template_method;

public class FormalOutfit extends OutfitTemplate{
    @Override
    public void selectShoes() {
        System.out.println("selected moccasins");
    }

    @Override
    public void selectShirt() {
        System.out.println("selected button up shirt");
    }

    @Override
    public void selectPants() {
        System.out.println("selected black formal pants");
    }
}
