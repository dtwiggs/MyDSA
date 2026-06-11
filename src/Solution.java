/*
git reset --hard
git clean -fd
git pull
*/
import java.util.*;

import Java.LinkedList.ListNode;
@SuppressWarnings("unused")

class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        mergeSortRec(pairs, 0, pairs.size() - 1);
    }

    private List<Pair> mergeSortRec(List<Pair> pairs, int s, int e){
        if(s >= e){
            return pairs;
        }

        int mid = (e - s) / 2 + s;
        mergeSortRec(pairs, s, mid);
        mergeSortRec(pairs, mid + 1, e);
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