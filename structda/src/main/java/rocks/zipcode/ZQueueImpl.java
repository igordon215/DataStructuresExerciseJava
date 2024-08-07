package rocks.zipcode;

import java.util.ArrayDeque;

public class ZQueueImpl<E> implements ZQueue<E>{


    ArrayDeque<E> myDeque = new ArrayDeque<>();



    @Override
    public boolean isEmpty() {
        return (myDeque.isEmpty());
        // throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        return myDeque.size();
        // throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void enqueue(E element) {
        myDeque.add(element);
        // throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue() {
        return myDeque.remove();
        // throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek() {
        return myDeque.peek();
        // throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

}
