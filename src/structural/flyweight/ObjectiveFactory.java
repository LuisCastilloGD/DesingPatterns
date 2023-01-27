package structural.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObjectiveFactory {

    static HashMap <String,Objective> objectives = new HashMap();

    public static Objective createObjective(String name,String type,String color){
        Objective obj = objectives.get(name);
        if(obj == null){
            obj = new Objective(name,type,color);
            objectives.put(name,obj);
        }
        return obj;
    }

}
