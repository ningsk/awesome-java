package me.ningsk.leetcode.editor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,1,1,3};
        boolean result = new UniqueNumberOfOccurrences().uniqueOccurrences(array);
    }

    public boolean uniqueOccurrences(int[] arr) {
        // 解题思路：HashMap 用key去存单值， value为单个值出现的次数
        // 利用set独一无二的属性，跟HashMap的size值进行比较 size 相等就是独一无二
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            set.add(entry.getValue());
        }

        return set.size() == map.size();

    }

}

