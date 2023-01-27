package behavioural.strategy;

public class Main {

    public static void main(String[] args){


        Calculator calculator = new Calculator(new addStrategy());

        System.out.println(calculator.executeStrategy(5,5));

        calculator.strategy = new modStrategy();

        System.out.println(calculator.executeStrategy(5,5));

        calculator.strategy = new algorithmStrategy(AlgorithmType.ALGORITHM_A);

        System.out.println(calculator.executeStrategy(5,5));

        calculator.strategy = new algorithmStrategy(AlgorithmType.ALGORITHM_B);

        System.out.println(calculator.executeStrategy(5,5));

    }

}
