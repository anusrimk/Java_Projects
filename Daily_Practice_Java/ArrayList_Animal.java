package Daily_Practice_Java;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Animal {
    public static void main(String[] args) {
        ArrayList<String> animals1 = new ArrayList<>();

        animals1.add("Cat");
        animals1.add("Dog");
        animals1.add("Cow");
        animals1.add("Lion");

        System.out.println("animals1: " + animals1);

        animals1.add(0, "Tiger");

        animals1.add(3, "Zebra");

        System.out.println("animals1 after adding Tiger and Zebra: " + animals1);



        ArrayList<String> animals2 = new ArrayList<>();
        animals2.add("Kangaroo");
        animals2.add("Donkey");
        animals2.add("Cow");

        animals1.addAll(animals2);

        System.out.println("Element at index 2: " + animals1.get(2));

        System.out.println("Index of first occurrence of Cow: " + animals1.indexOf("Cow"));

        System.out.println("Index of last occurrence of Cow: " + animals1.lastIndexOf("Cow"));

        System.out.println("Is Dog in the list? " + animals1.contains("Dog"));

        System.out.println("Is Rat in the list? " + animals1.contains("Rat"));

        System.out.println("Is the list empty? " + animals1.isEmpty());

        System.out.println("Number of elements in the list: " + animals1.size());

        animals1.remove("Cow");

        animals1.remove(2);

        animals1.add(2, "Ant");

        animals1.add(2, "Antelope");

        System.out.println("Using FOR loop:");
        for (int i = 0; i < animals1.size(); i++) {
            System.out.println(animals1.get(i));
        }

        // manual index management use karta hai
        //The colon (:) symbol is used to separate the variable declaration from the collection being iterated.
        System.out.println("Another for loop (using : operator):");
        for (String animal : animals1) {
            System.out.println(animal);
        }

        System.out.println("Using an Iterator:");
        for (int i = 0; i < animals1.size(); i++) {
            System.out.println(animals1.get(i));
        }

        System.out.println("Using a List Iterator:");
        ListIterator<String> listItr = animals1.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        
    }
}
