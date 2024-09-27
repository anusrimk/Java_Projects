package Daily_Practice_Java;
import java.util.*;

class CollectionsSortEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("TT");
        list1.add("SS");
        list1.add("RR");
        list1.add("BB");
        list1.add("AA");
        list1.add("CC");

        System.out.println("Original list: " + list1);

        Collections.sort(list1);
        System.out.println("Sorted list in ascending order: " + list1);
        
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Sorted list in descending order: " + list1);

        Collections.sort(list1);
        System.out.println("List sorted again in ascending order: " + list1);

        String searchElement = "CC";
        int index = Collections.binarySearch(list1, searchElement);
        
        if (index >= 0) {
            System.out.println("Element '" + searchElement + "' found at index: " + index);
        } else {
            System.out.println("Element '" + searchElement + "' not found. Returned index: " + index);
        }
    }
}
