package patternsP.iterator.agregator;

import patternsP.iterator.iterator.Iterator;

public interface Container<T> {
    Iterator<T> getIterator();
}