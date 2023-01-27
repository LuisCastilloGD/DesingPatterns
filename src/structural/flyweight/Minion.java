package structural.flyweight;

public class Minion implements Entity {

    int x;
    int y;

    String team;
    Objective objective;

    public Minion(int x, int y, String team, Objective objective) {
        this.x = x;
        this.y = y;
        this.team = team;
        this.objective = objective;
    }

    public void attack(){
        System.out.println(objective.toString());
    }

}
