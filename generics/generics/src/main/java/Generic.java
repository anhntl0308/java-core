import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Generic <E> implements GenericInterface<E>{

    private List<E> list;

    public Generic(){
        list = new LinkedList<E>();
    }


    @Override
    public void add(E item) {
        list.add(item);
    }

    @Override
    public void display() {
        list.forEach(System.out::println);
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public boolean checkEmpty() {
        return list.isEmpty();
    }

    @Override
    public void delete(int pos) {
        list.remove(pos);
    }
}
