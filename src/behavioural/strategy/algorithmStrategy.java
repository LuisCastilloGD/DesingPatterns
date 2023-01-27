package behavioural.strategy;

public class algorithmStrategy implements Strategy{

    private AlgorithmType type;

    algorithmStrategy(AlgorithmType type){
        this.type = type;
    }

    @Override
    public int calculate(int a, int b) {
        switch (type){

            case ALGORITHM_A -> {
                return a*a+(b/a);
            }
            case ALGORITHM_B -> {
                return b*b+(b-a);
            }
            default -> {
                return 0;
            }
        }

    }
}
