import java.util.*;

    public class InsertionSort {
        public int[] sort(int[] array) {
            for (int i = 0; i < array.length; i ++) {
	            for (int j = i; j > 0 && array[j] < array[j-1]; j--) { 
		            swap(array,j,j-1);
                }
            }
        return array; 
    }

    public void swap (int[] array,int a,int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array .length; i++) {
            System.out.println (array[i]);
        }
    }

    public static void main(String[] args) {
        InsertionSort a = new InsertionSort();
        int[] array = {1, 2, 4, 5, 3, 7, 8, 10, 11, 9, 6};
        a.sort(array);
        a.printArray(array);
    }

} 