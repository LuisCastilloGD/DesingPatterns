package behavioural.chainresponsability;

public class Dispense20DllsChain implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void nextChain(DispenseChain nextDispenseChain) {
        this.chain = nextDispenseChain;
    }

    @Override
    public void dispense(CurrentAmount currentAmount) {
        if(currentAmount.getAmount() >= 20){
            int num = currentAmount.getAmount() / 20;
            int rem = currentAmount.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20$ bill");
            if(rem != 0){
                this.chain.dispense(new CurrentAmount(rem));
            }
        }else{
            this.chain.dispense(currentAmount);
        }
    }
}
