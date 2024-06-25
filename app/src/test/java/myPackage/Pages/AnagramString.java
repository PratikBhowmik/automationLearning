package myPackage.Pages;

import java.util.Arrays;

public class AnagramString {

    public static boolean function(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char[] arr1 = a.trim().toLowerCase().toCharArray();
        char[] arr2 = b.trim().toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        }

        return false;
    }

}
