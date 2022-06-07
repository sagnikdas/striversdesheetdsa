package com.practice.dsa.problems;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String words[] = {"ate", "debate", "eat", "cat", "act"};

        List<List<String>> result = getGroupAnagrams(words);
        System.out.println(result);
    }

    private static List<List<String>> getGroupAnagrams(String[] words) {
        if(words.length == 0)
            return new LinkedList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String word: words){
            char[] array = word.toCharArray();
            Arrays.sort(array);

            String key = new String(array);

            if(!map.containsKey(key))
                map.put(key, new LinkedList<String>());

            map.get(key).add(word);
        }

        return new LinkedList<>(map.values());
    }
}
