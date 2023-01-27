package behavioural.template_method;

public class Main {

    public static void main(String[] args){

        OutfitTemplate outfit = new BeachOutfit();

        outfit.selectOutfit();

        System.out.println("---------------");

        OutfitTemplate outfit2 = new FormalOutfit();

        outfit2.selectOutfit();


    }

}
