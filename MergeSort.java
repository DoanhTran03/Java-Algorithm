import java.util.Scanner;
public class MergeSort {

    public int[] sort(int[] array) {
        // printArray(array);
        // System.out.println("Array:");
        if (array.length > 1) {
        int[] arrayl = takeLeft(array);
        int[] arrayr = takeRight(array);
        int[] a = sort(arrayl);
        int[] b = sort(arrayr);
        return merge(a,b);
        }
        return array;
    }

    public int[] takeLeft (int[] array) {
    int[] a = new int[array.length/2];
    for(int i = 0; i < array.length/2;i ++) {
        a[i] = array[i]; 
    }
    return a;
    }

    public int[] takeRight (int[] array) {
        int[] a = new int[array.length - array.length/2];
        int j = 0;
        for(int i = array.length/2; i < array.length;i ++) {
            a[j] = array[i];
            j++; 
    }
    return a;
    }

    public int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int z = 0;
        int[] c = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if(a[i] <= b[j]) {
                c[z] = a[i];
                i++;
                z++;
            }else{
                c[z] = b[j];
                j++;
                z++;
            }
        }
        while (i < a.length) {
            c[z] = a[i];
                i++;
                z++;
        }
        while (j < b.length) {
            c[z] = b[j];
                j++;
                z++;
        }
        return c;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] a = {6,4,5,2,1};
        int[] c = m.sort(a);
        m.printArray(c);
    }
}