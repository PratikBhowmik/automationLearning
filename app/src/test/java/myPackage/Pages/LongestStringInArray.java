package myPackage.Pages;
public class LongestStringInArray {
    
    public static String longest(String str) {

        String spacesRemoved = str.trim();
        String lowercaseStr = spacesRemoved.toLowerCase();

        if (str.length() == 0) {
            return "Invalid input";
        }

        String [] arr = lowercaseStr.split(" ");
        String longest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }
        return longest;
    }
}
