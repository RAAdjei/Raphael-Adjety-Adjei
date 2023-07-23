package adjeiQueue;

public class bookInventory<T> implements QueueDsa<T> {
    private int count;
    private linearNode<T> head, tail;

    public void linkedQueue(){
        count = 0;
        head = tail = null;
    }


    @Override
    public void enqueue(T element) {
        linearNode<T> node = new linearNode<T>(element);

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T first() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
