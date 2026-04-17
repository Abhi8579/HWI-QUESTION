/*
Problem: Longest Consecutive Sequence
LeetCode: 128
Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all numbers to set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check each number
        for (int num : set) {

            // If previous number not present
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
