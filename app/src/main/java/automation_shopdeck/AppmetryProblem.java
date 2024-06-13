package automation_shopdeck;

import java.util.HashMap;
import java.util.Map;

public class AppmetryProblem {
    
    public static Map<Character, Integer> checkPalindrome(String input) {
        Map<Character, Integer> mp = new HashMap<>();
        for (Character c : input.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        return mp;
    }
}
