import java.util.HashMap;

class LRUCache {
    HashMap<Integer, Integer> map;
    int capacity;
    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.isEmpty()){
            return -1;
        } else if(!map.containsKey(key)){
            return -1;
        } else{
            return map.get(key);
        }
    }
    
    public void put(int key, int value) {
        if(map.size() == capacity){
            
        }
        map.put(key, value);
    }
}