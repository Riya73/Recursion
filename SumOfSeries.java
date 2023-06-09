package Recursion;
// 1/1^1 + 2 / 2 ^2 + 3 / 3^3 

public class SumOfSeries {
  static void seriesSum(int num, double sum){
    if(num == 0){
        System.out.println(sum);
        return;
    }
     seriesSum(num - 1, (num / Math.pow(num, num)) + sum);
}


static double seriesSum(int num){
    if(num == 0){
        return 0;
    }
    return (num/Math.pow(num,num))+seriesSum(num-1);
}
public static void main(String[] args){
    seriesSum(3,0);
    System.out.println(seriesSum(3));
}
}
