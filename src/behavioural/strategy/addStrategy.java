package behavioural.strategy;

public class addStrategy implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
