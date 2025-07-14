package interview;

import java.util.*;

/**
 * Tech.java
 * 
 * This file contains your practice code for sorting:
 * - Integers using Comparator and lambda
 * - Custom objects PersonScore sorted by score, name, or combined
 * 
 * I've kept your original code style and added explanations,
 * showing best practice alternatives and improvements.
 */
class PersonScore {
    String name;
    int score;

    public PersonScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        // So we can print PersonScore easily instead of manual concat
        return name + " -> " + score;
    }
}

public class Tech {

    public static void main(String[] args) {

        // ========== PART 1: INTEGER SORTING ==========
        // Your original integer list and comparator example:

        List<Integer> testList = new ArrayList<>();
        testList.add(56);
        testList.add(56);
        testList.add(50);
        testList.add(58);
        testList.add(49);

        System.out.println("Before sorting integers: " + testList);

        // This is your comparator object that sorts integers ascending:
        Comparator<Integer> intComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b; // Simple numeric comparison
            }
        };

        // Sorting the list using the comparator you wrote
        Collections.sort(testList, intComparator);

        System.out.println("After sorting integers: " + testList);

        // === Mentor Note ===
        // This works perfectly for numbers.
        // You can also write this more concisely with lambda:
        // testList.sort((a, b) -> a - b);
        // or even simpler using Integer's natural order:
        // Collections.sort(testList);
        // But your explicit comparator is great for learning!

        System.out.println();

        // ========== PART 2: PERSONSCORE OBJECTS & SORTING ==========
        // You created PersonScore objects like this:

        PersonScore ps1 = new PersonScore("Edwin", 3);
        PersonScore ps2 = new PersonScore("Tom", 5);
        PersonScore ps3 = new PersonScore("Bob", 2);
        PersonScore ps4 = new PersonScore("Jack", 1);
        PersonScore ps5 = new PersonScore("Jim", 4);

        List<PersonScore> personList = new ArrayList<>();
        personList.add(ps1);
        personList.add(ps2);
        personList.add(ps3);
        personList.add(ps4);
        personList.add(ps5);

        // You printed them before sorting (good habit)
        System.out.println("Before sorting PersonScore:");
        for (PersonScore p : personList) {
            System.out.println(p.name + " -> " + p.score);
        }

        // === Mentor Note ===
        // Printing PersonScore manually is okay,
        // but adding toString() makes code cleaner:
        // System.out.println(p);

        // === Your original comparator for sorting by score: ===
        Comparator<PersonScore> scoreComparator = new Comparator<PersonScore>() {
            @Override
            public int compare(PersonScore a, PersonScore b) {
                // Subtract scores to sort ascending by score
                return a.score - b.score;
            }
        };

        // Sorting personList using your comparator
        Collections.sort(personList, scoreComparator);

        System.out.println("\nAfter sorting by score (using comparator):");
        for (PersonScore p : personList) {
            System.out.println(p.name + " -> " + p.score);
        }

        // === Mentor Note ===
        // Great job! You defined a comparator object manually.
        // Later, you can simplify with lambdas:

        // Using lambda:
        personList.sort((a, b) -> a.score - b.score);

        System.out.println("\nAfter sorting by score (using lambda):");
        for (PersonScore p : personList) {
            System.out.println(p.name + " -> " + p.score);
        }

        // You also experimented with sorting by name:
        personList.sort((a, b) -> a.name.compareTo(b.name));

        System.out.println("\nAfter sorting by name:");
        for (PersonScore p : personList) {
            System.out.println(p.name + " -> " + p.score);
        }

        // === Mentor Note ===
        // Notice here you used String's compareTo to order alphabetically.
        // You cannot do a.name - b.name because names are Strings (text).
        // So compareTo() is the correct way.

        // === Advanced: Sort by score, then name if scores are equal ===
        personList.sort((a, b) -> {
            int res = Integer.compare(a.score, b.score);
            if (res == 0) {
                res = a.name.compareTo(b.name);
            }
            return res;
        });

        System.out.println("\nAfter sorting by score, then name (tie-break):");
        for (PersonScore p : personList) {
            System.out.println(p.name + " -> " + p.score);
        }

        // === Mentor Note ===
        // This is how you handle tie-breakers during sorting.
        // You first compare primary key (score), then secondary key (name).

        // === Sorting descending by score ===
        personList.sort((a, b) -> b.score - a.score);

        System.out.println("\nAfter sorting by score descending:");
        for (PersonScore p : personList) {
            System.out.println(p.name + " -> " + p.score);
        }

        // === Mentor Note ===
        // Descending order is easy by reversing subtraction.

        // === Bonus: Using Comparator helpers from Java 8+ ===
        personList.sort(Comparator.comparingInt(p -> p.score));
        System.out.println("\nSorted by score (using Comparator.comparingInt):");
        personList.forEach(System.out::println);

        personList.sort(Comparator.comparingInt((PersonScore p) -> p.score)
                                  .thenComparing(p -> p.name));
        System.out.println("\nSorted by score, then name (chained Comparator):");
        personList.forEach(System.out::println);

        // ===== SUMMARY =====
        /*
         * - Your approach with explicit Comparator class is solid for beginners.
         * - Lambdas make it shorter and more readable.
         * - Using Comparator.comparingInt and thenComparing is best practice for chaining.
         * - Always remember:
         *    - For numbers, subtraction in compare() works well.
         *    - For Strings, use compareTo().
         *    - To handle ties, chain comparisons inside compare().
         */

        // ========== END ==========
    }
}
