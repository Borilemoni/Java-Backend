import java.util.Set;
import java.util.HashSet; // Set (мновсетво, в което нямаме право на дубликации) {3, 5, 7}
import java.util.LinkedHashSet; // Linked List (само че е set)
import java.util.List;
import java.util.LinkedList; // Linked list
import java.util.ArrayList; // C++ vector
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class Example2 {
    public static void main(String[] args) {
        // ArrayList Example
        List<String> arrayList = new ArrayList<>(); // arrayList >> array
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        System.out.println("ArrayList Elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\n------------------------\n");

        // HashMap Example (key: value)
        // real use case of HashMap
        // Map<String, String> users = new HashMap<>();
        // users.put("viktor02", "123456789");

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 1995);
        hashMap.put("Python", 1991);
        hashMap.put("C++", 1983);
        hashMap.put("JavaScript", 1995);

        System.out.println("Programming Languages and their Release Years:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\n------------------------\n");

        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red"); // Duplicate elements are ignored in HashSet      

        System.out.println("Colors in HashSet:");
        for (String color : hashSet) {
            System.out.println(color);
        }

        System.out.println("\n------------------------\n");

        // Sorting ArrayList using Collections.sort() method
        // if (o2.length() > o1.length) return 0; else return 1; // equivalent to ternary expression down
        Collections.sort(arrayList, (o1, o2) -> o2.length() > o1.length() == true ? 1 : -1); // ternary

        System.out.println("Sorted ArrayList Elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
  }
}
