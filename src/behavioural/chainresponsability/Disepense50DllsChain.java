package behavioural.chainresponsability;

public class Disepense50DllsChain implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void nextChain(DispenseChain nextDispenseChain) {
        this.chain = nextDispenseChain;
    }

    @Override
    public void dispense(CurrentAmount currentAmount) {
        if(currentAmount.getAmount() >= 50){
            int num = currentAmount.getAmount()/50;
            int reminder = currentAmount.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ bill");
            if(reminder % 50 != 0){
                this.chain.dispense(new CurrentAmount(reminder));
            }
        }else{
            System.out.println(currentAmount.getAmount());
            this.chain.dispense(currentAmount);
        }
    }
}
