package structural.adapter;

public class MovableAdapterImpl implements MovableAdapter{

    private Movable car;

    public MovableAdapterImpl(Movable ferrari) {
        this.car    = ferrari;
    }

    public double fromMphToKms(double mph){
        return mph * 1.609;
    }

    @Override
    public double getSpeed() {
        return fromMphToKms(car.getSpeed());
    };
}
