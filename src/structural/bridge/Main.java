package structural.bridge;

import creational.prototype.Shape;

public class Main {

    public static void main(String[] args){


        Polygon myTriangle = new Triangle(new Blue());

        myTriangle.applyColor();

        Polygon square = new Square(new Purple());

        square.applyColor();

    }

}
