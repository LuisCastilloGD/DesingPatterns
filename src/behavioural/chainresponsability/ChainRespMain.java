package behavioural.chainresponsability;

public class ChainRespMain {

    DispenseChain dispenseChain;

    public ChainRespMain() {
        this.dispenseChain = new Disepense50DllsChain();
        DispenseChain chain20 = new Dispense20DllsChain();
        DispenseChain chain10 = new Dispense10DllsChain();

        dispenseChain.nextChain(chain20);
        chain20.nextChain(chain10);
    }

    public static void main(String[] args){

            ChainRespMain chainRespMain = new ChainRespMain();
            int amount = 570;
            chainRespMain.dispenseChain.dispense(new CurrentAmount(amount));

    }
}
