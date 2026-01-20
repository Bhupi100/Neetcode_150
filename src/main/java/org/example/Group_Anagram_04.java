package org.example;

import java.util.*;

public class Group_Anagram_04 {

    public static void main(String[] args) {
        Group_Anagram_04 obj = new Group_Anagram_04();
        String[] str = {"act","pots","tops","cat","stop","hat"};
        System.out.println(obj.groupAnagrams(str));
    }

    public List<List<String>> groupAnagrams(String[] strs){

        Map<String,List<String>> tempMap =  new HashMap<>(); //For storing String values
        for (int i = 0;i<strs.length;i++){
            char[] ch = strs[i].toCharArray(); // converting str[i] to char Array ex : act -> {a,c,t}
            Arrays.sort(ch); //Sorting
            String sorted = new String(ch); //Converting char array to String
            tempMap.putIfAbsent(sorted,new ArrayList<>()); //Put the sorted string in map if not present and
            // created a new Arraylist inside Map
            tempMap.get(sorted).add(strs[i]);// add it to the same ArrayList
        }
        return new ArrayList<>(tempMap.values());
    }
}
