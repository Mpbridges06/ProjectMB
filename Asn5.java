package module5;

import java.util.ArrayList; // Import the ArrayList class

public class Asn5 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Create an ArrayList of Integers
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        // Display the original contents using a for loop
        System.out.println("String ArrayList:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("\nInteger ArrayList:");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

        // Display elements using enhanced for-each loop
        System.out.println("\nString ArrayList (Enhanced For Loop):");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        System.out.println("\nInteger ArrayList (Enhanced For Loop):");
        for (int num : integerList) {
            System.out.println(num);
        }

        // Display elements using forEach method
        System.out.println("\nString ArrayList (forEach Method):");
        stringList.forEach(System.out::println);

        System.out.println("\nInteger ArrayList (forEach Method):");
        integerList.forEach(System.out::println);

        // Try additional ArrayList methods
        // 1st Operation: Remove an element from stringList
        stringList.remove("Orange");

        // 2nd Operation: Add a new element to integerList
        integerList.add(50);

        // 3rd Operation: Modify an element using set()
        stringList.set(1, "Strawberry"); // Replaces "Banana" with "Strawberry"
        integerList.set(0, 100); // Replaces 10 with 100

        // 4th Operation: Clear the entire list (just for demonstration)
        ArrayList<String> tempList = new ArrayList<>(stringList); // Backup before clearing
        stringList.clear(); // Clears all elements from stringList

        // Display modified lists
        System.out.println("\nString ArrayList after removal, modification, and clearing:");
        if (stringList.isEmpty()) {
            System.out.println("The list is now empty.");
        } else {
            stringList.forEach(System.out::println);
        }

        System.out.println("\nInteger ArrayList after addition and modification:");
        integerList.forEach(System.out::println);

        // Restore stringList and display again
        stringList.addAll(tempList);
        System.out.println("\nRestored String ArrayList:");
        stringList.forEach(System.out::println);
    }
}
