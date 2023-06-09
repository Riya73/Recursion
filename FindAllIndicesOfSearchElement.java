package Recursion;

public class FindAllIndicesOfSearchElement {
     static int[] findAllIndices(int[] arr, int index, int element, int[] indices, int count) {
        if (index < 0) {
            int[] result = new int[count];
            for (int i = 0; i < count; i++) {
                result[i] = indices[i];
            }
            return result;
        }
        if (arr[index] == element) {
            indices[count] = index;
            count++;
        }
        return findAllIndices(arr, index - 1, element, indices, count);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,2,2,6,2,7,2,3,6};
        int[] indices = new int[arr.length];
        int[] result = findAllIndices(arr, arr.length - 1, 2, indices, 0);
        for(int index: result){
            System.out.print(index + " ");
        }
    }
}
