package behavioural.Iterator;

import java.util.List;

public class NamesRepo implements Container{
    String[] list = {"Luis","Hector","Alfonso"};

    @Override
    public Iterator getIterator() {
        return new IteratorImpl(List.of(list));
    }
}
