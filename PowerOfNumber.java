package Recursion;

public class PowerOfNumber {
    static void pon(int base, int expo, int res){
        if(expo == 0){
            System.out.println(res);
            return;
        }
        pon(base, expo-1, res*base);
    }

    static int pon(int base, int expo){
        if(expo == 0){
            return 1;
        }
        return base * pon(base, expo-1);
    }
    public static void main(String[] args) {
        pon(2,4,1);
        System.out.println(pon(2,4));
    }
}
