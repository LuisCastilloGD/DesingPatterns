package structural.proxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Building building = new Building();
        BuildingCacheProxy proxy = new BuildingCacheProxy(building);

        proxy.getCount();
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");

        proxy.getCount();

    }
}
