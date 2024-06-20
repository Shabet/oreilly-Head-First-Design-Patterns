package section06.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {

    public static void main(String[] args) {
        String[] strings = {"hello", "world", "!", "bye"};

        Vector<String> v = new Vector<>(Arrays.asList(strings));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
