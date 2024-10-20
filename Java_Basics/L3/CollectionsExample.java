import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;

public class CollectionsExample {

  public static void main(String[] args) {
    // ArrayList Example
    List<String> arrayList = new ArrayList<>();
    List<Integer> numbers = new LinkedList<>();
    
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Orange");
    arrayList.add("Grapes");

    System.out.println("ArrayList Elements:");
    for (String fruit : arrayList) {
      System.out.println(fruit);
    }

    System.out.println("\n------------------------\n");

    // HashMap Example
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Java", 1995);
    hashMap.put("Python", 1991);
    hashMap.put("C++", 1983);
    hashMap.put("JavaScript", 1995);

    // host: 127.0.0.1, port: 5432, user: Monika, password: ...

    Map<String, String> dbConnection = new HashMap<>();
    dbConnection.put("host", "127.0.0.1"); // ...

    dbConnection.get("host"); // -> 127.0.0.1

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
    Collections.sort(arrayList);

    System.out.println("Sorted ArrayList Elements:");
    for (String fruit : arrayList) {
      System.out.println(fruit);
    }
  }
}
