package behavioural.strategy;

public class modStrategy implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return Math.floorMod(a,b);
    }
}
