class RandomizedSet {

    List<Integer> values;
    Map<Integer,Integer> map;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        values = new ArrayList<>();
        map = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) 
            return false;
        
        map.put(val, values.size());  
        values.add(val);
        
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int last = values.get(values.size()-1);
            int ix = map.get(val);
            
            values.set(ix,last);
            map.put(last,ix);
            
            values.remove(values.size()-1);
            map.remove(val);
            
            return true;
        }
        
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r = new Random();
        
        return values.get(r.nextInt(values.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
