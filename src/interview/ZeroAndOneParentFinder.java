package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 🔍 Problem: Zero and One Parent Finder
 *
 * Given a list of (parent, child) integer pairs representing family relationships,
 * write a function that returns two lists:
 *
 * 1️⃣ All individuals with zero known parents.
 * 2️⃣ All individuals with exactly one known parent.
 *
 * ✅ Input:
 * int[][] pairs = {
 *     {5, 6}, {1, 3}, {2, 3}, {3, 6}, {15, 12},
 *     {5, 7}, {4, 5}, {4, 9}, {9, 12}, {30, 16}
 * };
 *
 * ✅ Expected Output:
 * [
 *   [1, 2, 4, 15, 30],  // zero parents
 *   [5, 7, 9, 16]       // one parent
 * ]
 */
public class ZeroAndOneParentFinder {

    public static void main(String[] args) {
        int[][] pairs = {
            {5, 6}, {1, 3}, {2, 3}, {3, 6},
            {15, 12}, {5, 7}, {4, 5}, {4, 9},
            {9, 12}, {30, 16}
        };

        List<List<Integer>> result = findNodesWithZeroAndOneParents(pairs);
        System.out.println("Zero-parent individuals: " + result.get(0));
        System.out.println("One-parent individuals: " + result.get(1));
    }

    /**
     * 🚀 Returns a list of two lists:
     * [0] → individuals with zero parents
     * [1] → individuals with exactly one parent
     */
    public static List<List<Integer>> findNodesWithZeroAndOneParents(int[][] pairs) {
        List<Integer> oneParent = new ArrayList<>();
        List<Integer> zeroParent = new ArrayList<>();
        Map<Integer, Integer> parentCount = new HashMap<>();
        Set<Integer> uniqueIndividuals = new HashSet<>();

        // Step 1: Count parents and gather all individuals
        for (int[] pair : pairs) {
            int parent = pair[0];
            int child = pair[1];

            uniqueIndividuals.add(parent);
            uniqueIndividuals.add(child);

            parentCount.put(child, parentCount.getOrDefault(child, 0) + 1);
        }

        // Step 2: Determine individuals with 0 or 1 parent
        for (int person : uniqueIndividuals) {
            if (!parentCount.containsKey(person)) {
                zeroParent.add(person);
            } else if (parentCount.get(person) == 1) {
                oneParent.add(person);
            }
        }

        return Arrays.asList(zeroParent, oneParent);
    }
}
