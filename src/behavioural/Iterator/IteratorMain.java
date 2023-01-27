package behavioural.Iterator;

public class IteratorMain {

    public static void main(String[] args){
        NamesRepo namesRepo = new NamesRepo();
        for(Iterator iter = namesRepo.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
