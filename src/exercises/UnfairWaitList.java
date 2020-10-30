package exercises;

class UnfairWaitList <E > extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        q.remove(element);
    }

    public void moveToBack(E element) {
        q.remove(element);
        q.add(element);
    }
}
