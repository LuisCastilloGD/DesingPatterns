package structural.bridge;

public class Triangle extends Polygon{


    Triangle(Color color){
        super(color);
        vertex=3;
    }

    @Override
    void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
