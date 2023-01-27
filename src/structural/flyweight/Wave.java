package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Wave {

    List<Minion> minions = new ArrayList<>();

    public void addMinion(int x,int y,String team, String name,String type, String color){
        Objective obj = ObjectiveFactory.createObjective(name,type,color);
        Minion minion = new Minion(x,y,team,obj);
        minions.add(minion);
    }

    public List<Minion> getMinions(){
        return minions;
    }

}
