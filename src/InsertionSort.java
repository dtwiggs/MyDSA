public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {12, 11, 13, 5, 6};
        int[] sortedArr = sorter.insertionSort(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
    
    public int[] insertionSort(int[] a){
        return insertionSortRec(a, a.length);
    }

    private static int[] insertionSortRec(int[] a, int n){
        if(n <= 1){
        } else{
            insertionSortRec(a, n - 1);
            insert(a, n - 1, a[n - 1]);
        }
        return a;
    }

    private static void insert(int[] a, int n, int val){
        if (n == 0 || val >= a[n - 1]) {
            a[n] = val;
        } else {
            a[n] = a[n - 1];
            insert(a, n - 1, val);
        }
    }

}
