package creational.prototype;

public class Circle extends Shape{
    int radius;

    public Circle() {
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }


}
