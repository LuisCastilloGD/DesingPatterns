package structural.bridge;

public class Square extends Polygon{
    Square(Color color) {
        super(color);
        this.vertex = 4;
    }

    @Override
    void applyColor() {
        System.out.print("Triangle filled with color");
        color.applyColor();
    }
}
