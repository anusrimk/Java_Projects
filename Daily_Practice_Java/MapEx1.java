package Daily_Practice_Java;

import java.util.*;

class MapEx1 {
    public static void main(String[] args) {
        System.out.println("Hash Map");

        // Creating a HashMap
        Map<String, String> map3 = new HashMap<>();
        map3.put("koala", "bamboo");
        map3.put("lion", "meat");
        map3.put("giraffe", "leaf");

        // Retrieving values from the map
        String food = map3.get("koala");
        System.out.println("Koala eats " + food);

        // Using getOrDefault to provide a default value
        System.out.println("Lion eats " + map3.getOrDefault("lion", "default"));
        System.out.println("Lion eats " + map3.get("lion"));
        System.out.println("Cow eats " + map3.getOrDefault("cow", "default"));
        System.out.println("Cow eats " + map3.get("cow"));

        // Adding a new key-value pair
        map3.put("cow", "grass");

        // Iterating over the entries in the map
        for (Map.Entry<String, String> me : map3.entrySet()) {
            System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
        }

        // Updating a value for an existing key
        map3.put("cow", "plants");

        // Iterating over the keys in the map
        for (String key : map3.keySet()) {
            System.out.println(key + " = " + map3.get(key));
        }

        // Checking if the map contains a specific key or value
        System.out.println("map3.containsKey(\"koala\"): " + map3.containsKey("koala"));
        System.out.println("map3.size(): " + map3.size());
        System.out.println("map3.containsValue(\"leaf\"): " + map3.containsValue("leaf"));

        // Removing a key-value pair
        System.out.println("Remove koala: " + map3.remove("koala"));

        // Replacing a value associated with a key
        System.out.println("Replace koala: " + map3.replace("koala", "gr"));
        System.out.println("Replace cow: " + map3.replace("cow", "gr"));

        // Attempting to replace a value for a non-existing key
        System.out.println("Replace value for non-existing key (koala): " + map3.replace("koala", "gr"));
        System.out.println("Replace value for existing key (cow): " + map3.replace("cow", "gr"));

        // Iterating over the map entries and printing key-value pairs
        for (Map.Entry<String, String> me : map3.entrySet()) {
            System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
        }

        // Removing a key-value pair using key and value
        System.out.println("Remove koala: " + map3.remove("koala")); // returns null if key doesn't exist
        System.out.println("Remove with key-value (cow, gr): " + map3.remove("cow", "gr"));

        // Printing the map
        System.out.println("Map3: " + map3);

        // Using putIfAbsent method
        System.out.println("Put if absent (cow, gr): " + map3.putIfAbsent("cow", "gr"));
        System.out.println("Map3 after putIfAbsent: " + map3);

        // Creating a new map and adding entries
        Map<String, String> map4 = new HashMap<>();
        map4.put("horse", "chickpea");
        map4.put("sparrow", "seeds");
        map4.put("giraffe", "tree leaves");
        map4.put("cow", null);
        map4.put(null, null); // null key and value are allowed

        // Printing map4
        System.out.println("Map4: " + map4);

        // Adding all entries from map4 to map3
        map3.putAll(map4);

        // Printing map3 after merging with map4
        System.out.println("Map3 after putAll(map4): " + map3);
    }
}



// import java.util.HashMap;
// import java.util.Map;

// class MapEx1 {
//     public static void main(String[] args) {
//         System.out.println("Hash Map");

//         Map<String, String> map3 = new HashMap<>();
//         map3.put("koala", "bamboo");
//         map3.put("lion", "meat");
//         map3.put("giraffe", "leaf");

//         String food = map3.get("koala");
//         System.out.println("Koala eats " + food);

//         System.out.println("Lion eats " + map3.getOrDefault("lion", "default"));
//         System.out.println("Lion eats " + map3.get("lion"));
//         System.out.println("Cow eats " + map3.getOrDefault("cow", "default"));
//         System.out.println("Cow eats " + map3.get("cow"));

//         map3.put("cow", "grass");

//         for (Map.Entry<String, String> me : map3.entrySet()) {
//             System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
//         }

//         map3.put("cow", "plants");

//         for (String key : map3.keySet()) {
//             System.out.println(key + " = " + map3.get(key));
//         }

//         System.out.println("map3.containsKey(\"koala\") " + map3.containsKey("koala"));
//         System.out.println("map3.size() " + map3.size());
//         System.out.println("map3.containsValue(\"leaf\") " + map3.containsValue("leaf"));

//         System.out.println("Remove " + map3.remove("koala"));
//         System.out.println("Replace (koala) " + map3.replace("koala", "gr"));
//         System.out.println("Replace (cow) " + map3.replace("cow", "gr"));
//     }
// }