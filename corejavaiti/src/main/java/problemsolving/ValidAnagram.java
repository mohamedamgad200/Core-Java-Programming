package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1="rat";
        String s2="car";
        boolean result=checkValidAnagram(s1,s2);
        System.out.println(result);
    }
    public static boolean checkValidAnagram(String s1,String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.replace(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (char c : s2.toCharArray()) {
            if (map2.containsKey(c)) {
                map2.replace(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }
        for (char c : s1.toCharArray()) {
            if (!map2.containsKey(c) || !map1.get(c).equals(map2.get(c))) {
                return false;
            }
        }
        return true;
    }
}
