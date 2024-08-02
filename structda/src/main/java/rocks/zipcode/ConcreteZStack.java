package rocks.zipcode;

import java.util.ArrayDeque;

public class ConcreteZStack<E> implements ZStack<E> {

    ArrayDeque<E> myDeque = new ArrayDeque<>();

    @Override
    public void push(E item) {
        myDeque.push(item);
    }

    @Override
    public E pop() {
        return myDeque.pop();
    }

    @Override
    public E peek() {
        return myDeque.peek();
    }

    @Override
    public boolean isEmpty() {
        if (myDeque.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return myDeque.size();
    }

}
