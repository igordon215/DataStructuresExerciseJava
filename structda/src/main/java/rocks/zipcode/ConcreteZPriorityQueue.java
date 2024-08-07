package rocks.zipcode;





class PriorityElement<E> implements Comparable<PriorityElement<E>> {
    E element;
    Integer priority;

    PriorityElement(E element, Integer priority) {
        this.element = element;
        this.priority = priority;
    }


    @Override
    public int compareTo(PriorityElement<E> o) {
        return this.priority.compareTo(o.priority);
    }
}




public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E>{


    @Override
    public void enqueue(E element, Integer priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue(Integer priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek(Integer priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public int size(Integer priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
