public class QuickSort {
    public void sort(int[] array, int low, int high) {
        if (low < high){
            int pivot_index = sortPivot(array,low,high);
            sort(array, low, pivot_index-1);
            sort(array, pivot_index+1, high);
        }
    }
    public int sortPivot (int[] array,int low,int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap (array,i,j);
            }
        }
        swap(array,i+1,high);
        return i+1;
    }

    public void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println (array[i]);
        }
    }
    public void swap(int[] array,int a,int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] array = {11, 2, 4, 5, 3, 7, 8, 10, 11, 9, 6};
        q.sort(array,0,10);
        q.printArray(array);
    }
}