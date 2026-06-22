/*
git reset --hard
git clean -fd
git pull
*/
import java.util.*;

import Java.LinkedList.ListNode;
@SuppressWarnings("unused")

class Solution {
    // Given a list of pairs, sort it using merge sort
    public List<Pair> mergeSort(List<Pair> pairs) {
        mergeSortRec(pairs, 0, pairs.size() - 1);
        return pairs;
    }

    /*
    Recursive function
    Take the list and break it up into smaller pieces
    If the piece is not valid or size 1, pop out and do the right subarray
    Once you pop out of the right subarray, you will initially have two one element arrays
    Merge them by putting them in order
    When you are merging the bigger lists, keep two pointers and iterate through them to sort them
     */
    private void mergeSortRec(List<Pair> pairs, int s, int e){
        if(s >= e){
            return;
        }

        int mid = ((e - s) / 2) + s;
        mergeSortRec(pairs, s, mid);
        mergeSortRec(pairs, mid + 1, e);
        merge(pairs, s, mid, mid + 1, e);

        return;
    }

    private void merge(List<Pair> pairs, int s1, int e1, int s2, int e2){
        List<Pair> a = pairs.subList(s1, e1);
        List<Pair> b = pairs.subList(s2, e2);
        int i = 0, j = 0;
        while(int i < a.size() && j < b.size()){
            if(a.get(i) <= b.get(j)){
                int tmp = pairs.get(i + j)
                
            }
        }
    }
}

class Pair {
    public int key;
    public String value;

    public Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
}