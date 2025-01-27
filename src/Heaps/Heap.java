package Heaps;
import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap;

    Heap(){
        heap = new ArrayList<>();
    }

    public void push(int val){
        heap.add(val);
        if(heap.size() == 1){
            return;
        }

        int childIndex = heap.size() - 1;
        while(val < heap.get(childIndex / 2)){
            heap.set(childIndex, heap.get(childIndex / 2));
            heap.set(childIndex / 2, val);
            childIndex = childIndex / 2;
        }
    }

    public int top(){
        return heap.get(0);
    }

    public int pop(){
        int top = heap.get(0);
        int childIndex = 1;

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        while(childIndex < heap.size()){
            if((childIndex + 1) < heap.size() 
                && heap.get(childIndex + 1) < heap.get(childIndex) 
                && heap.get(childIndex / 2) < heap.get(childIndex + 1)){

                heap.set((childIndex / 2), heap.get(childIndex + 1));
                heap.set(childIndex + 1, top);
                childIndex *= 2;
            } else if(heap.get(childIndex / 2) < heap.get(childIndex)){
                heap.set((childIndex / 2), heap.get(childIndex));
                heap.set(childIndex, top);
                childIndex *= 2;
            } else{
                break;
            }
        }
        
        return top;
    }

    public void heapify(int[] a){
        for(int i = (a.length - 1) / 2; i >= 0; i--){
            int childIndex = i * 2 + 1;

            while(childIndex <= (a.length - 1) / 2){
                if((childIndex + 1) < a.length
                    && a[childIndex + 1] < a[childIndex] 
                    && a[childIndex / 2] < a[childIndex + 1]){
                    int tmp = a[i];
                    a[childIndex / 2] = a[childIndex + 1];
                    a[childIndex + 1] = tmp;
                    childIndex *= 2;
                } else if(a[childIndex / 2] < a[childIndex]){
                    int tmp = a[i];
                    a[childIndex / 2] = a[childIndex];
                    a[childIndex] = tmp;
                    childIndex *= 2;
                }
            }
        }
    }

}