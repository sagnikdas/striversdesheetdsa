package com.practice.dsa.problems;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "ate";

        System.out.println("Are "+s1+" and "+s2+" Anagrams of each other?");
        if(checkAnagrams(s1, s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    private static boolean checkAnagrams(String s1, String s2) {
        int count[] = new int[26];
        if(s1.length()!=s2.length())
            return false;
        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        for(int i = 0; i < str1.length; i++){
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }
        for(int i =0; i <26; i++){
            if(count[i]!=0)
                return false;
        }

        return true;
    }
}
