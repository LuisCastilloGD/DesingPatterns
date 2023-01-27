package structural.proxy;

public class BuildingCacheProxy implements Countable{

    private Building building;
    Integer countCache ;

    public BuildingCacheProxy(Building building) {
        this.building = building;
        this.countCache = null;
    }


    @Override
    public int getCount() throws InterruptedException {
        if(countCache == null){
            countCache = building.getCount();
        }
        return countCache;
    }
}
