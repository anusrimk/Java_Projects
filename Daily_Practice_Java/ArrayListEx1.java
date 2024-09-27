package Daily_Practice_Java;
// import java.util.*;

// public class ArrayListEx1 {
//     public static void main(String[] args) {
//         //List l1 store String Objects 
//         ArrayList<String> list1 = new ArrayList<String>();

//         // Add elements in the list
//         list1.add("Tom"); // Index 0
//         list1.add("Shyam"); // Index 1
//         list1.add("Ravi"); // Index 2
//         list1.add("Sam"); // Index 3
//         list1.add("Pam"); // Index 4
//         list1.add("Ro"); // Index 5, Duplicate items are allowed

//         System.out.println("** Add elements in list1 using add(index, element) **");
//         list1.add(1, "Naina"); // Insert "Naina" at index 1

//         // It is used to insert the specified element at the specified index in the list
//         // list1.add(10); // Error, as only string objects are allowed in list1
//         // list1.add(2.5); // Error, as only string objects are allowed in list1

//         System.out.println("** Print elements in the list the way we added ***");
//         System.out.println("List1: " + list1);
//     }
// }
import java.util.*;
public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Mango");
        list1.add("Papaya");
        list1.add("Watermelon");

        System.out.println("****Add Elements in list1 using add(index,element)****");
        list1.add(1, "Muskmelon");

        System.out.println("****PRINT elementsn in list1 using add(index,element)****");
        System.out.println("List1 "+list1);

        System.out.println("*****Get (Read) elements from the list1 ****");
        System.out.println("list1(3)"+list1.get(3));
        
        System.out.println("****Updating Elements****");
        list1.set(2,"Pear");
        System.out.println("Updated List: "+list1);

        System.out.println("****Removing Elements****");
        list1.remove(3);
        System.out.println("List1 after removing element at index 3: "+list1);

        list1.remove("Papaya");
        System.out.println("List1 after removing element Papaya: "+list1);

        // *****Clear all elements in a list****
        // list1.clear()

        System.out.println("****Contains****");
        if(list1.contains("Mango"))
            System.out.println("Mango is in the list.");
        else    
            System.out.println("Mango is not in the list.");
        if (list1.contains("Dragonfruit")) 
            System.out.println("Dragonfruit is in the list.");
        else
            System.out.println("Dragonfruit is not in the list.");
        
        System.out.println("**** Iterate ArrayList using basic for loop ****");
        for(int i= 0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        System.out.println("**** Iterate ArrayList using for each loop ****");
        for(String str: list1)
            System.out.println(str);
        

        System.out.println("**** Iterating eith Iterator ****");
        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Watermelon"))
                itr.remove();
        }

        System.out.println("list1 after iterating sing iterator "+list1);
        ListIterator<String> listItr = list1.listIterator();
        System.out.println("=============Forward==============");
        while(listItr.hasNext()){
            System.out.println(listItr.next());
        }
        
        System.out.println("=============Backward==============");

        while (listItr.hasPrevious()) {
            System.out.println(listItr.hasPrevious());
        }

        System.out.println("*****isEmpty()******");
        if(list1.isEmpty())
            System.out.println("List is empty");
        else
            System.out.println("List is not empty");
        
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("AAA");
        al1.add("BBB");
        al1.add("CCC");
        al1.add("DDD");
        ArrayList<String> al2= new ArrayList<String>();
        System.out.println(al2);
    }
}