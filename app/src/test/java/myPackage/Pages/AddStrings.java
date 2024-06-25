package myPackage.Pages;

public class AddStrings {
    public static String addStrings(String num1, String num2) {

        if (!num1.matches("\\d+") || !num2.matches("\\d+")) {
            return "Enter only numbers!";
        }

        int maxlength = Math.max(num1.length(), num2.length());
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        for (int k = maxlength; k >= 1; k--) {

            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {
                digit1 = num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                digit2 = num2.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

}
