package creational.prototype;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.x = 1;
        circle.y = 2;
        circle.color= "red";


        Shape otherCircle = circle.clone();

        //They are indeed Equals
        System.out.println(circle.equals(otherCircle));
        //But different Objects
        System.out.println(circle);
        System.out.println(otherCircle);

    }
}
