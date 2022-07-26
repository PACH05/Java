package javaDSA.heaps;

import java.util.ArrayList;


// Zero based indexing
public class HeapImplementation {
    ArrayList<Integer> heap = new ArrayList<>();

    public void add(int num){
        heap.add(num);
        heapify(heap.size() - 1, true);
    }

    private void heapify(int index, boolean flag) {       
        if(flag){
            if(index <= 0) return;

            int parent = (index - 1)/2;
            if(heap.get(parent) > heap.get(index)){
                return;
            }
            else{
                swap(parent, index);
                heapify(parent, flag);
            }
        }
        else{
            int large = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if(left < heap.size() && heap.get(left) > heap.get(large)){
                large = left;
            }
            if(right < heap.size() && heap.get(right) > heap.get(large)){
                large = right;
            }
            if(large != index){
                swap(large, index);
                heapify(large, flag);
            }
        }
    }

    private void swap(int parent, int index) {
        int temp = heap.get(parent);
        heap.set(parent, heap.get(index));
        heap.set(index, temp);
    }
    
    public int removeEle()throws Exception{
        if(heap.size() == 0) throw new Exception("Index -1 out of bounds for Heap");
        int res = heap.get(0);
        swap(0,heap.size() - 1);
        heap.remove(heap.size() - 1);
        heapify(0, false);
        
        return res;
    }
}
