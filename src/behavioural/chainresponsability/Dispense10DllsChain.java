package behavioural.chainresponsability;

public class Dispense10DllsChain implements DispenseChain {

    private DispenseChain chain;
    @Override
    public void nextChain(DispenseChain nextDispenseChain) {
        this.chain = nextDispenseChain;
    }

    @Override
    public void dispense(CurrentAmount currentAmount) {
        if(currentAmount.getAmount() >= 10){
            int num = currentAmount.getAmount() / 10;
            int rem = currentAmount.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10$ bill");
            if(rem != 0){
                this.chain.dispense(new CurrentAmount(rem));
            }
        }else {
            this.chain.dispense(currentAmount);
        }
    }
}
