package behavioural.Iterator;

import java.util.List;

public class IteratorImpl implements Iterator{

    List list;

    public IteratorImpl(List list) {
        this.list = list;
    }

    int index;
    @Override
    public boolean hasNext() {
        if(index < list.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return list.get(index++);
        }
        return null;
    }
}
