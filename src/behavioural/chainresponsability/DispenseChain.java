package behavioural.chainresponsability;

public interface DispenseChain {

    void nextChain(DispenseChain nextDispenseChain);

    void dispense(CurrentAmount currentAmount);
}
