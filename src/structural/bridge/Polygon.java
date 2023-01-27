package structural.bridge;

public abstract class Polygon {

    protected Color color;
    protected int vertex ;
    abstract void applyColor();
    Polygon(Color color){
        this.color = color;
    }
}