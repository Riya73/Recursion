package Recursion;

public class ReplaceAllOccurence {
    static void replaceElement(int[] arr, int index, int element, int replace_with){
        if(index > arr.length-1){
            return;
        }
        if(arr[index] == element){
            arr[index] = replace_with;
            replaceElement(arr, index+1, element, replace_with);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 5, 4, 5, 6};
        replaceElement(arr, 0, 5, 0);
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
