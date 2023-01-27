package behavioural.template_method;

public abstract class OutfitTemplate {

    public final void selectOutfit(){
        selectShoes();
        selectShirt();
        selectPants();
        selectAccessories();
        System.out.println("Outfit selected");
    }

    private void selectAccessories(){
        System.out.println("selecting basic accessories");
    }

    public abstract void selectShoes();
    public abstract void selectShirt();
    public abstract void selectPants();



}
