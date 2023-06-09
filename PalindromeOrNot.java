package Recursion;

public class PalindromeOrNot {
        public static int checkPalindrome(String str, int start, int end) {
        if (start >= end) {
            return 1;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return 0;
        }

        return checkPalindrome(str, start + 1, end - 1);
    }

    public static void checkPalindrome(String str) {
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "abcdcba"; 
        checkPalindrome(str);

         int result = checkPalindrome(str, 0, str.length() - 1);

        if (result == 1) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
