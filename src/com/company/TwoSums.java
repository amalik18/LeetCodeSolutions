package com.company;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        int [] toRet = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (i == j) {
                    break;
                }
                if ((nums[i] + nums[j]) == target) {
                    toRet[0] = i;
                    toRet[1] = j;
                    break;
                }
            }
        }
        return toRet;
    }

    /**
     * Time complexity : O(n)O(n). We traverse the list containing nn elements exactly twice. Since the hash table reduces the look up time to O(1), the time complexity is O(n).
     * Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly nn elements.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumTwoPassHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Time complexity : O(n) We traverse the list containing nn elements only once. Each look up in the table costs only O(1) time.
     * Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nn elements.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumOnePassHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
