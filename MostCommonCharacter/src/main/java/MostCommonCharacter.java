import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        char maxChar = ' ';
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                maxChar = c;
            }
        } 
        
        
        return maxChar;
        
        //return ' ';
    }
}
