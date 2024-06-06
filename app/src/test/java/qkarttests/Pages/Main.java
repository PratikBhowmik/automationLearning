package qkarttests.Pages;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String original = "AABBc";
        
        Map<Character,Integer> mp = new HashMap<>();

        for (int i = 0; i < original.length(); i++) {
            if (mp.containsKey(original.charAt(i))) {
                mp.put(original.charAt(i), mp.get(original.charAt(i))+1);
            } else {
                mp.put(original.charAt(i), 1);
            }
        }

        for (Map.Entry<Character,Integer> mpel : mp.entrySet()) {
            if (mpel.getValue() > 1) {
                System.out.println(mpel.getKey()+ ", count = "+mpel.getValue());
            }
            
        }

    }
}
