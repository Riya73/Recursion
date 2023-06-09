package Recursion;

import java.security.cert.CertPathChecker;

public class ArmstrongOrNot {
   public static int checkArmstrong(int number) {
        if (number == 0) {
            return 0;
        }
        
        int digit = number % 10;
        int cube = digit * digit * digit;
        
        return cube + checkArmstrong(number / 10);
    }
    
    public static boolean isArmstrong(int number) {
        int sum = checkArmstrong(number);
        return sum == number;
    }

    // public static void main(String[] args) {
    //     int number = 153; // Change this value to check a different number

    //     boolean isArmstrong = isArmstrong(number);
    //     System.out.println(number + " is" + (isArmstrong ? "" : " not") + " an Armstrong number.");
    // }

    public static void checkArmstrong(int number, int sum, int originalNumber) {
        if (number == 0) {
            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
            return;
        }

        int digit = number % 10;
        sum += digit * digit * digit;

        checkArmstrong(number / 10, sum, originalNumber);
    }

    public static void main(String[] args) {
        int number = 135; 

        boolean isArmstrong = isArmstrong(number);
        System.out.println(number + " is" + (isArmstrong ? "" : " not") + " an Armstrong number.");
        checkArmstrong(number, 0, number);
    }

}
