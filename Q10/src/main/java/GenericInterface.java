public interface GenericInterface<T> {
    public void add(T item);
    public void display();
    public int getSize();
    public boolean checkEmpty();

    public T search(T item);

    public void sort();

    public void delete(int pos);
}