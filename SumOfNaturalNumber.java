package Recursion;
//sum of n natural number

public class SumOfNaturalNumber{
    static void son(int num, int sum){
        if(num == 0){
            System.out.println(sum);
            return;
        }
        son(num-1, sum+num);
    }

     static int son(int num) {
        if (num == 0)
            return 0;
        return num + son(num - 1);
    }

    public static void main(String[] args){
        son(10, 0);
        System.out.println(son(10));
    }
}