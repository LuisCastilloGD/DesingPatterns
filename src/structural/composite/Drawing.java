package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    List<Shape> shapelist = new ArrayList<Shape>();

    public void add(Shape shape){
        shapelist.add(shape);
    }
    public void remove(Shape shape){
        shapelist.remove(shape);
    }

    public void clear(){
        shapelist.clear();
        System.out.println("Cleared");
    }

    @Override
    public void draw(String color) {
        for (Shape shape:shapelist) {
            shape.draw(color);
        }
    }
}
