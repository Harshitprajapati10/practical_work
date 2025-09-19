import java.util.HashMap;
import java.util.Map;

public class problem10 {

    public static boolean validAnagram(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Use HashMap to store character counts
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // Count characters in the second string
        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Compare both maps
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println(validAnagram("anagram", "nagaram"));  // true
        System.out.println(validAnagram("rat", "car"));          // false
    }
}
