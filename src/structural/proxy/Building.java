package structural.proxy;

public class Building implements Countable{



    @Override
    public int getCount() throws InterruptedException {
        Thread.sleep(10000);
        return 200;
    }
}
