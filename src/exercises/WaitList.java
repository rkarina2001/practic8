package exercises;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> q;

    public WaitList() {
        q = new ConcurrentLinkedQueue<>();
    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.q = content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + q +
                '}';
    }

    @Override
    public void add(E element) {
        q.add(element);
    }

    @Override
    public E remove() {
        return q.poll();
    }

    @Override
    public boolean contains(E element) {
        return q.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return q.removeAll(c);
    }

    @Override
    public boolean isEmpty() {
        return q.isEmpty();
    }
}
