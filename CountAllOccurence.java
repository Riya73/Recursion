package Recursion;

public class CountAllOccurence {
    static int countAll(int[] arr, int index, int element){
        if(index < 0){
            return 0;
        }
        if(arr[index] == element){
            return 1 + countAll(arr,index-1, element);
        }
        return countAll(arr, index-1, element);
    }

    static void countAll1(int[] arr, int index, int element, int count){
        if(index<0){
            System.out.println(count);
            return;
        }
        if(arr[index] == element){
            count++;
        }
         countAll1(arr, index-1, element, count);
    }
    public static void main(String[] args){
        int[] arr = {3,6,3,4,3,2};
        System.out.println(countAll(arr, arr.length-1, 3));

        countAll1(arr, arr.length-1, 4, 0); //initial count will be zero
    }
}

