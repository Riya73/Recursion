package Recursion;

public class SearchFromLast {
    static int search(int[] arr, int index, int element){
        if(index == -1){
            return -1;
        }
        if(arr[index] == element){
            return index;
        }
        return search(arr, index-1, element);
    }

    static void search1(int[] arr, int index, int element){
        if(index == -1){
            System.out.println("Element not found");
            return;
        }
        if(arr[index] == element){
            System.out.println("Element found at index: "+index);
            return;
        }
        search1(arr, index-1, element);
    }
public static void main(String[] args) {
    int [] arr = {1,3,2,4,5,9};
    int index = search(arr, arr.length-1, 4);
    if(index == -1){
        System.out.println("Element not found");
    }
    else{
        System.out.println("Element found at index: "+index);
    }
    search1(arr, arr.length-1, 5);
}
}
