import java.util.HashMap;
import java.util.Map;

public class problem10 {
    // Valid ANAGRAM
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println(validAnagram("anagram", "nagaram"));  // true
        System.out.println(validAnagram("rat", "car"));          // false
        System.out.println();
    }
}

// learn the ascii val of a,A,/, , backspace, enter, null , tab, 0-9
