package org.example;

import java.util.Arrays;

public class Valid_Anagram_02 {

    public static void main(String[] args) {
        Valid_Anagram_02 obj= new Valid_Anagram_02();
        String s = "racecar";
        String t = "carrace";
        System.out.println(obj.isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);

        for (int i = 0; i < s.length(); i++) {
            if (sch[i] != tch[i]) return false;
        }
        return true;

        // if(s.length() != t.length()) return false;

        // int[] arr = new int[26];

        // for(int i = 0;i<s.length();i++){
        //     arr[s.charAt(i) - 'a']++;
        //     arr[t.charAt(i) - 'a']--;
        // }
        // for(int n : arr){
        //     if(n!=0) return false;
        // }
        //return true;
    }
}
