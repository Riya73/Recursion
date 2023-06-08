package Recursion;

public class ZeroCounter {
        // Count zero in given number
        public static void main(String[] args) {
            System.out.println(countZeroes(1240040));
            countZeroes(15004040, 0);
        }
    
        static int countZeroes(int num) {
            if (num == 0) {
                return 0;
            }
            int count = countZeroes(num / 10);
            if (num % 10 == 0) {
                return 1 + count;
            }
            return count;
        }
    
        static void countZeroes(int num, int count) {
            if (num == 0) {
                System.out.println(count);
                return;
            }
            if (num % 10 == 0) {
                countZeroes(num / 10, 1 + count);
            } else {
                countZeroes(num / 10, count);
            }
        }
}
