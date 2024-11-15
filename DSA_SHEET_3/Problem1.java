import java.util.Scanner;
import java.util.HashMap;

class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(isAnagram(s, t));
        sc.close();
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
         for(int i=0; i<s.length();i++){
             map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length();i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }

        for(char k: map1.keySet()){
            if(!map1.get(k).equals(map2.get(k))) return false; 
        }
        return true;
    }
}