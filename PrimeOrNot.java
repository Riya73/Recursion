package Recursion;

public class PrimeOrNot{
    static boolean isPrime(int num, int divisor){
       if(num<=1){
        return false;
       }
       if(divisor == 1){
        return true;
       }
       if(num%divisor == 0){
        return false;
       }
        return isPrime(num, divisor-1);
}   

static boolean isPrime(int num){
    if(num<=1){
        return false;
        }
        return isPrime(num, num-1);
}
public static void main(String[] args) {
    int num = 10;
    int divisor = 2;
    if(isPrime(num, divisor)){
        System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
            }
    int n = 13;
    if(isPrime(n)){
        System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
            }
} 
}