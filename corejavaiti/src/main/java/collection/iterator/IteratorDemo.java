package collection.iterator;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Java");
        words.add("Programming");
        words.add("i");
        words.add("Fun and");
        words.add("Easy");
        Iterator<String> iterator = words.listIterator();
        Iterator<String> iterator2 = words.listIterator();
        iterator.next();
        iterator.remove();//exception should next
//        iterator2.next();
        iterator.forEachRemaining(System.out::println);
        while (iterator.hasNext())
        {
            String element=iterator.next();
            System.out.println(element);
        }

    }
}
