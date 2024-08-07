package rocks.zipcode;


import java.util.PriorityQueue;

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
    private PriorityQueue<PriorityElement<E>> queue;

    public ConcreteZPriorityQueue() {
        this.queue = new PriorityQueue<>();
    }


    @Override
    public void enqueue(E element, Integer priority) {
        queue.add(new PriorityElement<>(element, priority));
        // throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue(Integer priority) {
        for (PriorityElement<E> item : queue) {
            if (item.priority.equals(priority)){
                queue.remove(item);
                return item.element;
            }
        }
         throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek(Integer priority) {
        for (PriorityElement<E> item : queue) {
            if (item.priority.equals(priority)) {
                return item.element;
            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public int size() {
        return queue.size();
        //throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public int size(Integer priority) {
        int count = 0;
        for (PriorityElement<E> item : queue) {
            if (item.priority.equals(priority)) {

            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
        //throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
