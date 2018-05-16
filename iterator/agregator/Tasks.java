package patternsP.iterator.agregator;

import patternsP.iterator.iterator.Iterator;

public class Tasks<T> implements Container<T> {
    String[] takes = {"Build the house", "give birth", "growing tree"};
    @Override
    public Iterator<T> getIterator() {
        return new TaskIterator<>();
    }

    private class TaskIterator<T> implements Iterator<T> {
        int index = 0;
        @Override
        public boolean hasNext() {
            if (index < takes.length) {
                return true;
            }
            return false;
        }
        @Override
        public T next() {
            return (T)takes[index++];
        }
    }
}