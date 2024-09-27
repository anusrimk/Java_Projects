package Daily_Practice_Java;

import java.util.*;
class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        
        h.add("BB");
        h.add("AA");
        h.add("DD");
        h.add("CC");
        
        System.out.println(h.add("BB"));
        System.out.println(h);
        System.out.println("List contains DD or not : " +h.contains("DD"));
        
        h.remove("AA");
        System.out.println("List after removing AA : " +h);
        System.out.println("Iterating through list : ");
        
        Iterator<String> it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println();
        
        System.out.println("Using an enhanced for loop for iterating : ");
        for(String st : h){
            System.out.print(st + ", ");
        }
    }
}
