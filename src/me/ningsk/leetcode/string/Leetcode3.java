package me.ningsk.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Leetcode3 {

    public static void main(String[] args) {
        String s = "pwwkew";
        int result = new Leetcode3.Solution().lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            if (s.length() == 0) {
                return max;
            }
            // 双指针解法 left代表左边界，right代表有边界 map用来存储边界内的内容
            // 其中map key是 字符值， value是索引
            // 每次更新left的值得时候，分别取出当前的字符值对应的索引跟left进行对比，更新最大值为left，相当于左滑块滑动
            Map<Character, Integer> map = new HashMap<>();
            for (int left = 0, right = 0; right < s.length(); right++) {
                Character key = s.charAt(right);
                if (map.containsKey(key)) {
                    left = Math.max(map.get(key), left);
                }
                max = Math.max(max, right - left + 1);
                map.put(key, right + 1);
            }
            return max;
        }
    }

}
