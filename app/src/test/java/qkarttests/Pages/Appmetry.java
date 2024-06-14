package qkarttests.Pages;
import java.util.*;

public class Appmetry {

    public static Boolean canFormPalindrome(String str) {

        // Create a hashmap to count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Count how many characters have an odd frequency
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        
        // A string can form a palindrome if it has at most one character with an odd frequency
        // A string can form palindrome if it has same chanracter two times
        //MADAM
        //BABA
        return oddCount <= 1;
    }
}
