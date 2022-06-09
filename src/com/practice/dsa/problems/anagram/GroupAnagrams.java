package com.practice.dsa.problems.anagram;

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

        //Iterate over the words
        for(String word: words){
            //take each word and sort it by its characters - "cat" -> "act"
            char[] array = word.toCharArray();
            Arrays.sort(array);

            String key = new String(array);

            //populate a map, if the key is not present in it
            if(!map.containsKey(key))
                map.put(key, new LinkedList<String>());

            //helps in grouping the anagrams - (key -> list of String values)
            map.get(key).add(word);
        }

        return new LinkedList<>(map.values()); // returns a List of List<String>
    }
}
