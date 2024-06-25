package myPackage.Pages;

public class BackbaseJavaProblem2 {
    //Convert a string to lowercase and remove spaces and special characters

    public static String function(String input) {
        if (input.length() <= 0) {
            return "Invalid input";
        }
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
