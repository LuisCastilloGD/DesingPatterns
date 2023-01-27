package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){


        Wave wave = new Wave();

        wave.addMinion(0,0,"red","Torre1","Torre","blue");
        wave.addMinion(1,0,"red","Torre1","Torre","blue");
        wave.addMinion(0,1,"blue","Torre2","Torre","red");
        wave.addMinion(2,2,"red","nexusBlue","Nexus","blue");
        wave.addMinion(1,5,"blue","Torre2","Torre","red");

        for (Minion minion:wave.getMinions()) {
            minion.attack();
        }

    }



}
