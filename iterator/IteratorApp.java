package patternsP.iterator;

import patternsP.iterator.agregator.Tasks;
import patternsP.iterator.iterator.Iterator;

public class IteratorApp {

    public static void main(String[] args) {
        Tasks<String> agregate = new Tasks();
        Iterator<String> iterator = agregate.getIterator();

        while (iterator.hasNext()) {
            System.out.println( iterator.next());
        }
    }
}




