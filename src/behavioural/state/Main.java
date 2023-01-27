package behavioural.state;

public class Main {
    public static void main(String[]args){

        Order myorder = new Order();

        myorder.getStatus();

        myorder.nextState();
        myorder.getStatus();

        myorder.nextState();
        myorder.getStatus();

        myorder.previousState();
        myorder.getStatus();


    }
}
