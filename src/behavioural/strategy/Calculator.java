package behavioural.strategy;

public class Calculator {

    Strategy strategy;

    Calculator(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.calculate(a,b);
    }

}
