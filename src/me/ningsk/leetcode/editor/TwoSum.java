package me.ningsk.leetcode.editor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,4,5,8,12};
        int target = 9;
        int[] result = new TwoSum.Solution().twoNums(nums, target);
        System.out.println(Arrays.toString(result));
    }


    static class Solution {
        public int[] twoNums(int[]nums, int target) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (map.containsKey(diff)) {
                    result[0] = map.get(diff);
                    result[1] = i;
                    return result;
                }
                map.put(nums[i], i);
            }
            return result;
        }
    }

}
