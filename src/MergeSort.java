import java.util.Arrays;

public class MergeSort {
    
    public static void main(String[] args){
        MergeSort sorter = new MergeSort();
        int[] array = {2, 1, 3, 5, 3, 6, 7, 3, 17, 3, 6, 5};
        int[] sortedArray = sorter.mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    public int[] mergeSort(int[] a){
        return mergeSortRec(a, 0, a.length - 1);
    }

    private int[] mergeSortRec(int[] a, int left, int right){

        if(left < right){
            int mid = (left + right)/2; //ie left = 0, right = 12, mid = 6, rounds down
            mergeSortRec(a, left, mid);
            mergeSortRec(a, mid + 1, right);
            merge(a, left, mid, right);
        }

        return a;
    }

    private void merge(int[] a, int lf, int m, int rt){
        
        int n1 = m + 1 - lf;
        int n2 = rt - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = a[lf + i];
        }
        for (int j = 0; j < n2; j++){
            R[j] = a[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = lf;

        while(i < n1 && j < n2){
            if(L[i] < R[j]){
                a[k] = L[i];
                i++;
            } else{
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
}
