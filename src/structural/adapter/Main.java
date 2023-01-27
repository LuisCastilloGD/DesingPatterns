package structural.adapter;

public class Main {

    public static void main(String[] args){

        Ferrari ferrari = new Ferrari();

        System.out.println(ferrari.getSpeed());

        MovableAdapter adapter = new MovableAdapterImpl(ferrari);

        System.out.println(adapter.getSpeed());


    }

}
