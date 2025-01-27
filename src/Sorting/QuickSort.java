package Sorting;
public class QuickSort {
    
    public int[] quickSort(int[] a){
        quickSortRec(a, 0, a.length - 1);
        return a;
    }

    private static int[] quickSortRec(int[] a, int s, int e){
        if(e - s < 1){
        } else{
            int pivot = a[e];
            int left = s;

            for(int i = s; i < e; i++){
                if(a[i] < pivot){
                    int temp = a[left];
                    a[left] = a[i];
                    a[i] = temp;
                    left++;
                }
            }
            a[e] = a[left];
            a[left] = pivot;
            quickSortRec(a, s, left - 1);
            quickSortRec(a, left + 1, e);
        }
        return a;
    }
}