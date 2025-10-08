package com.example.oop;

import java.util.*;

/**
 * Demonstrates Java Collections Framework
 * Collections are data structures to store and manipulate groups of objects
 */
public class CollectionsExamples {

    /**
     * LIST - Ordered collection that allows duplicates
     * Think of it as a dynamic array
     */
    public static class ListExamples {

        public List<String> createArrayList() {
            // ArrayList - fast for accessing elements by index
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Apple");  // Duplicates allowed!
            return fruits;
        }

        public List<String> createLinkedList() {
            // LinkedList - fast for adding/removing elements
            List<String> tasks = new LinkedList<>();
            tasks.add("Task 1");
            tasks.add("Task 2");
            tasks.add("Task 3");
            return tasks;
        }

        public void demonstrateListOperations() {
            List<Integer> numbers = new ArrayList<>();

            // Adding elements
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(1, 15);  // Add at specific index

            // Accessing elements
            int first = numbers.get(0);
            int size = numbers.size();

            // Modifying elements
            numbers.set(0, 5);  // Replace element at index 0

            // Removing elements
            numbers.remove(0);           // Remove by index
            numbers.remove(Integer.valueOf(20));  // Remove by value

            // Checking existence
            boolean contains15 = numbers.contains(15);

            // Iterating
            for (Integer num : numbers) {
                System.out.println(num);
            }
        }
    }

    /**
     * SET - Unordered collection that does NOT allow duplicates
     * Think of it as a mathematical set
     */
    public static class SetExamples {

        public Set<String> createHashSet() {
            // HashSet - fast, no order guaranteed
            Set<String> uniqueNames = new HashSet<>();
            uniqueNames.add("Alice");
            uniqueNames.add("Bob");
            uniqueNames.add("Alice");  // Won't be added again!
            // Size will be 2, not 3
            return uniqueNames;
        }

        public Set<Integer> createTreeSet() {
            // TreeSet - keeps elements sorted
            Set<Integer> sortedNumbers = new TreeSet<>();
            sortedNumbers.add(5);
            sortedNumbers.add(1);
            sortedNumbers.add(3);
            // Will be stored as: 1, 3, 5 (sorted)
            return sortedNumbers;
        }

        public Set<String> createLinkedHashSet() {
            // LinkedHashSet - maintains insertion order
            Set<String> orderedSet = new LinkedHashSet<>();
            orderedSet.add("First");
            orderedSet.add("Second");
            orderedSet.add("Third");
            // Maintains order: First, Second, Third
            return orderedSet;
        }

        public void demonstrateSetOperations() {
            Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
            Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

            // Union (all elements from both sets)
            Set<String> union = new HashSet<>(set1);
            union.addAll(set2);  // {A, B, C, D}

            // Intersection (common elements)
            Set<String> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);  // {B, C}

            // Difference (elements in set1 but not in set2)
            Set<String> difference = new HashSet<>(set1);
            difference.removeAll(set2);  // {A}
        }
    }

    /**
     * MAP - Key-Value pairs
     * Think of it as a dictionary
     */
    public static class MapExamples {

        public Map<String, Integer> createHashMap() {
            // HashMap - fast, no order guaranteed
            Map<String, Integer> ages = new HashMap<>();
            ages.put("Alice", 25);
            ages.put("Bob", 30);
            ages.put("Charlie", 35);
            ages.put("Alice", 26);  // Updates Alice's age to 26
            return ages;
        }

        public Map<String, String> createTreeMap() {
            // TreeMap - keeps keys sorted
            Map<String, String> countries = new TreeMap<>();
            countries.put("USA", "Washington DC");
            countries.put("UK", "London");
            countries.put("France", "Paris");
            // Keys will be sorted: France, UK, USA
            return countries;
        }

        public Map<String, Double> createLinkedHashMap() {
            // LinkedHashMap - maintains insertion order
            Map<String, Double> prices = new LinkedHashMap<>();
            prices.put("Apple", 1.50);
            prices.put("Banana", 0.75);
            prices.put("Orange", 1.25);
            // Maintains order: Apple, Banana, Orange
            return prices;
        }

        public void demonstrateMapOperations() {
            Map<String, Integer> scores = new HashMap<>();

            // Adding key-value pairs
            scores.put("Alice", 95);
            scores.put("Bob", 87);
            scores.put("Charlie", 92);

            // Getting values
            int aliceScore = scores.get("Alice");
            int defaultScore = scores.getOrDefault("David", 0);

            // Checking existence
            boolean hasAlice = scores.containsKey("Alice");
            boolean hasScore95 = scores.containsValue(95);

            // Removing entries
            scores.remove("Bob");

            // Iterating over keys
            for (String name : scores.keySet()) {
                System.out.println(name);
            }

            // Iterating over values
            for (Integer score : scores.values()) {
                System.out.println(score);
            }

            // Iterating over entries
            for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getScore());
            }
        }
    }

    /**
     * QUEUE - FIFO (First In, First Out) data structure
     * Think of it as a line at a store
     */
    public static class QueueExamples {

        public Queue<String> createQueue() {
            Queue<String> customerLine = new LinkedList<>();
            customerLine.offer("Customer 1");  // add to queue
            customerLine.offer("Customer 2");
            customerLine.offer("Customer 3");

            // peek() - look at first without removing
            String first = customerLine.peek();

            // poll() - remove and return first
            String served = customerLine.poll();

            return customerLine;
        }

        public PriorityQueue<Integer> createPriorityQueue() {
            // PriorityQueue - elements come out in priority order (smallest first by default)
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(5);
            pq.offer(1);
            pq.offer(3);

            // Will come out as: 1, 3, 5 (sorted order)
            return pq;
        }
    }

    /**
     * Real-world example: Student Grade Management System
     */
    public static class StudentGradeSystem {
        private Map<String, List<Integer>> studentGrades;
        private Set<String> enrolledStudents;

        public StudentGradeSystem() {
            this.studentGrades = new HashMap<>();
            this.enrolledStudents = new HashSet<>();
        }

        public void enrollStudent(String studentName) {
            if (enrolledStudents.add(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());
                System.out.println(studentName + " enrolled successfully");
            } else {
                System.out.println(studentName + " is already enrolled");
            }
        }

        public void addGrade(String studentName, int grade) {
            if (enrolledStudents.contains(studentName)) {
                studentGrades.get(studentName).add(grade);
                System.out.println("Grade " + grade + " added for " + studentName);
            } else {
                System.out.println("Student not found");
            }
        }

        public double getAverageGrade(String studentName) {
            if (!enrolledStudents.contains(studentName)) {
                return 0.0;
            }

            List<Integer> grades = studentGrades.get(studentName);
            if (grades.isEmpty()) {
                return 0.0;
            }

            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.size();
        }

        public List<String> getAllStudents() {
            return new ArrayList<>(enrolledStudents);
        }

        public Map<String, Double> getAllAverages() {
            Map<String, Double> averages = new TreeMap<>();  // Sorted by name
            for (String student : enrolledStudents) {
                averages.put(student, getAverageGrade(student));
            }
            return averages;
        }
    }
}