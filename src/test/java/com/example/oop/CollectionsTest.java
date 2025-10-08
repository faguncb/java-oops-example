package com.example.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class CollectionsTest {

    @Test
    void testArrayList() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Duplicates allowed

        assertEquals(3, fruits.size());
        assertEquals("Apple", fruits.get(0));
        assertTrue(fruits.contains("Banana"));
    }

    @Test
    void testLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.addFirst(0);   // Add at beginning
        numbers.addLast(4);    // Add at end

        assertEquals(5, numbers.size());
        assertEquals(0, numbers.getFirst());
        assertEquals(4, numbers.getLast());
    }

    @Test
    void testHashSet() {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice");  // Won't be added (duplicate)

        assertEquals(2, uniqueNames.size());  // Only 2 elements
        assertTrue(uniqueNames.contains("Alice"));
        assertFalse(uniqueNames.contains("Charlie"));
    }

    @Test
    void testTreeSet() {
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(1);
        sortedSet.add(3);

        // TreeSet keeps elements sorted
        List<Integer> list = new ArrayList<>(sortedSet);
        assertEquals(Arrays.asList(1, 3, 5), list);
    }

    @Test
    void testHashMap() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Alice", 26);  // Updates Alice's age

        assertEquals(2, ages.size());
        assertEquals(26, ages.get("Alice"));
        assertEquals(30, ages.get("Bob"));
        assertNull(ages.get("Charlie"));
    }

    @Test
    void testMapOperations() {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington DC");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");

        // Test containsKey
        assertTrue(capitals.containsKey("USA"));
        assertFalse(capitals.containsKey("Germany"));

        // Test containsValue
        assertTrue(capitals.containsValue("Paris"));

        // Test getOrDefault
        assertEquals("Washington DC", capitals.getOrDefault("USA", "Unknown"));
        assertEquals("Unknown", capitals.getOrDefault("Germany", "Unknown"));

        // Test remove
        capitals.remove("France");
        assertFalse(capitals.containsKey("France"));
    }

    @Test
    void testQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        // peek() looks at first element without removing
        assertEquals("First", queue.peek());
        assertEquals(3, queue.size());

        // poll() removes and returns first element
        assertEquals("First", queue.poll());
        assertEquals(2, queue.size());
        assertEquals("Second", queue.peek());
    }

    @Test
    void testPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);

        // Elements come out in sorted order
        assertEquals(1, pq.poll());
        assertEquals(3, pq.poll());
        assertEquals(5, pq.poll());
    }

    @Test
    void testStudentGradeSystem() {
        CollectionsExamples.StudentGradeSystem system =
                new CollectionsExamples.StudentGradeSystem();

        // Enroll students
        system.enrollStudent("Alice");
        system.enrollStudent("Bob");
        system.enrollStudent("Alice");  // Won't enroll again

        // Add grades
        system.addGrade("Alice", 90);
        system.addGrade("Alice", 85);
        system.addGrade("Alice", 95);

        system.addGrade("Bob", 80);
        system.addGrade("Bob", 90);

        // Test averages
        assertEquals(90.0, system.getAverageGrade("Alice"), 0.01);
        assertEquals(85.0, system.getAverageGrade("Bob"), 0.01);

        // Test getAllStudents
        List<String> students = system.getAllStudents();
        assertEquals(2, students.size());
        assertTrue(students.contains("Alice"));
        assertTrue(students.contains("Bob"));
    }

    @Test
    void testListIteration() {
        List<String> colors = Arrays.asList("Red", "Green", "Blue");

        List<String> collected = new ArrayList<>();
        for (String color : colors) {
            collected.add(color.toUpperCase());
        }

        assertEquals(Arrays.asList("RED", "GREEN", "BLUE"), collected);
    }

    @Test
    void testMapIteration() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);

        // Iterate over entries
        int total = 0;
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            total += entry.getValue();
        }

        assertEquals(274, total);
    }

    @Test
    void testCollectionConversion() {
        // List to Set (removes duplicates)
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3);
        Set<Integer> setWithoutDuplicates = new HashSet<>(listWithDuplicates);
        assertEquals(3, setWithoutDuplicates.size());

        // Set to List
        List<Integer> backToList = new ArrayList<>(setWithoutDuplicates);
        assertEquals(3, backToList.size());
    }
}