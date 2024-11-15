// Check if two Strings are Anagrams of each other 
// Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the 
// two given strings are anagrams of each other or not. An anagram of a string is another string that 
// contains the same characters, only the order of characters can be different.

import java.util.HashMap;
import java.util.Scanner;

public class Problem14 {
    public static boolean isAnagram(String s, String t) {

        if(s.length()!= t.length()) return false;
        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
         for(int i=0; i<s.length();i++){
             if(map1.containsKey(s.charAt(i))) map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
             else map1.put(s.charAt(i),1);
        }
         for(int i=0; i<t.length();i++){
             if(map2.containsKey(t.charAt(i))) map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
             else map2.put(t.charAt(i),1);
        }

        for(char k: map1.keySet()){
            if(!map1.get(k).equals(map2.get(k))) return false; 
        }

        return true;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
        sc.close();
        
    }
}

// Time Complexity : O(n);
// Space Complexity : O(n + n);
