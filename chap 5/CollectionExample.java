// que 127: Write a program illustrating following framework. a)Array List b)Vector

import java.util.ArrayList;
import java.util.Vector;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        System.out.println("ArrayList elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Vector example
        Vector<String> vector = new Vector<>();
        vector.add("Element A");
        vector.add("Element B");
        vector.add("Element C");

        System.out.println("Vector elements:");
        for (String element : vector) {
            System.out.println(element);
        }
    }
}
