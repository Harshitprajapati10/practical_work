public class problem9{
    public static void main(String[] args) {
        // p9 -> WAF that returns the first non-repeated character in a string. If there are no repeated characters, return null.
        System.out.println("Hello World");
        String str = "swissiw";
        Character result = firstNonRepeatedCharacter(str);
        if (result != null) {
            System.out.println("The first non-repeated character in \"" + str + "\" is: " + result);
        } else {
            System.out.println("There are no non-repeated characters in \"" + str + "\".");
        }
    }

    public static Character firstNonRepeatedCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return null;
    }
    
}
